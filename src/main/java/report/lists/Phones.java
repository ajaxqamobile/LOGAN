package main.java.report.lists;

import main.java.report.Scan;
import main.java.report.enums.qaPhones;
import main.java.report.mainClass.Main;

import java.io.IOException;

public class Phones {

    public static String currentPhone;

    public static String[] androidPhones =
            {qaPhones.GalaxyS9.getString(),
                    qaPhones.XiaomiRedmiNote7.getString(),
                    qaPhones.SamsungGalaxyA5.getString(),
                    qaPhones.GooglePixel3a.getString(),
                    qaPhones.SamsungGalaxyS4.getString(),
                    qaPhones.XiaomiMIA2.getString(),
                    qaPhones.NexusP6.getString(),
                    qaPhones.Prestigio.getString(),
                    qaPhones.MeizuPRO6.getString(),
                    qaPhones.HuaweiPSmart.getString(),
                    qaPhones.SamsungGalaxyA51.getString(),
                    qaPhones.Vivo1920.getString()};

    public static String[] desktopPhones =
            {"MacBook Air/Pro",
                    "Windows PC"};

    public static String[] androidOS =
            {"Android version: 10.0",
                    "Android version: 9.0",
                    "Android version: 5.1.1",
                    "Android version: 11.0 Beta",
                    "Android version: 5.1",
                    "Android version: 9.0",
                    "Android version: 10.0",
                    "Android version: 4.4.2",
                    "Android version: 6.0",
                    "Android version: 9.0",
                    "Android version: 10.0",
                    "Android version: 10.0"};

    public static String[] iOSPhones =
            {qaPhones.AppleWatch1.getString(),
                    qaPhones.AppleWatch3.getString(),
                    qaPhones.AppleWatch5.getString(),
                    qaPhones.iPhone7.getString(),
                    qaPhones.iPhone4s.getString(),
                    qaPhones.iPhoneSE.getString(),
                    qaPhones.iPhoneX.getString(),
                    qaPhones.iPhoneXS.getString(),
                    qaPhones.iPhone6.getString(),
                    qaPhones.iPhone6s.getString(),
                    qaPhones.iPhoneSE2020.getString(),
                    qaPhones.iPhone8Plus.getString(),
                    qaPhones.iPhoneXR.getString(),
            };

    public static String[] iOSOS =
            {"WatchOS version: 4.3.2",
                    "WatchOS version: 7.0",
                    "WatchOS version: 7.2 Beta",
                    "iOS version: 13.5.1",
                    "iOS version: 9.3.5",
                    "iOS version: 13.6.1",
                    "iOS version: 13.6",
                    "iOS version: 14.3 Beta",
                    "iOS version: 12.4.1",
                    "iOS version: 12.4",
                    "iOS version: 13.5.1",
                    "iOS version: 14.2",
                    "iOS version: 14.2"};

    public static String[] desktopOS =
            {"Desktop version: macOS Big Sur 11",
                    "Desktop version: Windows 10"};

    public static String getPhone(String OS) throws IOException, InterruptedException {
        int count = 1;
        switch (OS) {
            case "1" -> {
                for (String i : androidPhones) {
                    System.out.println(count + ": " + i);
                    count++;
                }
                currentPhone = Scan.scanPhone(count, OS);
            }
            case "2" -> {
                for (String i : iOSPhones) {
                    System.out.println(count + ": " + i);
                    count++;
                }
                currentPhone = Scan.scanPhone(count, OS);
            }

            case "3" -> {
                for (String i : desktopPhones) {
                    System.out.println(count + ": " + i);
                    count++;
                }
                currentPhone = Scan.scanPhone(count, OS);
            }

            case "reboot" -> Main.retry();
        }
        lastData.phone = currentPhone;
        return currentPhone;
    }
}