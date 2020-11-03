package main.java.report.lists;

import main.java.report.ReportMethods;
import main.java.report.Scan;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

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
    Keypad("0A"),
    Space("0B"),
    Button("0C"),
    MotionCam("0D"),
    MotionPlus("0E"),
    DoorPlus("0F"),
    Transmettir("11"),
    Relay("12"),
    Outdoor("13"),
    StreetSiren("14"),
    HomeSiren("15"),
    MotionCamOutdoor("18"),
    KeypadPlus("19"),
    DualCurtainOutdoor("1A"),
    DoubleDeck("1B"),
    MultiTransmitter("1C"),
    Socket("1E"),
    WallSwitch("1F"),
    DoubleButton("42");

    private final String text;

    devices(String P) {
        text = P;
    }

    public String getString() {
        return text;
    }


    public static void checkType () throws IOException, InterruptedException {
        String  type = Scan.scanText();
        for (devices EnumTypes : devices.values()) {
            if (EnumTypes.getString().equals(type)){
                String command = "jwl3 add "+type+" 1110"+type+";"+"jwl3 on 1110"+type;
                System.out.println(command);
                ReportMethods.clipboardIndex(command);
                break;
            } else {
                System.out.println("This type of sensor does not exist! " +
                        "Try again!");
               checkType();
            }
            break;
        }
    }
}
