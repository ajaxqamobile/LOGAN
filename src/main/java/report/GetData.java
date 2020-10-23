package main.java.report;

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
        System.out.println("Make a choice: \n1 - 🔴 Bug  \n2 - 🟢 Comment  \n3 - 📅 QA Report  \n4 - ✅ Done!  \n5 - ❌ Fail");
        Scanner scan = new Scanner(System.in);
        String BoC = scan.nextLine();
        String item = null;
        switch (BoC) {
            case "1", "2" -> item = BoC;
            case "3" -> {
                qaReport();
                item = getBoC();
            }
            case "4" -> {
                ReportMethods.clipboardIndex("Done!✅");
                item = getBoC();
            }
            case "5" -> {
                ReportMethods.clipboardIndex("Fail❌");
                item = getBoC();
            }
            case "9" -> {
                System.out.println("Слава Mobile Team, QA слава");
                Main.retry();
            }
            case "reboot" -> Main.retry();

            default -> {
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
