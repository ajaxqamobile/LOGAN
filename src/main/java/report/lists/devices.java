package main.java.report.lists;

import main.java.report.ReportMethods;
import main.java.report.Scan;
import main.java.report.mainClass.Main;

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
    DoubleButton("42"),
    KeypadCombi("43"),
    LightSwitch("44"),
    vhfBrigde("45"),
    ReX2("46"),
    DoorFibra("61"),
    MotionFibra("62"),
    GlassFibra("64"),
    CombiFibra("68"),
    KeypadFibra("6a"),
    MotionPlusFibra("6e"),
    DoorPlusFibra("6f"),
    StreetSirenFibra("74"),
    HomeSirenFibra("75"),
    DoubleDeckFibra("7b"),;


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
                System.out.println("\nТы хочешь создать белый цвет устройства и черный цвет устройства?\n\n" +
                        "1 - Белый\n" +
                        "2 - Черный");
                String color = Scan.scanText();
                switch (color) {
                    case "1": {
                        String command = "jwl3 add " + type + " 1110" + type + ";" + "jwl3 on 1110" + type;
                        ReportMethods.clipboardIndex(command);
                        checkType = type;
                        System.out.println(command);
                        String QRlinkWhite = "http://qrcoder.ru/code/?1110" + type + type + "1&10&0";
                        java.awt.Desktop.getDesktop().browse(java.net.URI.create(QRlinkWhite));
                        checkType(type);
                        break;
                    }
                    case "2": {
                        String command = "jwl3 add " + type + " 2220" + type + ";" + "jwl3 on 2220" + type;
                        ReportMethods.clipboardIndex(command);
                        checkType = type;
                        System.out.println(command);
                        String QRlinkBlack = "http://qrcoder.ru/code/?2220" + type + type + "2&10&0";
                        java.awt.Desktop.getDesktop().browse(java.net.URI.create(QRlinkBlack));
                        checkType(type);
                        break;
                    }
                    case "-":
                        break;
                    case "reboot", "r": Main.retry();
                    break;
                    default:
                        System.out.println("\nВы ввели неправильное значение, попробуйте еще раз!\n");
                        break;
                }
            }
        }
        if (checkType.equals("null")){
            System.out.println("\nВы ввели неправильный тип датчика, попробуйте еще раз!\n");
        }
    }
    }

