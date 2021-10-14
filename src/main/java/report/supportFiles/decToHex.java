package main.java.report.supportFiles;

import main.java.report.enums.ReportElements;

public class decToHex {

    public static String hubToHex(int num) {
        return Integer.toHexString(num);
    }

    public static String checkFirst(String item) {
        int num = Integer.parseInt(item);
        return String.valueOf(num);
    }

    public static String deviceToHex(int num) {

        int a = num / 1000000;
        int b = (num / 10000) % 100;
        int c = (num / 100) % 100;
        int d = num % 100;

        System.out.println(a + "\n" + b + "\n" + c + "\n" + d);

        String a_HEX = checkFirst((Integer.toHexString(a)));
        String b_HEX = (Integer.toHexString(b));
        String c_HEX = (Integer.toHexString(c));
        String d_HEX = (Integer.toHexString(d));

        return (a_HEX + b_HEX + c_HEX + d_HEX);
    }

    public static void startHEX() {
        try {
            int str = Integer.parseInt(Scan.scanText());
            int count = String.valueOf(Math.abs(str)).length();
            String readyHex;
            if (count == 6) {
                readyHex = decToHex.hubToHex(str);
                ReportMethods.clipboardIndex(readyHex);
                System.out.println("Это твой HEX = " + readyHex);
            } else if (count == 7) {
                readyHex = decToHex.deviceToHex(str);
                ReportMethods.clipboardIndex(readyHex);
                System.out.println("Это твой HEX = " + readyHex);
            } else {
                System.out.println(ReportElements.Space50.getString());
                System.out.println("\nНеверный пароль, попробуйте еще раз!\n");
            }
            System.out.println(ReportElements.Space50.getString());
        } catch (Exception ignored) {
        }
    }
}