package main.java.report.lists;

import main.java.report.ReportMethods;

import java.io.IOException;

public enum devices {

    Door("01"),
    Motion("02"),
    Fire("03"),
    Glass("04"),
    Leak("05"),
    Curtain("06"),
    ReX("07"),
    Combi("08"),
    FirePlus("09"),
    Keypad("0a"),
    Space("0b"),
    Button("0c"),
    MotionCam("0d"),
    MotionPlus("0e"),
    DoorPlus("0f"),
    Transmitter("11"),
    Relay("12"),
    Outdoor("13"),
    StreetSiren("14"),
    HomeSiren("15"),
    MotionCamOutdoor("18"),
    KeypadPlus("19"),
    DualCurtainOutdoor("1a"),
    DoubleDeck("1b"),
    MultiTransmitter("1c"),
    Socket("1e"),
    WallSwitch("1f"),
    DoubleButton("42");

    private final String text;

    devices(String A) {
        text = A;
    }

    public String getString() {
        return text;
    }


    public static void checkType(String type) throws IOException, InterruptedException {

        for (devices EnumTypes : devices.values()) {
            if ((EnumTypes.getString()).equals(type)) {
                String command = "jwl3 add " + type + " 1110" + type + ";" + "jwl3 on 1110" + type;
                ReportMethods.clipboardIndex(command);
                System.out.println(command);
            }
        }
    }
    }

