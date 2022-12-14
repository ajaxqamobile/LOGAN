package report.supportFiles;

import com.ajax.AjaxBotHelper.AjaxBotHelperApplication;
import report.enums.ReportElements;
import report.lists.descDevices;
import report.lists.devices;
import report.lists.lastData;
import report.mainClass.Main;
import report.makeJSON.MakeJSON;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.System.exit;
import static report.supportFiles.ReportMethods.clipboardComment;

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
        System.out.println("Сделайте выбор: " +
                "\n1 - 🔴 Баг  " +
                "\n2 - \uD83D\uDD30 Комментарий  " +
                "\n3 - 📅 Репорт статусы " +
                "\n4 - ✅ Статус: Done  " +
                "\n5 - ❌ Статус: Fail " +
                "\n6 - \uD83D\uDD00 Конвертация версий: ASCII to Hex" +
                "\n7 - \uD83D\uDCDF Генерация QR для JIMM" +
                "\n9 - \uD83D\uDE91 Зарепортить проблему" +
                "\n10 - \uD83E\uDD5A Пасхалка" +
                "\n11 - \uD83D\uDCC1 Сгенерировать JSON файлы" +
                "\n12 - \uD83E\uDD16 Бот для парсинга логов" +
                "\n\nUpdate - \uD83D\uDD04 Получить обновление"+
                "\nExit - \uD83D\uDEA8 Закрыть программу\n\n");
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
            case "Exit","EXIT", "eXIT", "exit" -> {
              exit(0);
            }

            case "9" -> {
                System.out.println("Если были найдены проблемы в работе утилиты, прошу написать данным людям в телеграм:");
                System.out.println("https://t.me/borunov_alexey - Алексей");
                System.out.println("https://t.me/sernetskiy_v - Валерий\n");
                item = getBoC();
                System.out.println("\n\n");
            }

            case "10" -> {
                System.out.println("Почти 10, нужно в другом формате)\n\n");
                item = getBoC();
                System.out.println("\n\n");
            }

            case "11" -> {
                MakeJSON.startMakeJSON();
                System.out.println("\n\n\n\n");
                item = getBoC();
                System.out.println("\n\n");
            }

            case "12" -> {
                AjaxBotHelperApplication.startBot();
                Thread.sleep(1999999999);
                Thread.sleep(1999999999);
                Thread.sleep(1999999999);
                Thread.sleep(1999999999);
                Thread.sleep(1999999999);
            }

            case "0a", "0A" -> {
                System.out.println("Вот и пасхалка)\n");
                System.out.println("11010000 10100010 11010001 10001011 00100000 11010001 10000011 11010000 10110010 11010000 10110101 11010001 10000000 11010000 10110101 11010000 10111101 00100000 11010000 10110010 00100000 11010001 10000010 11010000 10111110 11010000 10111100 00100000 11010001 10000111 11010001 10000010 11010000 10111110 00100000 11010000 10110100 11010000 10110101 11010000 10111011 11010000 10110000 11010000 10110101 11010001 10001000 11010001 10001100 00111111 00001101 00001010 00001101 00001010 11010000 10100010 11010000 10111110 11010000 10110011 11010000 10110100 11010000 10110000 00100000 11010000 10110010 11010000 10111110 11010001 10000010 00111010 00100000 00110000 00110001 00110001 00110000 00110001 00110000 00110000 00110000 00100000 00110000 00110001 00110001 00110001 00110000 00110001 00110000 00110000 00100000 00110000 00110001 00110001 00110001 00110000 00110001 00110000 00110000 00100000 00110000 00110001 00110001 00110001 00110000 00110000 00110000 00110000 00100000 00110000 00110001 00110001 00110001 00110000 00110000 00110001 00110001 00100000 00110000 00110000 00110001 00110001 00110001 00110000 00110001 00110000 00100000 00110000 00110000 00110001 00110000 00110001 00110001 00110001 00110001 00100000 00110000 00110000 00110001 00110000 00110001 00110001 00110001 00110001 00100000 00110000 00110001 00110001 00110001 00110000 00110001 00110001 00110001 00100000 00110000 00110001 00110001 00110001 00110000 00110001 00110001 00110001 00100000 00110000 00110001 00110001 00110001 00110000 00110001 00110001 00110001 00100000 00110000 00110000 00110001 00110000 00110001 00110001 00110001 00110000 00100000 00110000 00110001 00110001 00110001 00110001 00110000 00110000 00110001 00100000 00110000 00110001 00110001 00110000 00110001 00110001 00110001 00110001 00100000 00110000 00110001 00110001 00110001 00110000 00110001 00110000 00110001 00100000 00110000 00110001 00110001 00110001 00110000 00110001 00110000 00110000 00100000 00110000 00110001 00110001 00110001 00110000 00110001 00110000 00110001 00100000 00110000 00110001 00110001 00110000 00110000 00110000 00110001 00110000 00100000 00110000 00110001 00110001 00110000 00110000 00110001 00110000 00110001 00100000 00110000 00110000 00110001 00110000 00110001 00110001 00110001 00110000 00100000 00110000 00110001 00110001 00110000 00110000 00110000 00110001 00110001 00100000 00110000 00110001 00110001 00110000 00110001 00110001 00110001 00110001 00100000 00110000 00110001 00110001 00110000 00110001 00110001 00110000 00110001 00100000 00110000 00110000 00110001 00110000 00110001 00110001 00110001 00110001 00100000 00110000 00110001 00110001 00110001 00110000 00110001 00110001 00110001 00100000 00110000 00110001 00110001 00110000 00110000 00110000 00110000 00110001 00100000 00110000 00110001 00110001 00110001 00110000 00110001 00110000 00110000 00100000 00110000 00110001 00110001 00110000 00110000 00110000 00110001 00110001 00100000 00110000 00110001 00110001 00110000 00110001 00110000 00110000 00110000 00100000 00110000 00110000 00110001 00110001 00110001 00110001 00110001 00110001 00100000 00110000 00110001 00110001 00110001 00110000 00110001 00110001 00110000 00100000 00110000 00110000 00110001 00110001 00110001 00110001 00110000 00110001 00100000 00110000 00110001 00110001 00110001 00110000 00110000 00110000 00110001 00100000 00110000 00110001 00110000 00110001 00110000 00110000 00110001 00110000 00100000 00110000 00110001 00110000 00110001 00110000 00110001 00110000 00110000 00100000 00110000 00110001 00110001 00110001 00110000 00110001 00110001 00110000 00100000 00110000 00110001 00110001 00110000 00110000 00110001 00110001 00110000 00100000 00110000 00110001 00110001 00110001 00110000 00110000 00110000 00110000 00100000 00110000 00110001 00110001 00110001 00110001 00110000 00110001 00110000 00100000 00110000 00110001 00110001 00110000 00110001 00110001 00110001 00110001 00100000 00110000 00110000 00110001 00110000 00110001 00110001 00110000 00110001 00100000 00110000 00110001 00110000 00110000 00110001 00110001 00110000 00110001 00100000 00110000 00110001 00110001 00110000 00110000 00110001 00110001 00110001 00100000 00110000 00110000 00110001 00110000 00110000 00110001 00110001 00110000 00100000 00110000 00110001 00110001 00110001 00110000 00110001 00110000 00110000 00100000 00110000 00110000 00110001 00110001 00110001 00110001 00110000 00110001 00100000 00110000 00110000 00110001 00110001 00110000 00110001 00110001 00110001 00100000 00110000 00110001 00110001 00110001 00110000 00110000 00110001 00110001 00001101 00001010\n\n");
                item = getBoC();
                System.out.println("\n\n");
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
