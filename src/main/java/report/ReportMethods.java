package main.java.report;

import main.java.report.enums.ReportElements;
import main.java.report.lists.HubTypes;
import main.java.report.lists.Phones;
import main.java.report.lists.lastData;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class ReportMethods {

    private static String Report;

    public static void enviroment() {
        System.out.println(ReportElements.Environment.getString() + "\n");
        Report = ReportElements.Environment.getString() + "\n";
        System.out.println("\n\n");


    }

    public static void appVersion(String OS) {
        switch (OS) {
            case "1" -> {
                System.out.println(ReportElements.AOSAppVersion.getString());
                Report = Report + ReportElements.AOSAppVersion.getString();
                Report = Report + Scan.scanAppVer() + "\n";
            }
            case "2" -> {
                System.out.println(ReportElements.iOSAppVersion.getString());
                Report = Report + ReportElements.iOSAppVersion.getString();
                Report = Report + Scan.scanAppVer() + "\n";
            }
        }
        System.out.println("\n\n");
    }

    public static void server() {
        System.out.println(ReportElements.Server.getString());
        Report = Report + ReportElements.Server.getString();
        Report = Report + Answers.Sever() + "\n\n";
        System.out.println("\n\n");
    }

    public static void hubType() {
        System.out.println(ReportElements.HubType.getString());
        Report = Report + ReportElements.HubType.getString();
        Report = Report + HubTypes.getType() + "\n";
        System.out.println("\n\n");

    }

    public static void hubVer() {
        System.out.println(ReportElements.HubVer.getString());
        Report = Report + ReportElements.HubVer.getString();
        Report = Report + Scan.scanHubVer() + "\n";
        System.out.println("\n\n");

    }

    public static void device(String OS) {
        System.out.println(ReportElements.Device.getString());
        Report = Report + ReportElements.Device.getString();
        Report = Report + Phones.getPhone(OS) + "\n\n";
        System.out.println("\n\n");

    }

    public static void commentDevice(String OS) {
        System.out.println(ReportElements.Device.getString());
        Report = Report + ReportElements.Device.getString();
        Report = Report + Phones.getPhone(OS) + "\n";
        System.out.println("\n\n");

    }

    public static void repeated() {
        System.out.println(ReportElements.Repeated.getString());
        Report = Report + "\n" + ReportElements.Repeated.getString();
        Report = Report + Answers.HowOften() + "\n";
        System.out.println("\n\n");

    }

    public static void inRelease() {
        System.out.println(ReportElements.inRelease.getString());
        Report = Report + ReportElements.inRelease.getString();
        Report = Report + Answers.YesNo() + "\n";
        System.out.println("\n\n");

    }

    public static void another() {
        System.out.println(ReportElements.Another.getString());
        Report = Report + ReportElements.Another.getString();
        Report = Report + Answers.YesNo() + "\n\n";
        System.out.println("\n\n");

    }

    public static void testAccount() {
        System.out.println(ReportElements.TestAccount.getString());
        Report = Report + ReportElements.TestAccount.getString() + "\n";
        System.out.println("\n\n");

    }

    public static void email() {
        System.out.println(ReportElements.Email.getString());
        String itemE = Scan.scanText();
        if (itemE.equals("-")) {
            Report = Report + ReportElements.Email.getString();
            Report = Report + "qa.ajax+all@gmail.com" + "\n";
        } else {
            Report = Report + ReportElements.Email.getString();
            Report = Report + itemE + "\n";
        }
        System.out.println("\n\n");

    }

    public static void password() {
        System.out.println(ReportElements.Pass.getString());
        String itemPass = Scan.scanText();
        if (itemPass.equals("-")) {
            Report = Report + ReportElements.Pass.getString();
            Report = Report + "ajaxtest" + "\n";
        } else {
            Report = Report + ReportElements.Pass.getString();
            Report = Report + itemPass + "\n";
        }
        System.out.println("\n\n");

    }

    public static void hubName() {
        System.out.println(ReportElements.HubName.getString());
        Report = Report + ReportElements.HubName.getString();
        Report = Report + Scan.scanHubName() + "\n\n";
        System.out.println("\n\n");

    }

    public static void preconditions() {
        System.out.println(ReportElements.Preconditions.getString());
        String itemP = Scan.scanText();
        if (!itemP.equals("-")) {
            Report = Report + ReportElements.Preconditions.getString();
            Report = Report + itemP + "\n\n";
        }
        System.out.println("\n\n");

    }

    public static void description() {
        System.out.println(ReportElements.Description.getString());
        Report = Report + ReportElements.Description.getString();
        Report = Report + Scan.scanText() + "\n\n";
        System.out.println("\n\n");

    }

    public static void commentDescription() {
        System.out.println(ReportElements.Description.getString());
        String itemD = Scan.scanText();
        if (!itemD.equals("-")) {
            Report = Report + ReportElements.Description.getString();
            Report = Report + itemD + "\n\n";
        }        System.out.println("\n\n");


    }

    public static void testStatus() {
        System.out.println(ReportElements.Case.getString() + ReportElements.TestStatus.getString());
        Report = Report + ReportElements.Case.getString() + ReportElements.TestStatus.getString();
        Report = Report + Answers.TestStatus() + "\n\n";
        System.out.println("\n\n");

    }

    public static void stepsToReproduce() {
        System.out.println(ReportElements.StepsToReproduce.getString());
        Report = Report + ReportElements.StepsToReproduce.getString() + "\n\n";
        String space = "-";
        String scan;
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + ": ");
            scan = Scan.scanText();
            if (!scan.equals(space)) {
                Report = Report + i + ": " + scan;
                Report = Report + "\n";
            } else {
                Report = Report + "\n";
                break;
            }
        }
        System.out.println("\n\n");

    }

    public static void AR() {
        System.out.println(ReportElements.AR.getString());
        Report = Report + ReportElements.AR.getString();
        Report = Report + Scan.scanText() + "\n\n";
        System.out.println("\n\n");

    }

    public static void ER() {
        System.out.println(ReportElements.ER.getString());
        Report = Report + ReportElements.ER.getString();
        Report = Report + Scan.scanText() + "\n\n";
        System.out.println("\n\n");

    }

    public static void evidence() {
        System.out.println(ReportElements.Evidence.getString());
        String itemE = Scan.scanText();
        switch (itemE) {
            case "+" -> Report = Report + ReportElements.Evidence.getString() + "\n\n\n\n\n\n\n\n\n";
            case "-" -> {
            }
            default -> {
                System.out.println("Не правильное значение, попробуйте еще раз");
                evidence();
            }
        }
        System.out.println("\n\n");

    }

    public static void AI() {
        System.out.println(ReportElements.AI.getString());
        String itemAI = Scan.scanText();
        if (!itemAI.equals("-")) {
            Report = Report + ReportElements.AI.getString();
            Report = Report + itemAI + "\n\n";
        }
        System.out.println("\n\n");

    }

    public static void timestamp() {
        System.out.println(ReportElements.Timestamp.getString());
        String itemT = Scan.scanText();
        if (!itemT.equals("-")) {
            Report = Report + ReportElements.Timestamp.getString();
            Report = Report + itemT + "\n";
            systemLog();
        }
        System.out.println("\n\n");

    }

    public static void systemLog() {
        System.out.println(ReportElements.SystemLog.getString());
        Report = Report + ReportElements.SystemLog.getString() + "\n";
        System.out.println("\n\n");

    }

    public static void clipboard() {
        System.out.println(Report);
        StringSelection stringSelection = new StringSelection(Report);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        System.out.println("\n\n");

    }

    public static void clipboardIndex(String index) {
        StringSelection stringSelection = new StringSelection(index);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        System.out.println("\n\n");


    }
}
