package main.java.report;

import main.java.report.enums.ReportElements;
import main.java.report.lists.HubTypes;
import main.java.report.lists.Phones;
import main.java.report.lists.lastData;
import main.java.report.mainClass.Main;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;

public class ReportMethods {

    public static void enviroment() {
        String res;
        System.out.println(ReportElements.Environment.getString() + "\n");
        res = ReportElements.Environment.getString() + "\n";
        System.out.println("\n\n");
        lastData.enviroment = res;
    }

    public static void appVersion(String OS) throws IOException, InterruptedException {
        String res = null;
        switch (OS) {
            case "1" -> {
                System.out.println(ReportElements.AOSAppVersion.getString());
                res = ReportElements.AOSAppVersion.getString();
                res = res + Scan.scanAppVer() + "\n";
            }
            case "2" -> {
                System.out.println(ReportElements.iOSAppVersion.getString());
                res = ReportElements.iOSAppVersion.getString();
                res = res + Scan.scanAppVer() + "\n";
            }
            case "3" -> {
                System.out.println(ReportElements.DesktopAppVersion.getString());
                res = ReportElements.DesktopAppVersion.getString();
                res = res + Scan.scanAppVer() + "\n";
            }
            case "reboot", "r" -> Main.retry();
        }
        System.out.println("\n\n");
        lastData.appVer = res;
    }

    public static void server() throws IOException, InterruptedException {
        String res;
        System.out.println(ReportElements.Server.getString());
        res = ReportElements.Server.getString();
        res = res + Answers.Sever() + "\n\n";
        System.out.println("\n\n");
        lastData.sever = res;
    }

    public static void hubType() {
        String res;
        System.out.println(res = ReportElements.HubType.getString());
        res = res + HubTypes.getType() + "\n";
        System.out.println("\n\n");
        lastData.hubType = res;
    }

    public static void hubVer() throws IOException, InterruptedException {
        String res;
        System.out.println(ReportElements.HubVer.getString());
        res = ReportElements.HubVer.getString();
        res = res + Scan.scanHubVer() + "\n";
        System.out.println("\n\n");
        lastData.hubVer = res;
    }

    public static void device(String OS) throws IOException, InterruptedException {
        String res;
        System.out.println(ReportElements.Device.getString());
        res = ReportElements.Device.getString();
        res = res + Phones.getPhone(OS) + "\n\n";
        System.out.println("\n\n");
        lastData.phone = res;
    }

    public static void commentDevice(String OS) throws IOException, InterruptedException {
        String res;
        System.out.println(ReportElements.Device.getString());
        res = ReportElements.Device.getString();
        res = res + Phones.getPhone(OS) + "\n";
        System.out.println("\n\n");
        lastData.phone = res;
    }

    public static void repeated() throws IOException, InterruptedException {
        String res;
        System.out.println(ReportElements.Repeated.getString());
        res = "\n" + ReportElements.Repeated.getString();
        res = res + Answers.HowOften() + "\n";
        System.out.println("\n\n");
        lastData.repeated = res;
    }

    public static void inRelease() throws IOException, InterruptedException {
        String res;
        System.out.println(ReportElements.inRelease.getString());
        res = ReportElements.inRelease.getString();
        res = res + Answers.YesNo() + "\n";
        System.out.println("\n\n");
        lastData.inRelease = res;
    }

    public static void another() throws IOException, InterruptedException {
        String res;
        System.out.println(ReportElements.Another.getString());
        res = ReportElements.Another.getString();
        res = res + Answers.YesNo() + "\n\n";
        System.out.println("\n\n");
        lastData.another = res;
    }

    public static void testAccount() {
        System.out.println(ReportElements.TestAccount.getString());
        lastData.testAccount = ReportElements.TestAccount.getString() + "\n";
        System.out.println("\n\n");
    }

    public static void email() throws IOException, InterruptedException {
        String res;
        System.out.println(ReportElements.Email.getString());
        String itemE = Scan.scanText();
        if (itemE.equals("main")) {
            res = ReportElements.Email.getString();
            res = res + "qa.ajax.alex@gmail.com" + "\n";
        } else if (itemE.equals("pro")) {
            res = ReportElements.Email.getString();
            res = res + "qa.ajax.alex@gmail.com" + "\n";
        } else {
            res = ReportElements.Email.getString();
            res = res + itemE + "\n";
        }
        System.out.println("\n\n");
        lastData.email = res;
    }

    public static void password() throws IOException, InterruptedException {
        String res;
        System.out.println(ReportElements.Pass.getString());
        String itemPass = Scan.scanText();
        if (itemPass.equals("main")) {
            res = ReportElements.Pass.getString();
            res = res + "qwer" + "\n";
        } else if (itemPass.equals("pro")) {
            res = ReportElements.Pass.getString();
            res = res + "qwer" + "\n";
        } else {
            res = ReportElements.Pass.getString();
            res = res + itemPass + "\n";
        }
        System.out.println("\n\n");
        lastData.password = res;
    }

    public static void hubName() throws IOException, InterruptedException {
        String res;
        System.out.println(ReportElements.HubName.getString());
        res = ReportElements.HubName.getString();
        res = res + Scan.scanHubName() + "\n\n";
        System.out.println("\n\n");
        lastData.hubName = res;
    }

    public static void preconditions() throws IOException, InterruptedException {
        String res;
        System.out.println(ReportElements.Preconditions.getString());
        String itemP = Scan.scanText();
        if (!itemP.equals("-")) {
            res = ReportElements.Preconditions.getString();
            res = res + itemP + "\n\n";
            lastData.preconditions = res;
        } else {
            lastData.preconditions = "";
        }
        System.out.println("\n\n");
    }

    public static void description() throws IOException, InterruptedException {
        String res;
        System.out.println(ReportElements.Description.getString());
        res = ReportElements.Description.getString();
        res = res + Scan.scanText() + "\n\n";
        System.out.println("\n\n");
        lastData.description = res;
    }

    public static void commentDescription() throws IOException, InterruptedException {
        String res;
        System.out.println(ReportElements.Description.getString());
        String itemD = Scan.scanText();
        if (!itemD.equals("-")) {
            res = ReportElements.Description.getString();
            res = res + itemD + "\n\n";
            System.out.println("\n\n");
            lastData.commentDescription = res;
        } else {
            lastData.commentDescription = "";
        }
    }

    public static void testStatus() throws IOException, InterruptedException {
        String res;
        System.out.println(ReportElements.Case.getString() + ReportElements.TestStatus.getString());
        res = ReportElements.Case.getString() + ReportElements.TestStatus.getString();
        res = res + Answers.TestStatus() + "\n\n";
        System.out.println("\n\n");
        lastData.testStatus = res;
    }

    public static void stepsToReproduce() throws IOException, InterruptedException {
        String res;
        System.out.println(ReportElements.StepsToReproduce.getString());
        res = ReportElements.StepsToReproduce.getString() + "\n\n";
        String space = "-";
        String scan;
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + ": ");
            scan = Scan.scanText();
            if (!scan.equals(space)) {
                res = res + i + ": " + scan;
                res = res + "\n";
                lastData.stepsToReproduce = res;
            } else {
                res = res + "\n";
                lastData.stepsToReproduce = res;
                break;
            }
        }
        System.out.println("\n\n");
    }

    public static void AR() throws IOException, InterruptedException {
        String res;
        System.out.println(ReportElements.AR.getString());
        res = ReportElements.AR.getString();
        res = res + Scan.scanText() + "\n\n";
        System.out.println("\n\n");
        lastData.AR = res;
    }

    public static void ER() throws IOException, InterruptedException {
        String res;
        System.out.println(ReportElements.ER.getString());
        res = ReportElements.ER.getString();
        res = res + Scan.scanText() + "\n\n";
        System.out.println("\n\n");
        lastData.ER = res;
    }

    public static void evidence() throws IOException, InterruptedException {
        System.out.println(ReportElements.Evidence.getString());
        String itemE = Scan.scanText();
        switch (itemE) {
            case "+" -> lastData.evidence = ReportElements.Evidence.getString() + "\n\n\n\n\n\n\n\n\n";
            case "-" -> {
                lastData.evidence = "";
            }
            case "reboot", "r" -> Main.retry();
            default -> {
                System.out.println("Не правильное значение, попробуйте еще раз");
                evidence();
            }
        }
        System.out.println("\n\n");
    }

    public static void AI() throws IOException, InterruptedException {
        System.out.println(ReportElements.AI.getString());
        String itemAI = Scan.scanText();
        if (!itemAI.equals("-")) {
            lastData.AI = ReportElements.AI.getString();
            lastData.AI = lastData.AI + itemAI + "\n\n";
        } else {
            lastData.AI = "";
        }
        System.out.println("\n\n");
    }

    public static void timestamp() throws IOException, InterruptedException {
        String res;
        System.out.println(ReportElements.Timestamp.getString());
        String itemT = Scan.scanText();
        if (!itemT.equals("-")) {
            res = ReportElements.Timestamp.getString();
            res = res + itemT + "\n";
            systemLog();
            lastData.timestamp = res;
        } else {
            lastData.timestamp = "";
        }
        System.out.println("\n\n");
    }

    public static void systemLog() {
        String res;
        System.out.println(ReportElements.SystemLog.getString());
        res = ReportElements.SystemLog.getString() + "\n";
        System.out.println("\n\n");
        lastData.systemLog = res;
    }

    public static void clipboardBugReport() {
        String finalRepor =
                lastData.enviroment +
                        lastData.appVer +
                        lastData.phone +
                        lastData.sever +
                        lastData.hubType +
                        lastData.hubVer +
                        lastData.repeated +
                        lastData.inRelease +
                        lastData.another +
                        lastData.testAccount +
                        lastData.email +
                        lastData.password +
                        lastData.hubName +
                        lastData.preconditions +
                        lastData.description +
                        lastData.stepsToReproduce +
                        lastData.AR +
                        lastData.ER +
                        lastData.AI +
                        lastData.timestamp;
        System.out.println(finalRepor);
        StringSelection stringSelection = new StringSelection(finalRepor);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        System.out.println("\n\n");
    }

    public static void clipboardComment() {
        String finalRepor =
                lastData.enviroment +
                        lastData.appVer +
                        lastData.phone +
                        lastData.hubType +
                        lastData.hubVer +
                        lastData.sever +
                        lastData.testStatus +
                        lastData.commentDescription +
                        lastData.AI +
                        lastData.evidence;

        System.out.println(finalRepor);
        StringSelection stringSelection = new StringSelection(finalRepor);
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
