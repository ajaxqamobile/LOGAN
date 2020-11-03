package main.java.report.lists;

public enum devices {


    Door(""),
    Motion(""),
    Fire(""),
    Glass(""),
    Leak(""),
    Curtain(""),
    ReX(""),
    Combi(""),
    FirePlus(""),
    Keypad(""),
    Space(""),
    Button(""),
    MotionCam(""),
    MotionPlus(""),
    DoorPlus(""),
    Transmettir(""),
    Relay(""),
    Outdoor(""),
    StreetSiren(""),
    HomeSiren(""),
    MotionCamOutdoor(""),
    KeypadPlus(""),
    DualCurtainOutdoor(""),
    DoubleDeck(""),
    MultiTransmitter(""),
    Socket(""),
    WallSwitch(""),
    DoubleButton("");

    private final String text;

    devices(String P) {
        text = P;
    }

    public String getString() {
        return text;
    }

}
