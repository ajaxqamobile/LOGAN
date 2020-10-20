package main.java.report;

import main.java.report.enums.HubTypes;

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

    public static String scanHubType (int count) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int i = Integer.parseInt(text);
        String currentType = "null";
        if (text.equals("")|| i < 0 || i > count){
            System.out.println("Не правильное значение, попробуйте еще раз");
            scanHubType(count);
        } else {
            currentType = HubTypes.hubTypes[i-1];
        }
        return currentType;
    }

    public static String scanPhone (int count,String OS) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String currentPhone = "null";
        int i = Integer.parseInt(text);
        if (text.equals("") || i < 0 || i > count) {
            System.out.println("Не правильное значение, попробуйте еще раз");
            scanPhone(count, OS);
        } else if (OS.equals("1")) {
            i--;
            currentPhone = Phones.androidPhones[i];
        } else if (OS.equals("2")) {
            i--;
            currentPhone = Phones.iOSPhones[i];
        }
        return currentPhone;
    }
}
