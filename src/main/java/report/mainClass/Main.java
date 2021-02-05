package main.java.report.mainClass;

import main.java.report.GetData;
import main.java.report.Reporting;
import main.java.report.Scan;
import main.java.report.enums.ReportElements;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.print("\nWelcome to LOGAN v1.8" +
                "\n");
        System.out.println("When security is art!\n");
        retry();
    }

    public static void retry() throws IOException, InterruptedException {
        System.out.println("You have to enter the password: ");
        String pass = Scan.scanText();
        if (pass.equals("ajaxtest")) {
            System.out.println("\n");
            Reporting.getReport(GetData.getBoC(), GetData.getPlatform());
        } else {
            System.out.println(ReportElements.Space50.getString());
            System.out.println("\nSorry, wrong password! Try again!\n");
            retry();
        }
    }
}
