package main.java.report;

import main.java.report.enums.ReportElements;
import main.java.report.lists.HubTypes;
import main.java.report.lists.Phones;
import main.java.report.lists.lastData;
import main.java.report.mainClass.Main;

import java.util.Scanner;

public class Scan {

    public static String scanHubName() {
        String ret = null;
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        if (text.equals("")) {
            System.out.println("Не правильное значение, попробуйте еще раз");
            scanHubName();
        } else if (text.equals("reboot")) {
            Main.retry();
        }
        boolean lastBool = text.equals("last") || text.equals("Last") || text.equals("lAST") || text.equals("LAST") || text.equals("дфые") || text.equals("ДФЫЕ") || text.equals("Дфые") || text.equals("дФЫЕ");
        if (lastBool && lastData.hubName.equals("null")) {
            System.out.println("Вы ранее не сохраняли имя хаба, введите актуальное имя");
            scanHubName();
        } else if (lastBool) {
            ret = lastData.hubNameNum;
        } else {
            ret = lastData.hubNameNum = text;
        }
        return ret;
    }

    public static String scanHubVer() {
        String ret = null;
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        switch (text) {
            case "" -> {
                System.out.println("Не правильное значение, попробуйте еще раз");
                scanHubVer();
            }
            case "reboot" -> Main.retry();
        }
        boolean lastBool = text.equals("last") || text.equals("Last") || text.equals("lAST") || text.equals("LAST") || text.equals("дфые") || text.equals("ДФЫЕ") || text.equals("Дфые") || text.equals("дФЫЕ");
        if (lastBool && lastData.hubVer.equals("null")) {
            System.out.println("Вы ранее не сохраняли версию хаба, введите актуальную версию хаба");
            scanHubVer();
        } else if (lastBool) {
            ret = lastData.hubVerNum;
        } else {
            ret = lastData.hubVerNum = text;
        }
        return ret;
    }

    public static String scanAppVer() {
        String ret = null;
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        switch (text) {
            case "" -> {
                System.out.println("Значение не может быть пустое, попробуйте еще раз");
                scanAppVer();
            }
            case "reboot" -> Main.retry();
        }

        boolean lastBool = text.equals("last") || text.equals("Last") || text.equals("lAST") || text.equals("LAST") || text.equals("дфые") || text.equals("ДФЫЕ") || text.equals("Дфые") || text.equals("дФЫЕ");
        if (lastBool && lastData.appVer.equals("null")) {
            System.out.println("Вы ранее не сохраняли версию приложения, введите актуальную версию приложения");
            scanAppVer();
        } else if (lastBool) {
            ret = lastData.appVerNum;
        } else {
            ret = lastData.appVerNum = text;
        }
        return ret;
    }

    public static String scanText() {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        switch (text) {
            case "" -> {
                System.out.println(ReportElements.Space50.getString());
                System.out.println("Значение не может быть пустое, попробуйте еще раз");
                scanText();
            }
            case "reboot" -> {
                System.out.println(ReportElements.Space50.getString());
                Main.retry();
            }
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
            System.out.println("Не правильное значение, попробуйте еще раз");
            currentType = scanHubType(count);
        }
        return currentType;
    }


    public static String scanPhone(int count, String OS) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String currentPhone = null;
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
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Не верное значение, попробуйте еще раз");
           currentPhone = scanPhone(count, OS);
        }
        return currentPhone;
    }
}
