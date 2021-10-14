package com.ajax.AjaxBotHelper.functions.apps_type.enumeration;

public enum AppType {

    Ajax("Ajax"),
    AjaxPro("Ajax Pro"),
    AjaxRu("Ajax Russia"),
    AjaxRuPro("Ajax Russia Pro"),

    Yavir("Yavir 2000"),
    Bedo("Bedo"),
    Alarma3d("3D Alarma"),
    Elotec("Elotec"),
    HomeSecure("HomeSecure"),
    EPro("E-Pro"),
    Sure24("24SURE"),
    TagsApp("TagsApp+"),

    TypeApp("=======Тип Приложения======" + "\n" + "\n" + "Приложение: "),
    Failed("=======Тип Приложения======" + "\n" + "\n" + "Не удалось определить"),

    Space(" ");

    private final String Type;

    AppType(String T) {
        Type = T;

    }

    public String getString() {
        return Type;
    }
}
