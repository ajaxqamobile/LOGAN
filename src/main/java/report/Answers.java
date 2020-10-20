package main.java.report;

public class Answers {

    public static String YesNo() {
        String Answer;
        System.out.println("1 - Yes \n2 - No");
        String scan = Scan.scanText();
        switch (scan) {
            case "1" -> Answer = "Yes";
            case "2" -> Answer = "No";
            default -> {
                System.out.println("Не правильное значение, попробуйте еще раз");
                Answer = YesNo();
            }
        }
        return Answer;
    }

    public static String HowOften() {
        String Answer;
        System.out.println("1 - Always \n2 - Rarely \n3 - Failed to retry");
        String scan = Scan.scanText();
        switch (scan) {
            case "1" -> Answer = "Always";
            case "2" -> Answer = "Rarely";
            case "3" -> Answer = "Failed to retry";
            default -> {
                System.out.println("Не правильное значение, попробуйте еще раз");
                Answer = HowOften();
            }
        }
        return Answer;
    }

    public static String Sever() {
        String Answer;
        System.out.println("1 - Release \n2 - Stage");
        String scan = Scan.scanText();
        switch (scan) {
            case "1" -> Answer = "Release";
            case "2" -> Answer = "Stage";
            default -> {
                System.out.println("Не правильное значение, попробуйте еще раз");
                Answer = Sever();
            }
        }
        return Answer;
    }


    public static String TestStatus() {
        String Answer;
        System.out.println("1 - Done!✅ \n2 - Fail❌ \n3 - Not reproduced!✅ \n4 - In Progress!\uD83D\uDD53");
        String scan = Scan.scanText();
        switch (scan) {
            case "1" -> Answer = "Done!✅";
            case "2" -> Answer = "Fail❌";
            case "3" -> Answer = "Not reproduced!✅";
            case "4" -> Answer = "In Progress!\uD83D\uDD53";
            default -> {
                System.out.println("Не правильное значение, попробуйте еще раз");
                Answer = TestStatus();
            }
        }
        return Answer;
    }
}
