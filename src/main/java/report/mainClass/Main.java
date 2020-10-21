package main.java.report.mainClass;

import main.java.report.GetData;
import main.java.report.Reporting;

public class Main {

    public static void main(String[] args) {
        Reporting.getReport(GetData.getBoC(), GetData.getPlatform());
    }
}
