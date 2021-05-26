package main.java.report;

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
            System.out.println("Wrong value, please try again!");
            scanHubName();
        } else if (text.equals("reboot")||text.equals("r")) {
            Main.retry();
        }
        boolean lastBool = text.equals("last") || text.equals("l")|| text.equals("L")|| text.equals("д")|| text.equals("Д")|| text.equals("Last") || text.equals("lAST") || text.equals("LAST") || text.equals("дфые") || text.equals("ДФЫЕ") || text.equals("Дфые") || text.equals("дФЫЕ");
        if (lastBool && lastData.hubName.equals("Unknown")) {
            System.out.println("You have not previously saved the hub name, enter the current name!");
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
                System.out.println("Wrong value, please try again!");
                scanHubVer();
            }
            case "reboot","r" -> Main.retry();
        }
        boolean lastBool = text.equals("last") || text.equals("l")|| text.equals("L")|| text.equals("д")|| text.equals("Д") || text.equals("Last") || text.equals("lAST") || text.equals("LAST") || text.equals("дфые") || text.equals("ДФЫЕ") || text.equals("Дфые") || text.equals("дФЫЕ");
        if (lastBool && lastData.hubVer.equals("Unknown")) {
            System.out.println("You have not previously saved the hub version, enter the current version");
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
                System.out.println("The value cannot be empty, please try again!");
                scanAppVer();
            }
            case "reboot","r" -> Main.retry();
        }

        boolean lastBool = text.equals("last") || text.equals("l")|| text.equals("L")|| text.equals("д")|| text.equals("Д") || text.equals("Last") || text.equals("lAST") || text.equals("LAST") || text.equals("дфые") || text.equals("ДФЫЕ") || text.equals("Дфые") || text.equals("дФЫЕ");
        if (lastBool && lastData.appVer.equals("Unknown")) {
            System.out.println("You have not previously saved the version of the application, enter the current version of the application!");
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
                System.out.println("The value cannot be empty, please try again!");
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
                System.out.println("The value cannot be empty, please try again!");
                currentType = scanHubType(count);
            } else if (text.equals("reboot")||text.equals("r")) {
                System.out.println(ReportElements.Space50.getString());
                Reporting.getReport(GetData.getBoC(), GetData.getPlatform());
            } else {
                currentType = HubTypes.hubTypes[i - 1];
            }
        } catch (NumberFormatException e) {
            System.out.println("Wrong value, please try again!");
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
                System.out.println("Wrong value, please try again!");
                currentPhone = scanPhone(count, OS);
            } else {
                i--;
                switch (OS) {
                    case "1" -> currentPhone = Phones.androidPhones[i] + "\n" + Phones.androidOS[i];
                    case "2" -> currentPhone = Phones.iOSPhones[i] + "\n" + Phones.iOSOS[i];
                    case "3" -> currentPhone = Phones.desktopPhones[i] + "\n" + Phones.desktopOS[i];
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
                case "3" -> {
                    System.out.println("\n"+ReportElements.DesktopVer.getString());
                    currentPhone = text +"\n"+ReportElements.DesktopVer.getString()+scanText();
                }
            }
        }
        return currentPhone;
    }
}
