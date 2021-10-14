package com.ajax.AjaxBotHelper.bot;

import com.ajax.AjaxBotHelper.model.User;
import org.telegram.telegrambots.meta.api.objects.Message;

public class BotContext {
    private final ChatBot bot;
    private final User user;
    private final Message message;


    public static com.ajax.AjaxBotHelper.bot.BotContext of(ChatBot bot, User user, Message message) {
        return new com.ajax.AjaxBotHelper.bot.BotContext(bot, user, message);
    }

    private BotContext(ChatBot bot, User user, Message message) {
        this.bot = bot;
        this.user = user;
        this.message = message;


    }

    public ChatBot getBot() {
        return bot;
    }

    public User getUser() {
        return user;
    }


    public Message getMessage() {
        return message;
    }

}
