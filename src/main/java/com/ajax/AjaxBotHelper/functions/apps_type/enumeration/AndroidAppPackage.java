package com.ajax.AjaxBotHelper.functions.apps_type.enumeration;

public enum AndroidAppPackage {

    AndroidAjaxProRus("com.ajaxsystems.pro.russia"),
    AndroidAjaxPro("com.ajaxsystems.pro"),
    AndroidAjaxRus("com.ajaxsystems.russia"),
    AndroidYavir("com.ajaxsystems.yavir"),
    AndroidBedo("com.ajaxsystems.bedo"),
    AndroidElotec("com.ajaxsystems.elotec"),
    Android3Dalarma("com.ajaxsystems.alarma3d"),
    AndroidHomeSecure("com.ajaxsystems.homesecure"),
    AndroidAjax("com.ajaxsystems"),
    AndroidEPro("com.ajaxsystems.itesa.epro"),
    Android24Sure("com.ajaxsystems.sure24"),
    AndroidTagsApp("com.ajaxsystems.tagsappplus"),
    False("NoName");

    private final String Type;

    AndroidAppPackage(String T) {
        Type = T;
    }

    public String getType() {
        return Type;
    }
}
