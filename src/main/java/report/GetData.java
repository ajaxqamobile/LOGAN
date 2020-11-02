package main.java.report;

import main.java.report.enums.ReportElements;
import main.java.report.mainClass.Main;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GetData {

    public static String getPlatform() throws IOException {
        System.out.println("1 - AOS \n2 - iOS \n3 - Desktop");
        Scanner scan = new Scanner(System.in);
        String BoC = scan.nextLine();
        String item = null;
        switch (BoC) {
            case "1", "2", "3" -> item = BoC;
            case "reboot" -> Main.retry();
            default -> {
                System.out.println("Wrong value, please try again!");
                item = getPlatform();
            }
        }
        return item;
    }

    public static String getBoC() throws IOException {
        System.out.println("Make a choice: \n1 - 🔴 Bug  \n2 - \uD83D\uDD30 Comment  \n3 - 📅 QA Report  \n4 - ✅ Done!  \n5 - ❌ Fail \n6 - \uD83D\uDD00 Dec to Hex" +
                "\nUpdate - \uD83D\uDD04 Get update");
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

            case "6" -> {
                System.out.println("Enter the number to convert to HEX \n");
                System.out.println("For set firmware the hub, you need to enter a value of this format -> 209113\n" +
                        "We get this value for the hub -> 2.9.113\n");

                System.out.println("For set firmware the device, you need to enter a value of this format -> 5420102\n" +
                        "We get this value for the device -> 5.42.01.02\n");

                int str = Integer.parseInt(Scan.scanText());
                int count = String.valueOf(Math.abs(str)).length();
                String readyHex = null;
                if (count == 6) {
                    readyHex = decToHex.hubToHex(str);
                    ReportMethods.clipboardIndex(readyHex);
                    System.out.println("This is your HEX = "+readyHex);
                } else if (count == 7){
                    readyHex = decToHex.deviceToHex(str);
                    ReportMethods.clipboardIndex(readyHex);
                    System.out.println("This is your HEX = "+readyHex);
                } else {
                    System.out.println(ReportElements.Space50.getString());
                    System.out.println("\nSorry, wrong password! Try again!\n");
                }
                System.out.println(ReportElements.Space50.getString());
                item = getBoC();
            }

            case "Update","update","UPDATE","uPDATE" -> {
                String link = "https://ajaxsystems.atlassian.net/wiki/spaces/AC/pages/2160657041/LOGAN.jar";
                System.out.println(link);
                java.awt.Desktop.getDesktop().browse(java.net.URI.create(link));
                ReportMethods.clipboardIndex(link);
                Main.retry();
            }



            case "QA" -> {
                System.out.println(ReportElements.Space50.getString());
                System.out.println("Слава Mobile Team, QA слава");
                Main.retry();
            }
            case "reboot" -> Main.retry();
            default -> {
                System.out.println(ReportElements.Space50.getString());
                System.out.println("Wrong value, please try again!");
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
