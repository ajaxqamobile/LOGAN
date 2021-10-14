package com.ajax.AjaxBotHelper.functions.common_enum;

public enum LogsPath {

    androidPath("src/main/resources/logs/Android's Logs/"),
    iOSPath("src/main/resources/logs/iOS' Logs/");

    private final String Path;

    LogsPath(String P) {
        Path = P;
    }

    public String getString() {
        return Path;
    }

}

