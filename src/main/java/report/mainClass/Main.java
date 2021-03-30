package main.java.report.mainClass;

import main.java.report.GetData;
import main.java.report.Reporting;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        String username = System.getProperty("user.name");

        System.out.print("\nWelcome " +username +
                " to LOGAN v1.8.8" +
                "" +
                "\n");
        System.out.println("When security is art!\n");
        retry();
    }

    public static void retry() throws IOException, InterruptedException {
//        System.out.println("You have to enter the password: ");
//        String pass = Scan.scanText();
//        if (pass.equals("ajaxtest")) {
//            System.out.println("\n");
            Reporting.getReport(GetData.getBoC(), GetData.getPlatform());
//        } else {
//            System.out.println(ReportElements.Space50.getString());
//            System.out.println("\nSorry, wrong password! Try again!\n");
//            retry();
//        }
    }
}
