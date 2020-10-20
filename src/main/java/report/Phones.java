package main.java.report;

import java.awt.*;
import java.util.Scanner;

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
                    "Prestigio",
                    "Meizu PRO 6",
                    "Huawei P Smart"};

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

    public static String getPhone(String OS) {
        int count = 1;
        if (OS.equals("1")) {
            for (String i : androidPhones) {
                System.out.println(count + ": " + i);
                count++;
            }
             currentPhone = Scan.scanPhone(count,OS);
        } else if (OS.equals("2")){
            for (String i : iOSPhones) {
                System.out.println(count + ": " + i);
                count++;
            }
            currentPhone = Scan.scanPhone(count,OS);
        }
        return currentPhone;
    }
}