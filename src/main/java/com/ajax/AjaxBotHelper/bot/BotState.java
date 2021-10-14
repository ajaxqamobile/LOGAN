package com.ajax.AjaxBotHelper.bot;

import com.ajax.AjaxBotHelper.functions.array_info.LogsInfo;
import com.ajax.AjaxBotHelper.functions.base_page.BasePage;
import com.ajax.AjaxBotHelper.functions.delete_files.DelLogs;
import com.ajax.AjaxBotHelper.functions.delete_files.DelPhoto;
import net.lingala.zip4j.exception.ZipException;
import org.telegram.telegrambots.meta.api.methods.send.SendDocument;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.send.SendVideo;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardRemove;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public enum BotState {


    Start {
        private BotState next;
        String id = "";
        final SaveDocument saveDocument = new SaveDocument();

        @Override
        public void enter(BotContext context) {
            if (context.getMessage().hasText() & context.getUser().getStateId() == 1) {
                if (!context.getMessage().getText().equals("/start")) {
                    sendMessageWithButton(context, "Здравствуйте, для начала заполнения баг формы нажмите /start или прикрепите лог файл:", 3);

                } else if (context.getMessage().getText() == null) {
                    sendMessageWithButton(context, "Здравствуйте, для начала заполнения баг формы нажмите /start или прикрепите лог файл:", 3);
                } else if (context.getMessage().getText().equals("/start")) {
                    next = AddDocument;
                }
            } else {
                sendMessageWithButton(context, "/start", 3);
            }
        }

        @Override
        public void handleInput(BotContext context) throws IOException {
            BasePage basePage = new BasePage();
            if (context.getMessage().hasText()) {
                next = AddDocument;
            } else if (context.getMessage().hasDocument() && context.getMessage().getDocument().getFileName().contains(".zip")) {
                id = context.getMessage().getDocument().getFileId();
                saveDocument.download(id, ".zip", context);
                context.getUser().setLogFileName(context.getMessage().getDocument().getFileName());
                try {
                    new BasePage();
                    basePage.startLog(context);
                } catch (ZipException e) {
                    e.printStackTrace();
                }
                if (!context.getUser().getSnap().isEmpty() & context.getUser().getSnap().equals("null")) {
                    sendMessage(context, "Непредвиденная ошибка разархивирования логов, возможно архив поврежден! Попробуйте отправить новые логи!");
                    next = AddDocument;
                } else {
                    next = Description;
                }
            } else if (context.getMessage().getText() == null) {
                next = Start;
            } else {
                next = Start;
            }
        }

        @Override
        public BotState nextState() {
            return next;
        }
    },

    AddDocument {
        private BotState next;
        String id = "";
        final SaveDocument saveDocument = new SaveDocument();

        @Override
        public void enter(BotContext context) {
            sendMessageWithButton(context, "Прикрепите лог файл:", 2);
        }

        @Override
        public void handleInput(BotContext context) throws IOException {
            BasePage basePage = new BasePage();
            if (context.getMessage().hasDocument() && context.getMessage().getDocument().getFileName().contains(".zip")) {
                id = context.getMessage().getDocument().getFileId();
                saveDocument.download(id, ".zip", context);
                context.getUser().setLogFileName(context.getMessage().getDocument().getFileName());
                try {
                    basePage.startLog(context);
                } catch (ZipException e) {
                    e.printStackTrace();
                }
                if (!context.getUser().getSnap().isEmpty() & context.getUser().getSnap().equals("null")) {
                    sendMessage(context, "Непредвиденная ошибка разархивирования логов, возможно архив поврежден! Попробуйте отправить новые логи!");
                    next = AddDocument;
                } else {
                    next = Description;
                }
            } else if (context.getMessage().hasText() & context.getMessage().getText().equals("Skip ➡️")) {
                context.getUser().setLogs("null");
                context.getUser().setSnap("null");
                next = Description;
            } else {
                next = AddDocument;
            }
        }

        @Override
        public BotState nextState() {
            return next;
        }
    },

    Description {
        private BotState next;

        @Override
        public void enter(BotContext context) {
            sendMessage(context, "Опишите проблему и время когда это произошло:");
        }

        @Override
        public void handleInput(BotContext context) {
            if (context.getMessage().hasText() & !context.getMessage().getText().startsWith("/")) {
                context.getUser().setDescription(context.getMessage().getText());
                next = StepsToReproduce;
            } else {
                next = Description;
            }
        }

        @Override
        public BotState nextState() {
            return next;
        }
    },

    StepsToReproduce {
        private BotState next;

        @Override
        public void enter(BotContext context) {
            sendMessageWithButton(context, "Добавьте шаги воспроизведения:", 2);
        }

        @Override
        public void handleInput(BotContext context) {
            if (context.getMessage().hasText()) {
                if (context.getMessage().getText().equals("Skip ➡️")) {
                    context.getUser().setSteps("Шаги не указаны");
                } else {
                    context.getUser().setSteps(context.getMessage().getText());
                }
                next = AddScreenshot;
            } else {
                next = StepsToReproduce;
            }
        }

        @Override
        public BotState nextState() {
            return next;
        }
    },

    AddScreenshot {
        private BotState next;
        String id = "";
        final SaveMedia saveMedia = new SaveMedia();

        @Override
        public void enter(BotContext context) {
            sendMessageWithButton(context, "Прикрепите видео или скриншот проблемы:", 2);
        }

        @Override
        public void handleInput(BotContext context) throws IOException {
            if (context.getMessage().hasPhoto()) {
                try {
                    id = context.getMessage().getPhoto().get(2).getFileId();
                    saveMedia.download(id, ".png", context);
                    next = ChooseDivision;
                } catch (Exception e) {
                    id = context.getMessage().getPhoto().get(0).getFileId();
                    saveMedia.download(id, ".png", context);
                    next = ChooseDivision;
                }
            } else if (context.getMessage().hasVideo()) {
                id = context.getMessage().getVideo().getFileId();
                saveMedia.download(id, ".mp4", context);
                next = ChooseDivision;
            } else if (context.getMessage().hasText() && context.getMessage().getText().equals("Skip ➡️")) {
                context.getUser().setMedia("null");
                next = ChooseDivision;
            } else if (context.getMessage().hasAnimation()) {
                id = context.getMessage().getAnimation().getFileId();
                saveMedia.download(id, ".mp4", context);
                next = ChooseDivision;
            } else {
                next = AddScreenshot;
            }
        }

        @Override
        public BotState nextState() {
            return next;
        }
    },
    ChooseDivision {
        private BotState next;

        @Override
        public void enter(BotContext context) {
            sendMessageWithButton(context, "Выберите отдел:", 1);
        }

        @Override
        public void handleInput(BotContext context) {
            if (context.getMessage().hasText()) {
                switch (context.getMessage().getText()) {
                    case "Support ♻":
                        context.getUser().setDivision("Support  ♻");
                        next = Approved;
                        break;
                    case "BetaTest ⛔️":
                        context.getUser().setDivision("BetaTest ⛔️");
                        next = Approved;
                        break;
                    case "QA Team ✴":
                        context.getUser().setDivision("QA Team ✴");
                        next = Approved;
                        break;
                    default:
                        next = ChooseDivision;
                        break;
                }
            } else {
                next = ChooseDivision;
            }
        }

        @Override
        public BotState nextState() {
            return next;
        }
    },

    Approved(false) {
        private BotState next;

        @Override
        public void enter(BotContext context) {
            sendMessage(context, "Спасибо за заполненную форму!");
            try {
                sendForm(context, getUserName(context));
                DelLogs.deleteLogs(context.getUser().getChatId());
                DelPhoto.deletePhoto(context.getUser().getChatId());

            } catch (NullPointerException | TelegramApiException e) {
                e.printStackTrace();
                sendMessage(context, "Непредвиденная ошибка разархивирования логов, возможно архив поврежден! Попробуйте отправить новые логи!");
                DelLogs.deleteLogs(context.getUser().getChatId());
                DelPhoto.deletePhoto(context.getUser().getChatId());
                next = Start;
            }
            next = Start;
        }

        @Override
        public void handleInput(BotContext context) {
        }


        @Override
        public BotState nextState() {
            return next;
        }
    };


    private static BotState[] states;
    private final boolean inputNeeded;

    BotState() {
        this.inputNeeded = true;
    }

    BotState(boolean inputNeeded) {
        this.inputNeeded = inputNeeded;
    }

    public static BotState getInitialState() {
        return byId(0);
    }

    public static BotState byId(int id) {
        if (states == null) {
            states = BotState.values();
        }
        return states[id];
    }

    protected void sendMessage(BotContext context, String text) {
        SendMessage message = new SendMessage()
                .setChatId(context.getUser().getChatId())
                .setText(text);
        ReplyKeyboardRemove keyboardMarkup = new ReplyKeyboardRemove();
        message.setReplyMarkup(keyboardMarkup);
        try {
            context.getBot().execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void sendForm(BotContext context, String UserName) throws TelegramApiException {
        String chatId = "-262732771";             // Main channel
//        String chatId = "-1001463585209";         // Debug channel
        String LOG_PATH = context.getUser().getLogs();
        String userDescription = context.getUser().getDescription();
        String userSteps = context.getUser().getSteps();
        File SCREEN_PATH = new File(context.getUser().getMedia());
        String snapShot = context.getUser().getSnap();
        String snapPath = context.getUser().getSnapPath();
        String division = context.getUser().getDivision();
        String logName = context.getUser().getLogFileName();
        BotService botService = new BotService();


        SendDocument sendDocument = new SendDocument();
        SendDocument sendSnapShot = new SendDocument();
        SendPhoto sendPhoto = new SendPhoto();
        SendVideo sendVideo = new SendVideo();
        SendMessage sendMessage = new SendMessage();

        sendPhoto.setChatId(chatId);
        sendDocument.setChatId(chatId);
        sendVideo.setChatId(chatId);
        sendMessage.setChatId(chatId);
        sendSnapShot.setChatId(chatId);

        if (!snapShot.equals("null")) {
            try {
                sendMessage.setText("Канал обращения:" + "\n" + division + "\n" + "\n" + "Описание проблемы:" + "\n" + userDescription + "\n" + "\n" + "Шаги воспроизведения:" + "\n"
                        + userSteps + "\n" + "\n" + snapShot + "\n" + "\n" + "Имя Пользователя: " + UserName);
                sendPhoto.setPhoto(SCREEN_PATH);
                sendVideo.setVideo(SCREEN_PATH);
                sendSnapShot.setDocument("snapshot.xls", new FileInputStream(snapPath));
                if (botService.getFileSize(LOG_PATH) >= 50) {
                    botService.Zip(LOG_PATH, logName);
                    sendDocument.setDocument(logName, new FileInputStream(logName));
                } else {
                    sendDocument.setDocument(logName.substring(0, logName.length() - 4), new FileInputStream(LOG_PATH));
                }

            } catch (NullPointerException e) {
                e.printStackTrace();
                sendMessage.setText("Пользователь заполнил форму некорректно");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            snapShot = "Пользователь не добавил лог файл";
            sendMessage.setText("Канал обращения:" + "\n" + division + "\n" + "\n" + "Описание проблемы:" + "\n" + userDescription + "\n" + "\n" + "Шаги воспроизведения:" + "\n"
                    + userSteps + "\n" + "\n" + snapShot + "\n" + "\n" + "Имя Пользователя: " + UserName);
            sendPhoto.setPhoto(SCREEN_PATH);
            sendVideo.setVideo(SCREEN_PATH);
        }
        if (!SCREEN_PATH.getPath().equals("null") & !LOG_PATH.equals("null")) {
            try {
                context.getBot().execute(sendMessage);
                context.getBot().execute(sendDocument);
                context.getBot().execute(sendSnapShot);
                if (SCREEN_PATH.getPath().contains(".png")) {
                    context.getBot().execute(sendPhoto);
                } else {
                    context.getBot().execute(sendVideo);
                }
            } catch (TelegramApiRequestException b) {
                snapShot = "Пользователь добавил снепшот превышающий допустимое количество символов. Snapshot отправлен отдельным файлом";
                sendMessage.setText("Канал обращения:" + "\n" + division + "\n" + "\n" + "Описание проблемы:" + "\n" + userDescription + "\n" + "\n" + "Шаги воспроизведения:" + "\n"
                        + userSteps + "\n" + "\n" + snapShot + "\n" + "\n" + LogsInfo.AppsType + " " + LogsInfo.AppsVer + "\n" + "\n" + "Имя Пользователя: " + UserName);
                context.getBot().execute(sendMessage);
                context.getBot().execute(sendSnapShot);
                context.getBot().execute(sendDocument);
                if (SCREEN_PATH.getPath().contains(".png")) {
                    context.getBot().execute(sendPhoto);
                } else {
                    context.getBot().execute(sendVideo);
                }
            }
        } else if (SCREEN_PATH.getPath().equals("null") & !LOG_PATH.equals("null")) {
            try {
                context.getBot().execute(sendMessage);
                context.getBot().execute(sendDocument);
                context.getBot().execute(sendSnapShot);
            } catch (TelegramApiRequestException b) {
                snapShot = "Пользователь добавил снепшот превышающий допустимое количество символов. Snapshot отправлен отдельным файлом";
                sendMessage.setText("Канал обращения:" + "\n" + division + "\n" + "\n" + "Описание проблемы:" + "\n" + userDescription + "\n" + "\n" + "Шаги воспроизведения:" + "\n"
                        + userSteps + "\n" + "\n" + snapShot + "\n" + "\n" + LogsInfo.AppsType + " " + LogsInfo.AppsVer + "\n" + "\n" + "Имя Пользователя: " + UserName);
                context.getBot().execute(sendMessage);
                context.getBot().execute(sendSnapShot);
                context.getBot().execute(sendDocument);
            }
        } else if (!SCREEN_PATH.getPath().equals("null") & LOG_PATH.equals("null")) {
            try {
                context.getBot().execute(sendMessage);

                if (SCREEN_PATH.getPath().contains(".png")) {
                    context.getBot().execute(sendPhoto);
                } else {
                    context.getBot().execute(sendVideo);
                }
            } catch (TelegramApiRequestException b) {
                snapShot = "Пользователь добавил снепшот превышающий допустимое количество символов. Snapshot отправлен отдельным файлом";
                sendMessage.setText("Канал обращения:" + "\n" + division + "\n" + "\n" + "Описание проблемы:" + "\n" + userDescription + "\n" + "\n" + "Шаги воспроизведения:" + "\n"
                        + userSteps + "\n" + "\n" + snapShot + "\n" + "\n" + LogsInfo.AppsType + " " + LogsInfo.AppsVer + "\n" + "\n" + "Имя Пользователя: " + UserName);
                context.getBot().execute(sendMessage);
                context.getBot().execute(sendSnapShot);
                context.getBot().execute(sendDocument);
                if (SCREEN_PATH.getPath().contains(".png")) {
                    context.getBot().execute(sendPhoto);
                } else {
                    context.getBot().execute(sendVideo);
                }
            }
        } else {
            try {
                context.getBot().execute(sendMessage);
            } catch (TelegramApiRequestException b) {
                snapShot = "Пользователь добавил snapshot превышающий допустимое количество символов. Snapshot отправлен отдельным файлом";
                sendMessage.setText("Канал обращения:" + "\n" + division + "\n" + "\n" + "Описание проблемы:" + "\n" + userDescription + "\n" + "\n" + "Шаги воспроизведения:" + "\n"
                        + userSteps + "\n" + "\n" + snapShot + "\n" + "\n" + LogsInfo.AppsType + " " + LogsInfo.AppsVer + "\n" + "\n" + "Имя Пользователя: " + UserName);
                context.getBot().execute(sendMessage);
                context.getBot().execute(sendSnapShot);
                context.getBot().execute(sendDocument);
                b.printStackTrace();
            }
        }
    }


    public String getUserName(BotContext context) {
        String UserName = context.getMessage().getFrom().getUserName();
        String UserFirstName = context.getMessage().getFrom().getFirstName();
        String UserLastName = context.getMessage().getFrom().getLastName();
        if (UserName == null & UserFirstName == null & UserLastName == null) {
            UserName = "Имя не определено";
            return UserName;
        } else if (UserName == null & UserFirstName != null & UserLastName != null) {
            UserName = UserFirstName + " " + UserLastName;
            return UserName;
        }
        return "@" + UserName;
    }

    public boolean isInputNeeded() {
        return inputNeeded;
    }

    protected void sendMessageWithButton(BotContext context, String text, int groupButtons) {
        SendMessage message = new SendMessage()
                .setChatId(context.getUser().getChatId())
                .setText(text);
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup()
                .setSelective(true)
                .setResizeKeyboard(true)
                .setOneTimeKeyboard(true);
        message.setReplyMarkup(replyKeyboardMarkup);
        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow keyboardRow = new KeyboardRow();
        KeyboardRow keyboardRow1 = new KeyboardRow();
        KeyboardRow keyboardRow2 = new KeyboardRow();
        keyboardRow.add("Support ♻");
        keyboardRow.add("BetaTest ⛔️");
        keyboardRow.add("QA Team ✴");

        keyboardRow1.add("Skip ➡️");

        keyboardRow2.add("Start ⚡️⚡️");
        if (groupButtons == 1) {
            keyboardRows.add(keyboardRow);
        } else if (groupButtons == 2) {
            keyboardRows.add(keyboardRow1);
        } else if (groupButtons == 3) {
            keyboardRows.add(keyboardRow2);
        }

        replyKeyboardMarkup.setKeyboard(keyboardRows);
        try {
            context.getBot().execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void handleInput(BotContext context) throws IOException {
    }

    public abstract void enter(BotContext context) throws IOException;

    public abstract BotState nextState();

}





