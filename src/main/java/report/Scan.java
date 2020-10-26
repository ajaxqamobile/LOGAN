package main.java.report;

import main.java.report.enums.ReportElements;
import main.java.report.lists.HubTypes;
import main.java.report.lists.Phones;
import main.java.report.lists.lastData;
import main.java.report.mainClass.Main;

import java.util.Scanner;

public class Scan {

    public static String scanHubName() {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        if (text.equals("")) {
            System.out.println("Не правильное значение, попробуйте еще раз");
            scanHubName();
        } else if (text.equals("reboot")) {
            Main.retry();
        } if (text.equals("last")&& lastData.hubName.equals("null")) {
            System.out.println("Вы ранее не сохраняли имя хаба, введите актуальное имя");
            scanHubName();
        }  if (text.equals("last")&& !(lastData.hubName.equals("null"))) {
            text = lastData.hubName;
        }
        if (lastData.hubName.equals("null")) {
            return lastData.hubName = text;
        }
        else {
            return lastData.hubName;
        }
    }

    public static String scanHubVer() {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        if (text.equals("")) {
            System.out.println("Не правильное значение, попробуйте еще раз");
            scanHubVer();
        } else if (text.equals("reboot")) {
            Main.retry();
        }  if (text.equals("last")&& lastData.hubVer.equals("null")) {
            System.out.println("Вы ранее не сохраняли версию хаба, введите актуальную версию хаба");
            scanHubVer();
        }  if (text.equals("last")&& !(lastData.hubVer.equals("null"))) {
            text = lastData.hubVer;
        }


        if (lastData.hubVer.equals("null")) {
            return lastData.hubVer = text;
        }
        else {
            return lastData.hubVer;
        }
    }

    public static String scanAppVer() {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        if (text.equals("")) {
            System.out.println("Значение не может быть пустое, попробуйте еще раз");
            scanAppVer();
        } else if (text.equals("reboot")) {
            Main.retry();
        } if (text.equals("last")&& lastData.appVer.equals("null")) {
            System.out.println("Вы ранее не сохраняли версию приложения, введите актуальную версию приложения");
            scanAppVer();
        }  if (text.equals("last")&& !(lastData.appVer.equals("null"))) {
            text = lastData.appVer;
        }

        if (lastData.appVer.equals("null")) {
            return lastData.appVer = text;
        }
        else {
            return lastData.appVer;
        }
    }

    public static String scanText() {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        if (text.equals("")) {
            System.out.println(ReportElements.Space50.getString());
            System.out.println("Значение не может быть пустое, попробуйте еще раз");
            scanText();
        } else if (text.equals("reboot")) {
            System.out.println(ReportElements.Space50.getString());
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
                System.out.println("Значение не может быть пустое, попробуйте еще раз");
                scanHubType(count);
            } else if (text.equals("reboot")) {
                System.out.println(ReportElements.Space50.getString());
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
