package main.java.report;

import main.java.report.enums.ReportElements;
import main.java.report.mainClass.Main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GetData {

    public static String getPlatform() {
        System.out.println("1 - AOS \n2 - iOS");
        Scanner scan = new Scanner(System.in);
        String BoC = scan.nextLine();
        String item = null;
        switch (BoC) {
            case "1", "2" -> item = BoC;
            case "reboot" -> Main.retry();
            default -> {
                System.out.println("Не правильное значение, попробуйте еще раз");
                item = getPlatform();
            }
        }
        return item;
    }

    public static String getBoC() {
        System.out.println("Make a choice: \n1 - 🔴 Bug  \n2 - \uD83D\uDD30 Comment  \n3 - 📅 QA Report  \n4 - ✅ Done!  \n5 - ❌ Fail");
        Scanner scan = new Scanner(System.in);
        String BoC = scan.nextLine();
        String item = null;
        switch (BoC) {
            case "1", "2" -> {
                item = BoC;
                System.out.println("\n\n");
            }
            case "3" -> {
                qaReport();
                System.out.println(ReportElements.Space50.getString());
                item = getBoC();
                System.out.println("\n\n");


            }
            case "4" -> {
                ReportMethods.clipboardIndex("Done!✅");
                System.out.println(ReportElements.Space50.getString());
                item = getBoC();
                System.out.println("\n\n");

            }
            case "5" -> {
                ReportMethods.clipboardIndex("Fail❌");
                System.out.println(ReportElements.Space50.getString());
                item = getBoC();
            }
            case "9" -> {
                System.out.println(ReportElements.Space50.getString());
                System.out.println("Слава Mobile Team, QA слава");
                Main.retry();
            }
            case "reboot" -> Main.retry();
            default -> {
                System.out.println(ReportElements.Space50.getString());
                System.out.println("Не правильное значение, попробуйте еще раз");
                item = getBoC();
            }
        }
        return item;
    }

    public static void qaReport() {
        System.out.println(getDate());
        ReportMethods.clipboardIndex(getDate());
    }

    public static String getDate() {
        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");
        String currentDate = formatForDateNow.format(date);
        return "Date\uD83D\uDCC5: " + currentDate + "\n\n" + "Fail❌: \n\n" + "Done!✅: \n\n";
    }


}
