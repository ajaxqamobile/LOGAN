package main.java.report;

public class WritingAReports {

    public static void getReport(String item, String OS) {
        switch (item){
            case "1": Bug(OS);
            case "2": Comment(OS);
        }
        getReport(GetData.getBoC(), GetData.getPlatform());
    }

    public static void Bug(String OS) {

        ReportElements.enviroment();
        ReportElements.osVersion(OS);
        ReportElements.appVersion(OS);
        ReportElements.server();
        ReportElements.hubType();
        ReportElements.hubVer();
        ReportElements.device(OS);
        ReportElements.repeated();
        ReportElements.inRelease();
        ReportElements.another();
        ReportElements.testAccount();
        ReportElements.email();
        ReportElements.password();
        ReportElements.hubName();
        ReportElements.preconditions();
        ReportElements.description();
        ReportElements.stepsToReproduce();
        ReportElements.AR();
        ReportElements.ER();
        ReportElements.AI();
        ReportElements.timestamp();
        ReportElements.clipboard();

    }

    public static void Comment(String OS) {

        ReportElements.enviroment();
        ReportElements.appVersion(OS);
        ReportElements.commentDevice(OS);
        ReportElements.hubType();
        ReportElements.hubVer();
        ReportElements.server();
        ReportElements.testStatus();
        ReportElements.commentDescription();
        ReportElements.AI();
        ReportElements.evidence();
        ReportElements.clipboard();
    }

}
