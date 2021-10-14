package com.ajax.AjaxBotHelper.functions.common_enum;

public enum Static_Data {

    PhoneInfo("==Информация о телефоне=="),
    FoundFolder("Нашел папку "),
    FoundFile("Нашел файл "),
    StartToReadFile("Начинаю читать файл "),
    LogFormat(".log"),
    PhotoFormat(".jpg"),
    LookingForSnapshotFileAOS("Ищу Snapshot в папке Android's Logs/"),
    LookingForSnapshotFileIOS("Ищу Snapshot в папке iOS' Logs/"),
    LookingForFiles("Ищу файлы в папке Downloaded Log:"),
    API19("Версия API : Android 4.4 (KitKat)"),
    API21("Версия API : Android 5 (Lollipop)"),
    API22("Версия API : Android 5.1 (Lollipop)"),
    API23("Версия API : Android 6 (Marshmallow)"),
    API24("Версия API : Android 7 (Nougat)"),
    API25("Версия API : Android 7.1 (Nougat)"),
    API26("Версия API : Android 8 (Oreo)"),
    API27("Версия API : Android 8.1 (Oreo)"),
    API28("Версия API : Android 9 (Pie)"),
    API29("Версия API : Android 10 (Q)"),
    API30("Версия API : Android 11 (R)"),
    brandPhone("Бренд : "),
    manufacturingPhone("Производитель : "),
    modelPhone("Модель : "),
    ArchPhone("Архитектура : "),
    HubInfo("=========Тип Хабов========="),
    HubOne("Модель хаба: Hub"),
    HubPlus("Модель хаба: Hub Plus"),
    HubYavir("Модель хаба: Yavir"),
    HubYavirPlus("Модель хаба: Yavir Plus"),
    HubTwo("Модель хаба: Hub 2"),
    HubTwoPlus("Модель хаба: Hub 2 Plus"),
    HubVersion("Версия Hub OS: "),
    HubName("Имя хаба: "),
    HubID("ID хаба: "),
    AppleBrand("Бренд : Apple "),
    AppleManufacturer("iOS : "),
    AppleModel("Модель : "),

    HubModelFail("Модель хаба:\nИнформация отсутствует в SnapShot"),
    HubVerFail("Версия Hub OS: 0"),
    HubVerFailInfo("Версия Hub OS:\nИнформация отсутствует в SnapShot"),
    HubNameFail("Имя хаба: <Unknown HUB>"),
    HubNameFailInfo("Имя хаба:\nИнформация отсутствует в SnapShot"),

    DefualtFilePath("Путь к файлу"),
    DefualtMediaPath("Путь к медиа"),
    DefualtMediaFolder("Путь к папке с фото"),
    DefualtLogFolder("Путь к папке с логом"),

    CellHubSubType("hubSubtype"),
    CellHubVersion("firmWareVersion"),
    CellHubName("hubName"),
    CellHubID("hexObjectId"),

    CellHubSubTypeiOS("subtype"),
    CellHubVersioniOS("availableFirmwareVersion"),
    CellHubNameiOS("name"),
    CellHubIDiOS("hexPid"),

    Android("Android"),
    iOS("iOS"),

    NextLixe("\n");

    private final String Static_Data;

    Static_Data(String S) {
        Static_Data = S;

    }

    public String getString() {
        return Static_Data;
    }

}
