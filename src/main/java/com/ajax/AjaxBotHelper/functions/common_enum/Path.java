package com.ajax.AjaxBotHelper.functions.common_enum;

public enum Path {

    DownloadedLog("src/main/resources/Downloaded Log/"),
    DownloadedPhoto("src/main/resources/Downloaded Photo/"),
    DownloadedFilesLog("src/main/resources/logs"),
    ThisIsIOS("Это логи iOS приложения, подставляю пароль." + "\n" + "Все файлы перенес в папку iOS' Logs."),
    ThisIsAndroid("Это логи Android приложения, подставляю пароль." + "\n" + "Все файлы перенес в папку Android's Logs."),
    DeleteFile("Удалил файл "),
    FailAddPass("Подставить пароль не удалось так как это архив не из Ajax App"),
    StartSetPass("Начинаю подстановку пароля для открытия архива "),
    Android("Android"),
    iOS("iOS"),
    Null("null"),
    Slash("/"),
    Empty(""),
    FailFindDownloadedLogs("Архив логов не обнаруженно в папке Downloaded Log!");


    private final String Path;

    Path(String P) {
        Path = P;

    }

    public String getString() {
        return Path;
    }

}
