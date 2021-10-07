package main.java.report.lists;

public enum descDevices {

    Door("01 - Door"),
    Motion("02 - Motion"),
    Fire("03 - Fire"),
    Glass("04 - Glass"),
    Leak("05 - Leak"),
    Curtain("06 - Curtain"),
    ReX("07 - ReX"),
    Combi("08 - Combi"),
    FirePlus("09 - Fire Plus"),
    Keypad("0a - Keypad"),
    Space("0b - Space"),
    Button("0c - Button"),
    MotionCam("0d - Motion Cam"),
    MotionPlus("0e - Motion Plus"),
    DoorPlus("0f - Door Plus"),
    Transmitter("11 - Transmitter"),
    Relay("12 - Relay"),
    Outdoor("13 - Outdoor"),
    StreetSiren("14 - StreetSiren"),
    HomeSiren("15 - HomeSiren"),
    MotionCamOutdoor("18 - Motion Cam Outdoor"),
    KeypadPlus("19 - Keypad Plus"),
    DualCurtainOutdoor("1a - Dual Curtain Outdoor"),
    DoubleDeck("1b - DoubleDeck"),
    MultiTransmitter("1c - MultiTransmitter"),
    Socket("1e - Socket"),
    WallSwitch("1f - WallSwitch"),
    DoubleButton("42 - DoubleButton"),
    KeypadCombi("43 - Keypad Combi"),
    LightSwitch("44 - LightSwitch"),
    vhfBrigde("45 - vhfBrigde"),
    ReX2("46 - ReX2"),
    DoorFibra("61 - Door Fibra"),
    MotionFibra("62 - Motion Fibra"),
    GlassFibra("64 - Glass Fibra"),
    CombiFibra("68 - Combi Fibra"),
    KeypadFibra("6a - Keypad Fibra"),
    MotionPlusFibra("6e - Motion Plus Fibra"),
    DoorPlusFibra("6f - Door Plus Fibra"),
    StreetSirenFibra("74 - Street Siren Fibra"),
    HomeSirenFibra("75 - HomeSiren Fibra"),
    DoubleDeckFibra("7b - DoubleDeck Fibra");

    private final String text;

    descDevices(String A) {
        text = A;
    }

    public String getString() {
        return text;
    }


    public static void getAllDevices (){
        for (descDevices DeviceTypes : descDevices.values()) {
            System.out.println(DeviceTypes.getString());
        }
    }
}