package main.java.report.enums;

public enum qaPhones {

    // Android =========================================================================================================
    GalaxyS9("Samsung Galaxy S9"),
    XiaomiRedmiNote7("Xiaomi Redmi Note 7"),
    SamsungGalaxyA5("Samsung Galaxy A5"),
    GooglePixel3a("Google Pixel 3a"),
    SamsungGalaxyS4("Samsung Galaxy S4"),
    XiaomiMIA2("Xiaomi MI A2"),
    XiaomiRedmiNote2("Xiaomi Redmi Note 2"),
    NexusP6("Nexus P6"),
    MeizuPRO6("Meizu PRO 6"),
    MeizuM6T("Meizu M6T"),
    HuaweiPSmart("Huawei P Smart"),
    SamsungGalaxyA51("Samsung Galaxy A51"),
    Prestigio("Prestigio (PSP7505DUO)"),
    Vivo1920("Vivo 1920"),
    GalaxyA20s("Samsung Galaxy A20s"),
    HuaweiNova5T("Huawei Nova 5T"),
    Lenovo("Lenovo"),
    Nokia5_3("Nokia 5.3"),
    MotoG8("Moto G8"),
    SamsungGalaxyM21("Samsung Galaxy M21"),

    // Android OS
    GalaxyS9_OS("Android version: 10.0"),
    XiaomiRedmiNote7_OS("Android version: 9.0"),
    SamsungGalaxyA5_OS("Android version: 5.1.1"),
    GooglePixel3a_OS("Android version: 11"),
    SamsungGalaxyS4_OS("Android version: 5.1"),
    XiaomiMIA2_OS("Android version: 10.0"),
    XiaomiRedmiNote2_OS("Android version: 5.0"),
    NexusP6_OS("Android version: 10.0"),
    Prestigio_OS("Android version: 4.4.2"),
    MeizuPRO6_OS("Android version: 6.0"),
    MeizuM6T_OS("Android version: 7.0"),
    HuaweiPSmart_OS("Android version: 9.0"),
    SamsungGalaxyA51_OS("Android version: 10.0"),
    Vivo1920_OS("Android version: 10.0"),
    HuaweiNova5T_OS("Android version: 10.0"),
    GalaxyA20s_OS("Android version: 10.0"),
    Lenovo_OS("Android version: 4.4"),
    Nokia5_3_OS("Android version: 10.0"),
    MotoG8_OS("Android version: 10.0"),
    SamsungGalaxyM21_OS("Android version: 10.0"),


    // iPhone ==========================================================================================================
    AppleWatch1("Apple Watch 1"),
    AppleWatch3("Apple Watch 3"),
    AppleWatch5("Apple Watch 5"),
    iPhone7("iPhone 7"),
    iPhone4s("iPhone 4s"),
    iPhone12ProMax("iPhone 12 Pro Max"),
    iPhoneSE("iPhone SE"),
    iPhoneX("iPhone X"),
    iPhoneXS("iPhone XS"),
    iPhone6("iPhone 6"),
    iPhone6s("iPhone 6s"),
    iPhone12mini("iPhone 12 mini"),
    iPhoneSE2020("iPhone SE 2020"),
    iPhoneXR("iPhone XR"),
    iPhone8Plus("iPhone 8 Plus"),

    //iOS
    AppleWatch1_OS("WatchOS version: 4.3.2"),
    AppleWatch3_OS("WatchOS version: 7.3"),
    AppleWatch5_OS("WatchOS version: 7.4 Beta"),
    iPhone7_OS("iOS version: 14.4"),
    iPhone4s_OS("iOS version: 9.3.5"),
    iPhone12ProMax_OS("iOS version: 14.4"),
    iPhoneSE_OS("iOS version: 13.6.1"),
    iPhoneX_OS("iOS version: 13.6"),
    iPhoneXS_OS("iOS version: 14.5 Beta"),
    iPhone6_OS("iOS version: 12.4.1"),
    iPhone6s_OS("iOS version: 12.4"),
    iPhone12mini_OS("iOS version: 14.5 Beta"),
    iPhoneSE2020_OS("iOS version: 13.5.1"),
    iPhoneXR_OS("iOS version: 14.2"),
    iPhone8Plus_OS("iOS version: 14.2"),

    // PC ==============================================================================================================
    MacBook("MacBook Air/Pro"),
    WindowsPC("Windows PC"),

    // PC OS
    MacBook_OS("Desktop version: macOS Big Sur 12 Beta"),
    WindowsPC_OS("Desktop version: Windows 10");

    //==================================================================================================================

    private final String text;

    qaPhones(String P) {
        text = P;
    }

    public String getString() {
        return text;
    }

}
