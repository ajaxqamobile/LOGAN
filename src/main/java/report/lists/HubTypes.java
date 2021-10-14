package main.java.report.lists;

import main.java.report.supportFiles.Scan;

public class HubTypes {

    public static String currentHubType;

    public static String[] hubTypes = {

            "Hub",
            "Hub Plus",
            "Hub 2",
            "Hub 2 Plus",
            "Hub 3",
            "Hub 3 Plus",
            "Hub Hybrid",
            "Hub Hybrid (4G)",
            "Hub Lite",
            "Yavir",
            "Yavir Plus",

    };

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
