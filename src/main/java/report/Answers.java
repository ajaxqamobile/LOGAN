package main.java.report;

public class Answers {

    public static String YesNo () {
        String Answer;
        System.out.println("1 - Yes or 2 - No");
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
        System.out.println("1 - Always, 2 - Rarely or 3 - Failed to retry");
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
        System.out.println("1 - Release or 2 - Stage");
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
        System.out.println("1 - Done!✅, 2 - Fail❌ or 3 - Not reproduced!✅");
        String scan = Scan.scanText();
        if (scan.equals("1")) {
            Answer = "Done!✅";
        } else if (scan.equals("2")){
            Answer = "Fail❌";
        } else if (scan.equals("3")){
            Answer = "Not reproduced!✅";
        } else {
            System.out.println("Не правильное значение, попробуйте еще раз");
           Answer = TestStatus();
        }
        return Answer;
    }
}
