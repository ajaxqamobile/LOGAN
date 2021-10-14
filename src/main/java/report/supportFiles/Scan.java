package main.java.report.supportFiles;

import main.java.report.enums.ReportElements;
import main.java.report.lists.HubTypes;
import main.java.report.lists.Phones;
import main.java.report.lists.lastData;
import main.java.report.mainClass.Main;

import java.io.IOException;
import java.util.Scanner;

public class Scan {

    public static String scanHubName() throws IOException, InterruptedException {
        String ret = null;
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        if (text.equals("")) {
            System.out.println("Неверное значение, попробуйте еще раз!");
            scanHubName();
        } else if (text.equals("reboot")||text.equals("r")) {
            Main.retry();
        }
        boolean lastBool = text.equals("last") || text.equals("l")|| text.equals("L")|| text.equals("д")|| text.equals("Д")|| text.equals("Last") || text.equals("lAST") || text.equals("LAST") || text.equals("дфые") || text.equals("ДФЫЕ") || text.equals("Дфые") || text.equals("дФЫЕ");
        if (lastBool && lastData.hubName.equals("Unknown")) {
            System.out.println("Вы ранее не сохраняли имя хаба, введите текущее имя хаба!");
            scanHubName();
        } else if (lastBool) {
            ret = lastData.hubNameNum;
        } else {
            ret = lastData.hubNameNum = text;
        }
        return ret;
    }

    public static String scanHubVer() throws IOException, InterruptedException {
        String ret = null;
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        switch (text) {
            case "" -> {
                System.out.println("Неверное значение, попробуйте еще раз!");
                scanHubVer();
            }
            case "reboot","r" -> Main.retry();
        }
        boolean lastBool = text.equals("last") || text.equals("l")|| text.equals("L")|| text.equals("д")|| text.equals("Д") || text.equals("Last") || text.equals("lAST") || text.equals("LAST") || text.equals("дфые") || text.equals("ДФЫЕ") || text.equals("Дфые") || text.equals("дФЫЕ");
        if (lastBool && lastData.hubVer.equals("Unknown")) {
            System.out.println("Вы ранее не сохраняли версию хаба, введите текущую версию хаба!");
            ret = scanHubVer();
        } else if (lastBool) {
            ret = lastData.hubVerNum;
        } else {
            ret = lastData.hubVerNum = text;
        }
        return ret;
    }

    public static String scanAppVer() throws IOException, InterruptedException {
        String ret = null;
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        switch (text) {
            case "" -> {
                System.out.println("Значение не может быть пустым, попробуйте еще раз!");
                scanAppVer();
            }
            case "reboot","r" -> Main.retry();
        }

        boolean lastBool = text.equals("last") || text.equals("l")|| text.equals("L")|| text.equals("д")|| text.equals("Д") || text.equals("Last") || text.equals("lAST") || text.equals("LAST") || text.equals("дфые") || text.equals("ДФЫЕ") || text.equals("Дфые") || text.equals("дФЫЕ");
        if (lastBool && lastData.appVer.equals("Unknown")) {
            System.out.println("Вы ранее не сохраняли версию приложения, введите текущую версию приложения!");
            scanAppVer();
        } else if (lastBool) {
            ret = lastData.appVerNum;
        } else {
            ret = lastData.appVerNum = text;
        }
        return ret;
    }

    public static String scanText() throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        switch (text) {
            case "" -> {
                System.out.println(ReportElements.Space50.getString());
                System.out.println("Значение не может быть пустым, попробуйте еще раз!");
                scanText();
            }
            case "reboot","r" -> {
                System.out.println(ReportElements.Space50.getString());
                Main.retry();
            }
        }
        return text;
    }

    public static String scanHubType(int count) {
        String currentType = null;
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        try {
            int i = Integer.parseInt(text);
            if (text.equals("") || i < 0 || i > count) {
                System.out.println("Значение не может быть пустым, попробуйте еще раз!");
                currentType = scanHubType(count);
            } else if (text.equals("reboot")||text.equals("r")) {
                System.out.println(ReportElements.Space50.getString());
                Reporting.getReport(GetData.getBoC(), GetData.getPlatform());
            } else {
                currentType = HubTypes.hubTypes[i - 1];
            }
        } catch (NumberFormatException e) {
            System.out.println("Неверное значение, попробуйте еще раз!");
            currentType = scanHubType(count);
        }  catch (InterruptedException  | IOException e) {
            e.printStackTrace();
        }
        return currentType;
    }


    public static String scanPhone(int count, String OS) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String currentPhone = null;
        try {
            int i = Integer.parseInt(text);
            if (text.equals("") || i < 0 || i > count) {
                System.out.println("Неверное значение, попробуйте еще раз!");
                currentPhone = scanPhone(count, OS);
            } else {
                i--;
                switch (OS) {
                    case "1" -> currentPhone = Phones.androidPhones[i] + "\n" + Phones.androidOS[i];
                    case "2" -> currentPhone = Phones.iOSPhones[i] + "\n" + Phones.iOSOS[i];
                }
            }
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            switch (OS) {
                case "1" -> {
                    System.out.println("\n"+ReportElements.AOSVer.getString());
                    currentPhone = text +"\n"+ReportElements.AOSVer.getString()+scanText();
                }
                case "2" -> {
                    System.out.println("\n"+ReportElements.iOSVer.getString());
                    currentPhone = text +"\n"+ReportElements.iOSVer.getString()+scanText();
                }
            }
        }
        return currentPhone;
    }
}
