package main.java.report;

import main.java.report.enums.EnumBug;
import main.java.report.enums.EnumComment;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class ReportElements {

    private static String Report;

   public static void enviroment (){
       System.out.println(EnumBug.Environment.getString()+"\n");
       Report = EnumBug.Environment.getString()+"\n";
   }

   public static void osVersion (String OS){
       if (OS.equals("1")){
           System.out.println(EnumBug.AOSversion.getString());
           Report = Report + EnumBug.AOSversion.getString();
           Report = Report + Scan.scanText()+"\n";
       } else {
           System.out.println(EnumBug.iOSversion.getString());
           Report = Report + EnumBug.iOSversion.getString();
           Report = Report + Scan.scanText() + "\n";
       }
   }
    public static void appVersion (String OS){
        if (OS.equals("1")){
            System.out.println(EnumBug.AOSAppVersion.getString());
            Report = Report + EnumBug.AOSAppVersion.getString();
            Report = Report + Scan.scanText()+"\n";
        } else {
            System.out.println(EnumBug.iOSAppVersion.getString());
            Report = Report + EnumBug.iOSAppVersion.getString();
            Report = Report + Scan.scanText()+"\n\n";
        }
    }

    public static void server () {
        System.out.println(EnumBug.Server.getString());
        Report = Report + EnumBug.Server.getString();
        Report = Report + Answers.Sever()+"\n\n";
    }

    public static void hubVer (){
        System.out.println(EnumBug.HubVer.getString());
        Report = Report + EnumBug.HubVer.getString();
        Report = Report + Scan.scanText()+"\n";
    }

    public static void device (){
        System.out.println(EnumBug.Device.getString());
        Report = Report + EnumBug.Device.getString();
        Report = Report + Scan.scanText()+"\n";
    }

    public static void repeated (){
        System.out.println(EnumBug.Repeated.getString());
        Report = Report + EnumBug.Repeated.getString();
        Report = Report + "\n"+ Answers.HowOften()+"\n";
    }

    public static void inRelease (){
        System.out.println(EnumBug.inRelease.getString());
        Report = Report + EnumBug.inRelease.getString();
        Report = Report + Answers.YesNo()+"\n";
    }

    public static void another (){
        System.out.println(EnumBug.Another.getString());
        Report = Report + EnumBug.Another.getString();
        Report = Report + Answers.YesNo()+"\n\n";
    }

    public static void testAccount(){
        System.out.println(EnumBug.TestAccount.getString());
        Report = Report + EnumBug.Repeated.getString() + "\n";
    }

    public static void email (){
        System.out.println(EnumBug.Email.getString());
        String itemE = Scan.scanText();
        if (itemE.equals("-")) {
            Report = Report + EnumBug.Email.getString();
            Report = Report + "qa.ajax+all@gmail.com" + "\n";
        } else {
            Report = Report + EnumBug.Email.getString();
            Report = Report + itemE + "\n";
        }
    }

    public static void password(){
        System.out.println(EnumBug.Pass.getString());
        String itemPass = Scan.scanText();
        if (itemPass.equals("-")) {
            Report = Report + EnumBug.Pass.getString();
            Report = Report + "qwe" + "\n";
        } else {
            Report = Report + EnumBug.Pass.getString();
            Report = Report + itemPass + "\n";
        }
    }

    public static void hubName (){
        System.out.println(EnumBug.HubName.getString());
        Report = Report + EnumBug.HubName.getString();
        Report = Report + Scan.scanText() + "\n\n";
    }

    public static void preconditions(){
        System.out.println(EnumBug.Preconditions.getString());
        String itemP = Scan.scanText();
        if (itemP.equals("-")) {

        } else {
            Report = Report + EnumBug.Preconditions.getString();
            Report = Report + itemP + "\n\n";
        }
    }

    public static void description(){
        System.out.println(EnumBug.Description.getString());
        Report = Report + EnumBug.Description.getString();
        Report = Report + Scan.scanText() + "\n\n";
    }

    public static void commentDescription(){
        System.out.println(EnumBug.Description.getString());
        String itemD = Scan.scanText();
        if (itemD.equals("-")) {

        } else {
            Report = Report + EnumBug.Description.getString();
            Report = Report + itemD + "\n\n";
        }
    }

    public static void testStatus(){
        System.out.println(EnumComment.TestStatus.getString());
        Report = Report + EnumComment.TestStatus.getString();
        Report = Report + Answers.TestStatus() + "\n\n";
    }

    public static void stepsToReproduce (){
        System.out.println(EnumBug.StepsToReproduce.getString());
        Report = Report + EnumBug.StepsToReproduce.getString();
        String space = "-";
        String scan;
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + ": ");
            scan = Scan.scanText();
            if (!scan.equals(space)) {
                Report = Report + "\n" + i + ": " + scan;
            } else {
                break;
            }
            Report = Report + "\n";
        }
    }

    public static void AR (){
        System.out.println(EnumBug.AR.getString());
        Report = Report + EnumBug.AR.getString();
        Report = Report + Scan.scanText() + "\n\n";
    }

    public static void ER (){
        System.out.println(EnumBug.ER.getString());
        Report = Report + EnumBug.ER.getString();
        Report = Report + Scan.scanText() + "\n\n";
    }

    public static void evidence(){
        System.out.println(EnumComment.Evidence.getString());
        String itemE = Scan.scanText();
        if (itemE.equals("+")) {
            Report = Report + EnumComment.Evidence.getString() + "\n\n\n\n\n\n\n\n\n";
        } else if (itemE.equals("-")){

        } else {
            System.out.println("Не правильное значение, попробуйте еще раз");
            evidence();
        }

    }

    public static void AI (){
        System.out.println(EnumBug.AI.getString());
        String itemAI = Scan.scanText();
        if (itemAI.equals("-")) {

        } else {
            Report = Report + EnumBug.AI.getString();
            Report = Report + itemAI + "\n\n";
        }
    }

    public static void timestamp (){
        System.out.println(EnumBug.Timestamp.getString());
        String itemT = Scan.scanText();
        if (itemT.equals("-")) {

        } else {
            Report = Report + EnumBug.Timestamp.getString();
            Report = Report + itemT + "\n";
            systemLog();
        }
    }

    public static void systemLog (){
        System.out.println(EnumBug.SystemLog.getString());
        Report = Report + EnumBug.SystemLog.getString() + "\n\n\n\n\n\n\n\n\n\n\n";

    }

    public static void clipboard (){
        System.out.println(Report);
        StringSelection stringSelection = new StringSelection(Report);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }
}
