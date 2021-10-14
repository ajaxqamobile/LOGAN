package com.ajax.AjaxBotHelper.functions.unzip;

public enum LogsPass {

    androidPass("B0JXbsroSKkahZMN9jcZWSkOAZ0jUb47ZD46U23I"),
    iOSPassOld("Ajax.Systems~2017"),
    iOSPassNew("vDA2GMwWtVokK6EwyK8VKfTQAgn9n8EQuEVxyfBs");

    private final String Pass;

    LogsPass(String P) {
        Pass = P;
    }

    public String getPass() {
        return Pass;
    }

}
