package main.java.report.enums;

public enum qaPhones {

    GalaxyS9("Samsung Galaxy S9"),
    XiaomiRedmiNote7("Xiaomi Redmi Note 7"),
    SamsungGalaxyA5("Samsung Galaxy A5"),
    GooglePixel3a("Google Pixel 3a"),
    SamsungGalaxyS4("Samsung Galaxy S4"),
    XiaomiMIA2("Xiaomi MI A2"),
    NexusP6("Nexus P6"),
    Prestigio("Prestigio (PSP7505DUO)"),
    MeizuPRO6("Meizu PRO 6"),
    HuaweiPSmart("Huawei P Smart"),
    SamsungGalaxyA51("Samsung Galaxy A51"),
    Vivo1920("Vivo 1920"),
    AppleWatch1("Apple Watch 1"),
    AppleWatch3("Apple Watch 3"),
    AppleWatch5("Apple Watch 5"),
    iPhone7("iPhone 7"),
    iPhone4s("iPhone 4s"),
    iPhoneSE("iPhone SE"),
    iPhoneX("iPhone X"),
    iPhoneXS("iPhone XS"),
    iPhone6("iPhone 6"),
    iPhone6s("iPhone 6s"),
    iPhoneSE2020("iPhone SE 2020"),
    iPhoneXR("iPhone XR"),
    iPhone8Plus("iPhone 8 Plus"),
    MacBook("MacBook Air/Pro"),
    WindowsPC("Windows PC");

    private final String text;

    qaPhones(String P) {
        text = P;
    }

    public String getString() {
        return text;
    }

}
