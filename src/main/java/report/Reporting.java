package main.java.report;

import main.java.report.enums.ReportElements;
import main.java.report.mainClass.Main;

import java.io.IOException;

public class Reporting {

    public static void getReport(String item, String OS) throws IOException, InterruptedException {
        switch (item) {
            case "1" -> {
                composeBug(OS);
                System.out.println(ReportElements.Space50.getString());
            }
            case "2" -> {
                composeComment(OS);
                System.out.println(ReportElements.Space50.getString());
            }
            case "reboot", "r" -> Main.retry();

        }
        getReport(GetData.getBoC(), GetData.getPlatform());
    }

    public static void composeBug(String OS) throws IOException, InterruptedException {

        ReportMethods.enviroment();
        ReportMethods.appVersion(OS);
        ReportMethods.device(OS);
        ReportMethods.server();
        ReportMethods.hubType();
        ReportMethods.hubVer();
        ReportMethods.repeated();
        ReportMethods.inRelease();
        ReportMethods.another();
        ReportMethods.testAccount();
        ReportMethods.email();
        ReportMethods.password();
        ReportMethods.hubName();
        ReportMethods.preconditions();
        ReportMethods.description();
        ReportMethods.stepsToReproduce();
        ReportMethods.AR();
        ReportMethods.ER();
        ReportMethods.AI();
        ReportMethods.timestamp();
        ReportMethods.meteora();
        System.out.println("\n\n\n");

        ReportMethods.clipboardBugReport();

    }

    public static void composeComment(String OS) throws IOException, InterruptedException {

        ReportMethods.enviroment();
        ReportMethods.appVersion(OS);
        ReportMethods.commentDevice(OS);
        ReportMethods.hubType();
        ReportMethods.hubVer();
        ReportMethods.server();
        ReportMethods.testStatus();
        ReportMethods.commentDescription();
        ReportMethods.AI();
        ReportMethods.meteora();
        ReportMethods.evidence();
        System.out.println("\n\n\n");

        ReportMethods.clipboardComment();
    }

}
