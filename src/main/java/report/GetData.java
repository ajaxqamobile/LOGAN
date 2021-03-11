package main.java.report;

import main.java.report.enums.ReportElements;
import main.java.report.lists.descDevices;
import main.java.report.lists.devices;
import main.java.report.lists.lastData;
import main.java.report.mainClass.Main;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static main.java.report.ReportMethods.clipboardComment;

public class GetData {

    public static String getPlatform() throws IOException, InterruptedException {
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

    public static String getBoC() throws IOException, InterruptedException {
        System.out.println("Make a choice: \n1 - 🔴 Bug  " +
                "\n2 - \uD83D\uDD30 Comment  " +
                "\n3 - 📅 QA Report  " +
                "\n4 - ✅ Done!  " +
                "\n5 - ❌ Fail " +
                "\n6 - \uD83D\uDD00 Dec to Hex" +
                "\n7 - \uD83D\uDCDF JIMM" +
                "\n8 - \uD83D\uDD04 Обработано "+
                "\n\nUpdate - \uD83D\uDD04 Get update\n\n");
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

                decToHex.startHEX();
                item = getBoC();
            }

            case "7" -> {
                System.out.println("Enter the type of sensor for which you want to generate a command!\n");
                descDevices.getAllDevices();
                String type = Scan.scanText();
                devices.checkType(type);
                System.out.println(ReportElements.Space50.getString());
                item = getBoC();
            }
            case "8" -> {
                String str = "Проблема обработана и зафиксирована \uD83D\uDD04 \n";
                System.out.println(str);
                ReportMethods.clipboardIndex(str);
                System.out.println(ReportElements.Space50.getString());
                item = getBoC();
                System.out.println("\n\n");
            }
            case "Update","update","UPDATE","uPDATE" -> {
                String link = "https://ajaxsystems.atlassian.net/wiki/spaces/AC/pages/2160657041/LOGAN.jar";
               // String Dlink = "https://api.media.atlassian.com/file/8620083d-e666-40e3-beed-83b3c2a25f79/binary?client=121a5fd6-7295-49fa-8b0b-836b04406a9b&collection=contentId-2160657041&dl=true&max-age=2592000&token=eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMjFhNWZkNi03Mjk1LTQ5ZmEtOGIwYi04MzZiMDQ0MDZhOWIiLCJhY2Nlc3MiOnsidXJuOmZpbGVzdG9yZTpjb2xsZWN0aW9uOmNvbnRlbnRJZC0yMTYwNjU3MDQxIjpbInJlYWQiXX0sImV4cCI6MTYwNDMzNDY1NCwibmJmIjoxNjA0MzMxNzE0fQ.VYBy41kfVVWzlnhuIR9b-MMEw7rJP-ThexmWof1aCMQ";
                System.out.println(link);
               java.awt.Desktop.getDesktop().browse(java.net.URI.create(link));
                System.out.println("The link has already been copied to the clipboard");
                ReportMethods.clipboardIndex(link);
                item = getBoC();
            }
            case "QA" -> {
                System.out.println(ReportElements.Space50.getString());
                System.out.println("Слава Mobile Team, QA слава");
                Main.retry();
            }
            case "reboot" -> Main.retry();
            case "last","l","д","Д","L" ->  {
                if (!(lastData.appVer.equals("null"))){
                    clipboardComment();
                } else {
                    System.out.println("There are no saved values, you need to fill out the comment again!\n\n");
                }
                item = getBoC();
            }
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
