package main.java.report.mainClass;

import main.java.report.GetData;
import main.java.report.Reporting;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        String username = System.getProperty("user.name");

        String majorVersion = "2";
        String minorVersion = "1";
        String trivialVersion = "2";


        System.out.print("\nДобро пожаловать в LOGAN [v"+majorVersion+"."+minorVersion+"."+trivialVersion+"], "+username +"!\n\n");
        retry();
    }

    public static void retry() throws IOException, InterruptedException {
            Reporting.getReport(GetData.getBoC(), GetData.getPlatform());
    }
}
