package com.ajax.AjaxBotHelper.functions.app_ver;

public enum VerStr {

    Release("Release\n"),
    Biuld("\nBuild: "),
    Version("\nВерсия приложения: "),
    Dot("."),
    BracketOne("("),
    BracketTwo(")"),

    LastAppVersion("\"ajax_sdk:lastAppVersion\"");

    private final String Ver;

    VerStr(String V) {
        Ver = V;
    }

    public String getString() {
        return Ver;
    }
}

