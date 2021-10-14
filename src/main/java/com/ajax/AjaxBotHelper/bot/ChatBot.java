package com.ajax.AjaxBotHelper.bot;

import com.ajax.AjaxBotHelper.functions.array_info.LogsInfo;
import com.ajax.AjaxBotHelper.model.User;
import com.ajax.AjaxBotHelper.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.IOException;

@Component
@PropertySource("classpath:telegram.properties")
public class ChatBot extends TelegramLongPollingBot {

    public static LogsInfo logsInfo = new LogsInfo();

//    private static final Logger LOGGER = (Logger) LogManager.getLogger(ChatBot.class);

    @Value("${bot.name}")
    protected String botName;

    @Value("${bot.token}")
    protected String botToken;


    private final UserService userService;

    public ChatBot(UserService userService) {
        this.userService = userService;
    }


    @Override
    public String getBotUsername() {
        return botName;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (!update.hasMessage())
            return;
        final Message message = update.getMessage();
        final long chatId = update.getMessage().getChatId();
        User user = userService.findByChatId(chatId);


        BotContext context;
        BotState state;

        if (user == null) {
            state = BotState.getInitialState();
            user = new User(chatId, state.ordinal());
            userService.addUser(user);

            context = BotContext.of(this, user, message);
            try {
                state.enter(context);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            context = BotContext.of(this, user, message);
            state = BotState.byId(user.getStateId());
        }
        try {
            state.handleInput(context);
        } catch (IOException e) {
            e.printStackTrace();
        }
        do {
            state = state.nextState();
            try {
                state.enter(context);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (!state.isInputNeeded());

        user.setStateId(state.ordinal());
        userService.updateUser(user);

    }


    public synchronized void sendMsg(Message message, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(text);
        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

}








