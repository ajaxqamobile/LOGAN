package main.java.report;

public class Answers {

    public static String YesNo () {
        String Answer;
        System.out.println("1 - Yes \n2 - No");
        String scan = Scan.scanText();
        if (scan.equals("1")) {
            Answer = "Yes";
        } else if (scan.equals("2")){
            Answer = "No";
        } else {
            System.out.println("Не правильное значение, попробуйте еще раз");
            Answer = YesNo();
        }
        return Answer;
    }

    public static String HowOften () {
        String Answer;
        System.out.println("1 - Always \n2 - Rarely \n3 - Failed to retry");
        String scan = Scan.scanText();
        if (scan.equals("1")) {
            Answer = "Always";
        } else if (scan.equals("2")){
            Answer = "Rarely";
        } else if (scan.equals("3")) {
            Answer = "Failed to retry";
        } else {
            System.out.println("Не правильное значение, попробуйте еще раз");
            Answer = HowOften();
        }
        return Answer;
    }

    public static String Sever () {
        String Answer;
        System.out.println("1 - Release \n2 - Stage");
        String scan = Scan.scanText();
        if (scan.equals("1")) {
            Answer = "Release";
        } else if (scan.equals("2")) {
            Answer = "Stage";
        } else {
            System.out.println("Не правильное значение, попробуйте еще раз");
            Answer = Sever();
        }
        return Answer;
    }


    public static String TestStatus () {
        String Answer;
        System.out.println("1 - Done!✅ \n2 - Fail❌ \n3 - Not reproduced!✅ \n4 - In Progress!\uD83D\uDD53");
        String scan = Scan.scanText();
        if (scan.equals("1")) {
            Answer = "Done!✅";
        } else if (scan.equals("2")){
            Answer = "Fail❌";
        } else if (scan.equals("3")){
            Answer = "Not reproduced!✅";
        } else if (scan.equals("4")){
            Answer = "In Progress!\uD83D\uDD53";
        }else {
            System.out.println("Не правильное значение, попробуйте еще раз");
           Answer = TestStatus();
        }
        return Answer;
    }
}
