package main.java.report.lists;

import main.java.report.Scan;

public class HubTypes {

    public static String currentHubType;

    public static String[] hubTypes = {"Hub 1",
            "Hub Plus",
            "Hub 2",
            "Hub 2 Plus",
            "Yavir",
            "Yavir Plus"};

    public static String getType() {
        int count = 1;
        for (String i : hubTypes) {
            System.out.println(count + ": " + i);
            count++;
        }
        currentHubType = Scan.scanHubType(count);
        return currentHubType;
    }
}
