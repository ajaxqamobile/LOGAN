package main.java.report;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.util.Scanner;

public class Report {

    private static String Report;;

    public static void main(String[] args) {
        getReport(getBoC(),getPlatform());
    }

    private static String getPlatform() {
        System.out.println("1 - AOS or 2 - iOS");
        Scanner scan = new Scanner(System.in);
        String BoC = scan.nextLine();
        String item = null;
        if (BoC.equals("1")||BoC.equals("2")) {
            item = BoC;
        }else{
            System.out.println("Не правильное значение, попробуйте еще раз");
            item = getPlatform();
        }
        return item;
    }


    public static void Bug(String OS) {
if (OS.equals("1")){
    System.out.println(Bug.Environment.getString()+"\n");
    Report = Bug.Environment.getString()+"\n\n";

    System.out.println(Bug.AOSversion.getString());
    Report = Report + Bug.AOSversion.getString();
    Report = Report + Scan.scanText()+"\n";

    System.out.println(Bug.AOSAppVersion.getString());
    Report = Report + Bug.AOSAppVersion.getString();
    Report = Report + Scan.scanText()+"\n\n";

    System.out.println(Bug.Server.getString());
    Report = Report + Bug.Server.getString();
    Report = Report + Answer.Sever()+"\n";

    System.out.println(Bug.HubVer.getString());
    Report = Report + Bug.HubVer.getString();
    Report = Report + Scan.scanText()+"\n";

    System.out.println(Bug.Device.getString());
    Report = Report + Bug.Device.getString();
    Report = Report + Scan.scanText()+"\n\n";

    System.out.println(Bug.Repeated.getString());
    Report = Report + Bug.Repeated.getString();
    Report = Report + Answer.HowOften()+"\n";

    System.out.println(Bug.inRelease.getString());
    Report = Report + Bug.inRelease.getString();
    Report = Report + Answer.YesNo()+"\n";

    System.out.println(Bug.Another.getString());
    Report = Report + Bug.Another.getString();
    Report = Report + Answer.YesNo()+"\n\n";

    System.out.println(Bug.TestAccount.getString());
    Report = Report + Bug.Repeated.getString()+"\n";

    System.out.println(Bug.Email.getString());
    Report = Report + Bug.Email.getString();
    Report = Report + Scan.scanText()+"\n";

    System.out.println(Bug.Pass.getString());
    Report = Report + Bug.Pass.getString();
    Report = Report + Scan.scanText()+"\n";

    System.out.println(Bug.HubName.getString());
    Report = Report + Bug.HubName.getString();
    Report = Report + Scan.scanText()+"\n\n";

    System.out.println(Bug.Preconditions.getString());
    String itemP = Scan.scanText();
    if (itemP.equals("-")){

    } else {
        Report = Report + Bug.Preconditions.getString();
        Report = Report + itemP+"\n\n";
    }

    System.out.println(Bug.Description.getString());
    Report = Report + Bug.Description.getString();
    Report = Report + Scan.scanText()+"\n\n";

    System.out.println(Bug.StepsToReproduce.getString());
    Report = Report + Bug.StepsToReproduce.getString();
    Report = Report + Scan.scanText()+"\n\n";

    System.out.println(Bug.AR.getString());
    Report = Report + Bug.AR.getString();
    Report = Report + Scan.scanText()+"\n\n";

    System.out.println(Bug.ER.getString());
    Report = Report + Bug.ER.getString();
    Report = Report + Scan.scanText()+"\n\n";

    System.out.println(Bug.AI.getString());
    String itemAI = Scan.scanText();
    if (itemAI.equals("-")){

    } else {
        Report = Report + Bug.AI.getString();
        Report = Report + itemAI+"\n\n";
    }

    System.out.println(Bug.Timestamp.getString());
    String itemT = Scan.scanText();
    if (itemT.equals("-")){

    } else {
        Report = Report + Bug.Timestamp.getString();
        Report = Report + itemT+"\n";
    }

    System.out.println(Bug.SystemLog.getString());
    Report = Report + Bug.SystemLog.getString()+"\n\n\n\n\n\n\n\n\n\n\n";

    System.out.println(Report);
    StringSelection stringSelection = new StringSelection(Report);
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents(stringSelection, null);
} else {
    System.out.println(Bug.Environment.getString()+"\n");
    Report = Bug.Environment.getString()+"\n\n";

    System.out.println(Bug.iOSversion.getString());
    Report = Report + Bug.iOSversion.getString();
    Report = Report + Scan.scanText()+"\n";

    System.out.println(Bug.iOSAppVersion.getString());
    Report = Report + Bug.iOSAppVersion.getString();
    Report = Report + Scan.scanText()+"\n\n";

    System.out.println(Bug.Server.getString());
    Report = Report + Bug.Server.getString();
    Report = Report + Answer.Sever()+"\n";

    System.out.println(Bug.HubVer.getString());
    Report = Report + Bug.HubVer.getString();
    Report = Report + Scan.scanText()+"\n";

    System.out.println(Bug.Device.getString());
    Report = Report + Bug.Device.getString();
    Report = Report + Scan.scanText()+"\n\n";

    System.out.println(Bug.Repeated.getString());
    Report = Report + Bug.Repeated.getString();
    Report = Report + Answer.HowOften()+"\n";

    System.out.println(Bug.inRelease.getString());
    Report = Report + Bug.inRelease.getString();
    Report = Report + Answer.YesNo()+"\n";

    System.out.println(Bug.Another.getString());
    Report = Report + Bug.Another.getString();
    Report = Report + Answer.YesNo()+"\n\n";

    System.out.println(Bug.TestAccount.getString());
    Report = Report + Bug.Repeated.getString()+"\n";

    System.out.println(Bug.Email.getString());
    Report = Report + Bug.Email.getString();
    Report = Report + Scan.scanText()+"\n";

    System.out.println(Bug.Pass.getString());
    Report = Report + Bug.Pass.getString();
    Report = Report + Scan.scanText()+"\n";

    System.out.println(Bug.HubName.getString());
    Report = Report + Bug.HubName.getString();
    Report = Report + Scan.scanText()+"\n\n";

    System.out.println(Bug.Preconditions.getString());
    String itemP = Scan.scanText();
    if (itemP.equals("-")){

    } else {
        Report = Report + Bug.Preconditions.getString();
        Report = Report + itemP+"\n\n";
    }

    System.out.println(Bug.Description.getString());
    Report = Report + Bug.Description.getString();
    Report = Report + Scan.scanText()+"\n\n";

    System.out.println(Bug.StepsToReproduce.getString());
    Report = Report + Bug.StepsToReproduce.getString();
    Report = Report + Scan.scanText()+"\n\n";

    System.out.println(Bug.AR.getString());
    Report = Report + Bug.AR.getString();
    Report = Report + Scan.scanText()+"\n\n";

    System.out.println(Bug.ER.getString());
    Report = Report + Bug.ER.getString();
    Report = Report + Scan.scanText()+"\n\n";

    System.out.println(Bug.AI.getString());
    String itemAI = Scan.scanText();
    if (itemAI.equals("-")){

    } else {
        Report = Report + Bug.AI.getString();
        Report = Report + itemAI+"\n\n";
    }

    System.out.println(Bug.Timestamp.getString());
    String itemT = Scan.scanText();
    if (itemT.equals("-")){

    } else {
        Report = Report + Bug.Timestamp.getString();
        Report = Report + itemT+"\n";
    }

    System.out.println(Bug.SystemLog.getString());
    Report = Report + Bug.SystemLog.getString()+"\n\n\n\n\n\n\n\n\n\n\n";


    System.out.println(Report);
    StringSelection stringSelection = new StringSelection(Report);
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents(stringSelection, null);
}

    }

    public static void Comment(String OS) {
        if (OS.equals("1")){

            System.out.println(Bug.Environment.getString()+"\n");
            Report = Bug.Environment.getString()+"\n";

            System.out.println(Bug.AOSAppVersion.getString());
            Report = Report + Bug.AOSAppVersion.getString();
            Report = Report + Scan.scanText()+"\n";

            System.out.println(Bug.Device.getString());
            Report = Report + Bug.Device.getString();
            Report = Report + Scan.scanText()+"\n";

            System.out.println(Bug.Server.getString());
            Report = Report + Bug.Server.getString();
            Report = Report + Answer.Sever()+"\n\n";

            System.out.println(Bug.Description.getString());
            String itemD = Scan.scanText();
            if (itemD.equals("-")){

            } else {
                Report = Report + Bug.Description.getString();
                Report = Report + itemD+"\n";
            }


            System.out.println(Comment.TestStatus.getString());
            Report = Report + Comment.TestStatus.getString();
            Report = Report + Answer.TestStatus()+"\n\n";

            System.out.println(Bug.AI.getString());
            String itemAI = Scan.scanText();
            if (itemAI.equals("-")){

            } else {
                Report = Report + Bug.AI.getString();
                Report = Report + itemAI+"\n\n";
            }

            System.out.println(Comment.Evidence.getString());
            Report = Report + Comment.Evidence.getString()+"\n\n\n\n\n\n\n\n\n";

            System.out.println(Report);
            StringSelection stringSelection = new StringSelection(Report);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        } else {
            System.out.println(Bug.Environment.getString()+"\n");
            Report = Bug.Environment.getString()+"\n";

            System.out.println(Bug.iOSAppVersion.getString());
            Report = Report + Bug.iOSAppVersion.getString();
            Report = Report + Scan.scanText()+"\n";

            System.out.println(Bug.Device.getString());
            Report = Report + Bug.Device.getString();
            Report = Report + Scan.scanText()+"\n";

            System.out.println(Bug.Server.getString());
            Report = Report + Bug.Server.getString();
            Report = Report + Answer.Sever()+"\n\n";

            System.out.println(Bug.Description.getString());
            String itemD = Scan.scanText();
            if (itemD.equals("-")){

            } else {
                Report = Report + Bug.Description.getString();
                Report = Report + itemD+"\n";
            }

            System.out.println(Comment.TestStatus.getString());
            Report = Report + Comment.TestStatus.getString();
            Report = Report + Answer.TestStatus()+"\n\n";

            System.out.println(Bug.AI.getString());
            String itemAI = Scan.scanText();
            if (itemAI.equals("-")){

            } else {
                Report = Report + Bug.AI.getString();
                Report = Report + itemAI+"\n\n";
            }

            System.out.println(Comment.Evidence.getString());
            Report = Report + Comment.Evidence.getString()+"\n\n\n\n\n\n\n\n\n";

            System.out.println(Report);
        }
        StringSelection stringSelection = new StringSelection(Report);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }


    public static String getBoC() {
        System.out.println("1 - Bug or 2 - Comment");
        Scanner scan = new Scanner(System.in);
        String BoC = scan.nextLine();
        String item;
        if (BoC.equals("1")||BoC.equals("2")) {
            item = BoC;
        }else{
            System.out.println("Не правильное значение, попробуйте еще раз");
            item = getBoC();
        }
        return item;
    }

    public static void getReport(String item, String OS) {
        if (item.equals("1")){
            Bug(OS);
        } else if (item.equals("2")){
            Comment(OS);
        }
        getReport(getBoC(),getPlatform());
    }

}
