package main.java.report;

import main.java.report.mainClass.Main;

public class Reporting {

    public static void getReport(String item, String OS) {
        switch (item) {
            case "1" -> composeBug(OS);
            case "2" -> composeComment(OS);
            case "reboot" -> Main.retry();

        }
        getReport(GetData.getBoC(), GetData.getPlatform());
    }

    public static void composeBug(String OS) {

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
        ReportMethods.clipboard();

    }

    public static void composeComment(String OS) {

        ReportMethods.enviroment();
        ReportMethods.appVersion(OS);
        ReportMethods.commentDevice(OS);
        ReportMethods.hubType();
        ReportMethods.hubVer();
        ReportMethods.server();
        ReportMethods.testStatus();
        ReportMethods.commentDescription();
        ReportMethods.AI();
        ReportMethods.evidence();
        ReportMethods.clipboard();
    }

}
