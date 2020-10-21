package main.java.report;

import main.java.report.lists.HubTypes;
import main.java.report.lists.Phones;
import main.java.report.mainClass.Main;

import javax.swing.text.TabExpander;
import java.util.Scanner;

public class Scan {

    public static String scanText() {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        if (text.equals("")) {
            System.out.println("Не правильное значение, попробуйте еще раз");
            scanText();
        } else if (text.equals("reboot")) {
            Main.retry();
        }
        return text;
    }

    public static String scanHubType(int count) {
        String currentType = "null";
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        try {
            int i = Integer.parseInt(text);
            if (text.equals("") || i < 0 || i > count) {
                System.out.println("Не правильное значение, попробуйте еще раз");
                scanHubType(count);
            } else if (text.equals("reboot")) {
                Reporting.getReport(GetData.getBoC(), GetData.getPlatform());
            } else {
                currentType = HubTypes.hubTypes[i - 1];
            }
        } catch (NumberFormatException e) {
            Main.retry();
        }
        return currentType;
    }


    public static String scanPhone(int count, String OS) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String currentPhone = "null";
        try {
            int i = Integer.parseInt(text);
            if (text.equals("") || i < 0 || i > count) {
                System.out.println("Не правильное значение, попробуйте еще раз");
                scanPhone(count, OS);
            } else {
                i--;
                switch (OS) {
                    case "1" -> currentPhone = Phones.androidPhones[i] + "\n" + Phones.androidOS[i];
                    case "2" -> currentPhone = Phones.iOSPhones[i] + "\n" + Phones.iOSOS[i];
                }
            }
        } catch (NumberFormatException e) {
            Main.retry();
        }
        return currentPhone;
    }
}
