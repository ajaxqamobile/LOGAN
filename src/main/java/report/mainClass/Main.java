package main.java.report.mainClass;

import main.java.report.GetData;
import main.java.report.Reporting;

import javax.swing.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        String username = System.getProperty("user.name");

        System.out.print("\nWelcome to LOGAN v2.0.6, "+username +"!\n\n");
        retry();
    }

    public static void retry() throws IOException, InterruptedException {
            Reporting.getReport(GetData.getBoC(), GetData.getPlatform());
    }
}
