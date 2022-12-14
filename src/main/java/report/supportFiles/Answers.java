package report.supportFiles;

import report.mainClass.Main;

import java.io.IOException;

public class Answers {

    public static String YesNo() throws IOException, InterruptedException {
        String Answer = null;
        System.out.println("1 - Yes \n2 - No");
        String scan = Scan.scanText();
        switch (scan) {
            case "1" -> Answer = "Yes";
            case "2" -> Answer = "No";
            case "reboot","r" -> Main.retry();
            default -> {
                System.out.println("Неверное значение, попробуйте еще раз!");
                Answer = YesNo();
            }
        }
        return Answer;
    }

    public static String HowOften() throws IOException, InterruptedException {
        String Answer = null;
        System.out.println("1 - Always \n2 - Rarely \n3 - Failed to retry \n4 - Once");
        String scan = Scan.scanText();
        switch (scan) {
            case "1" -> Answer = "Always";
            case "2" -> Answer = "Rarely";
            case "3" -> Answer = "Failed to retry";
            case "4" -> Answer = "Once";
            case "reboot", "r" -> Main.retry();
            default -> {
                System.out.println("Неверное значение, попробуйте еще раз!");
                Answer = HowOften();
            }
        }
        return Answer;
    }

    public static String Sever() throws IOException, InterruptedException {
        String Answer = null;
        System.out.println("1 - Release \n2 - Stage A \n3 - Stage B \n4 - Stage C \n5 - Custom|Meteora");
        String scan = Scan.scanText();
        switch (scan) {
            case "1" -> Answer = "Release";
            case "2" -> Answer = "Stage A";
            case "3" -> Answer = "Stage B";
            case "4" -> Answer = "Stage C";
            case "5" -> Answer = "Custom|Meteora";
            case "reboot", "r" -> Main.retry();
            default -> {
                System.out.println("Неверное значение, попробуйте еще раз!");
                Answer = Sever();
            }
        }

        return Answer;
    }


    public static String TestStatus() throws IOException, InterruptedException {
        String Answer = null;
        System.out.println("1 - Done!✅ \n2 - Fail!❌ \n3 - Not reproduced!✅ \n4 - In Progress!\uD83D\uDD53");
        String scan = Scan.scanText();
        switch (scan) {
            case "1" -> Answer = "Done!✅";
            case "2" -> Answer = "Fail!❌";
            case "3" -> Answer = "Not reproduced!✅";
            case "4" -> Answer = "In Progress!\uD83D\uDD53";
            case "reboot", "r" -> Main.retry();
            default -> {
                System.out.println("Неверное значение, попробуйте еще раз!");
                Answer = TestStatus();
            }
        }
        return Answer;
    }
}
