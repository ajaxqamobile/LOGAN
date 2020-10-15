package main.java.report;

import main.java.report.Choise;
import main.java.report.ReportElements;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        WritingAReports.getReport(Choise.getBoC(), Choise.getPlatform());
    }
}
