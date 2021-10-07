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
        System.out.println("1 - AOS \n2 - iOS");
        Scanner scan = new Scanner(System.in);
        String BoC = scan.nextLine();
        String item = null;
        switch (BoC) {
            case "1", "2" -> item = BoC;
            case "reboot", "r" -> Main.retry();
            default -> {
                System.out.println("Неверное значение, попробуйте еще раз!");
                item = getPlatform();
            }
        }
        return item;
    }

    public static String getBoC() throws IOException, InterruptedException {
        System.out.println("Сделайте выбор: \n1 - 🔴 Баг  " +
                "\n2 - \uD83D\uDD30 Комментарий  " +
                "\n3 - 📅 QA Report  " +
                "\n4 - ✅ Статус: Done  " +
                "\n5 - ❌ Статус: Fail " +
                "\n6 - \uD83D\uDD00 Конвертация версий: ASCII to Hex" +
                "\n7 - \uD83D\uDCDF Генерация QR для JIMM" +
                "\n\nUpdate - \uD83D\uDD04 Получить обновление\n\n");
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
                System.out.println("Введите цифри для конвертации их в HEX  \n");
                System.out.println("Для установки прошивки хаба необходимо ввести значение такого формата -> 209113\n" +
                        "И получаем такое значение для хаба -> 2.9.113\n");

                System.out.println("Для установки прошивки девайса необходимо ввести значение такого формата -> 5420102\n" +
                        "И получаем такое значение для девайса -> 5.42.01.02\n");

                decToHex.startHEX();
                item = getBoC();
            }

            case "7" -> {
                System.out.println("Введите тип датчика, для которого вы хотите сгенерировать команду!\n");
                descDevices.getAllDevices();
                String type = Scan.scanText();
                devices.checkType(type);
                System.out.println(ReportElements.Space50.getString());
                item = getBoC();
            }

            case "Update","update","UPDATE","uPDATE" -> {
                String link = "https://ajaxsystems.atlassian.net/wiki/spaces/AC/pages/2160657041/LOGAN.jar";
                System.out.println(link);
                java.awt.Desktop.getDesktop().browse(java.net.URI.create(link));
                System.out.println("Ссылка уже скопирована в буфер обмена!");
                ReportMethods.clipboardIndex(link);
                item = getBoC();
            }
            case "reboot", "r" -> Main.retry();
            case "last","l","д","Д","L" ->  {
                if (!(lastData.appVer.equals("null"))){
                    clipboardComment();
                } else {
                    System.out.println("Сохраненных значений нет, нужно заполнить комментарий заново!\n\n");
                }
                item = getBoC();
            }
            default -> {
                System.out.println(ReportElements.Space50.getString());
                System.out.println("Неверное значение, попробуйте еще раз!");
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
        return "Дата \uD83D\uDCC5: " + currentDate + "\n\n" +
                "Status Fail❌: \n\n" +
                "Status Done✅: \n\n";
    }
}
