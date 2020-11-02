package main.java.report.lists;

import main.java.report.Scan;
import main.java.report.mainClass.Main;

import java.io.IOException;

public class Phones {

    public static String currentPhone;

    public static String[] androidPhones =
            {"Samsung Galaxy S9",
                    "Xiaomi Redmi Note 7",
                    "Samsung Galaxy A5",
                    "Google Pixel 3a",
                    "Samsung Galaxy S4",
                    "Xiaomi MI A2",
                    "Nexus P6",
                    "Prestigio (PSP7505DUO)",
                    "Meizu PRO 6",
                    "Huawei P Smart",
                    "Samsung Galaxy A51"};

    public static String[] desktopPhones =
            {"MacBook Air/Pro",
            "Windows PC"};

    public static String[] androidOS =
            {"Android version: 10.0",
                    "Android version: 9.0",
                    "Android version: 5.1.1",
                    "Android version: 11.0 Beta",
                    "Android version: 5.1",
                    "Android version: 9.0",
                    "Android version: 10.0",
                    "Android version: 4.4.2",
                    "Android version: 6.0",
                    "Android version: 9.0",
                    "Android version: 10.0"};

    public static String[] iOSPhones =
            {"Apple Watch 1",
                    "Apple Watch 3",
                    "Apple Watch 5",
                    "iPhone 7",
                    "iPhone 4s",
                    "iPhone SE",
                    "iPhone X",
                    "iPhone XS",
                    "iPhone 6",
                    "iPhone 6s",
                    "iPhone SE 2020",
                    "iPhone 8 Plus"};

    public static String[] iOSOS =
            {"WatchOS version: 4.3.2",
                    "WatchOS version: 7.0",
                    "WatchOS version: 7.1 Beta",
                    "iOS version: 13.5.1",
                    "iOS version: 9.3.5",
                    "iOS version: 13.6.1",
                    "iOS version: 13.6",
                    "iOS version: 14.2 Beta",
                    "iOS version: 12.4.1",
                    "iOS version: 12.4",
                    "iOS version: 13.5.1",
                    "iOS version: 14.0"};

    public static String[] desktopOS =
            {"Desktop version: MacOS 10.15.17",
            "Desktop version: Windows 10"};

    public static String getPhone(String OS) throws IOException {
        int count = 1;
        switch (OS) {
            case "1" -> {
                for (String i : androidPhones) {
                    System.out.println(count + ": " + i);
                    count++;
                }
                currentPhone = Scan.scanPhone(count, OS);
            }
            case "2" -> {
                for (String i : iOSPhones) {
                    System.out.println(count + ": " + i);
                    count++;
                }
                currentPhone = Scan.scanPhone(count, OS);
            }

            case "3" -> {
                for (String i : desktopPhones) {
                    System.out.println(count + ": " + i);
                    count++;
                }
                currentPhone = Scan.scanPhone(count, OS);
            }

            case "reboot" -> Main.retry();
        }
        lastData.phone = currentPhone;
        return currentPhone;
    }
}