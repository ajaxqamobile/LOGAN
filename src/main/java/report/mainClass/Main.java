package report.mainClass;

import report.supportFiles.GetData;
import report.supportFiles.Reporting;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        String username = System.getProperty("user.name");

        String version = "2.3.7";

        System.out.print("\nДобро пожаловать в LOGAN [v"+version+"], "+username +"!\n");
        System.out.println(getDate());
        System.out.println("Хорошего рабочего дня :)\n");
        retry();
    }

    public static void retry() throws IOException, InterruptedException {
            Reporting.getReport(GetData.getBoC(), GetData.getPlatform());
    }

    public static String getDate() {
        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");
        String currentDate = formatForDateNow.format(date);
        return "Текущая дата \uD83D\uDCC5: " + currentDate;
    }

}
