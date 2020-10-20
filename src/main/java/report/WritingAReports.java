package main.java.report;

public class WritingAReports {

    public static void getReport(String item, String OS) {
        if (item.equals("1")) {
            Bug(OS);
        } else if (item.equals("2")) {
            Comment(OS);
        }
        getReport(Choise.getBoC(), Choise.getPlatform());
    }

    public static void Bug(String OS) {

            ReportElements.enviroment();
            ReportElements.osVersion(OS);
            ReportElements.appVersion(OS);
            ReportElements.server();
            ReportElements.hubVer();
            ReportElements.device();
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
            ReportElements.commentDevice();
            ReportElements.server();
            ReportElements.testStatus();
            ReportElements.commentDescription();
            ReportElements.AI();
            ReportElements.evidence();
            ReportElements.clipboard();
    }

}
