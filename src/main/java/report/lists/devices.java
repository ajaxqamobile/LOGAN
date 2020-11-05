package main.java.report.lists;

import main.java.report.ReportMethods;
import main.java.report.Scan;

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
String checkType = "null";
        for (devices EnumTypes : devices.values()) {
            if ((EnumTypes.getString()).equals(type)) {
                System.out.println("\nDo you watch White ob Black color?\n\n" +
                        "1 - While\n" +
                        "2 - Black");
                String color = Scan.scanText();
                if (color.equals("1")){
                    String command = "jwl3 add " + type + " 1110" + type + ";" + "jwl3 on 1110" + type;
                    ReportMethods.clipboardIndex(command);
                    checkType = type;
                    System.out.println(command);
                    String QRlinkWhite = "http://qrcoder.ru/code/?1110"+type+type+"1&10&0";
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(QRlinkWhite));
                } else if (color.equals("2")){
                    String command = "jwl3 add " + type + " 2220" + type + ";" + "jwl3 on 2220" + type;
                    ReportMethods.clipboardIndex(command);
                    checkType = type;
                    System.out.println(command);
                    String QRlinkBlack = "http://qrcoder.ru/code/?2220"+type+type+"2&10&0";
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(QRlinkBlack));
                } else {
                    System.out.println("\nYou entered the wrong value, please try again!");
                }
            }
        }
        if (checkType.equals("null")){
            System.out.println("\nYou entered the wrong sensor type, please try again!");
        }
    }
    }

