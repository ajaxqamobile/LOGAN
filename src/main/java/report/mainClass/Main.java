package main.java.report.mainClass;

import main.java.report.GetData;
import main.java.report.Reporting;
import main.java.report.Scan;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nWelcome to LOGAN v1.1.2\n");
        retry();
    }

    public static void retry() {
        System.out.println("You have to enter the password: ");
        String pass = Scan.scanText();
        if (pass.equals("ajaxtest")) {
            System.out.println("\n");
            Reporting.getReport(GetData.getBoC(), GetData.getPlatform());
        } else {
            System.out.println("\nSorry, wrong password! Try again.\n");
            retry();
        }
    }
}
