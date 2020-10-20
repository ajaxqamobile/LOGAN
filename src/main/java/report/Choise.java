package main.java.report;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Choise {

    public static String getPlatform() {
        System.out.println("1 - AOS \n2 - iOS");
        Scanner scan = new Scanner(System.in);
        String BoC = scan.nextLine();
        String item;
        if (BoC.equals("1") || BoC.equals("2")) {
            item = BoC;
        } else {
            System.out.println("Не правильное значение, попробуйте еще раз");
            item = getPlatform();
        }
        return item;
    }

    public static String getBoC() {
        System.out.println("Make a choice: \n1 - Bug🔴  \n2 - Comment🟢  \n3 - QA Report📅  \n4 - Done!✅  \n5 - Fail❌");
        Scanner scan = new Scanner(System.in);
        String BoC = scan.nextLine();
        String item;
        if (BoC.equals("1") || BoC.equals("2")) {
            item = BoC;
        } else if (BoC.equals("3")) {
            qaReport();
            item = getBoC();
        } else if (BoC.equals("4")) {
            ReportElements.clipboardStatus("Done!✅");
            item = getBoC();
        } else if (BoC.equals("5")) {
            ReportElements.clipboardStatus("Fail❌");
            item = getBoC();
        } else {
            System.out.println("Не правильное значение, попробуйте еще раз");
            item = getBoC();
        }
        return item;
    }

    public static void qaReport() {
        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");
        String currentDate = formatForDateNow.format(date);
        String report = "Date\uD83D\uDCC5: " + currentDate + "\n\n" + "Fail❌: \n\n" + "Done!✅: \n\n";
        System.out.println(report);
        StringSelection stringSelection = new StringSelection(report);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }


}
