package main.java.report;

import java.util.Scanner;

public class Scan {

    public static String scanText () {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        if (text.equals("")){
            System.out.println("Не правильное значение, попробуйте еще раз");
           scanText();
        }
        return text;

    }
}
