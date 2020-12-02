package main.java.report.lists;

import main.java.report.Scan;
import main.java.report.enums.mobileOS;
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
                    qaPhones.Vivo1920.getString(),
            qaPhones.HuaweiNova5T.getString(),
            qaPhones.GalaxyA20s.getString()};

    public static String[] desktopPhones =
            {qaPhones.MacBook.getString(),
                    qaPhones.WindowsPC.getString()};

    public static String[] androidOS =
            {mobileOS.AndroidOS.getString("10.0"),
                    mobileOS.AndroidOS.getString("9.0"),
                    mobileOS.AndroidOS.getString("5.1.1"),
                    mobileOS.AndroidOS.getString("11.0 Beta"),
                    mobileOS.AndroidOS.getString("5.1"),
                    mobileOS.AndroidOS.getString("9.0"),
                    mobileOS.AndroidOS.getString("10.0"),
                    mobileOS.AndroidOS.getString("4.4.2"),
                    mobileOS.AndroidOS.getString("6.0"),
                    mobileOS.AndroidOS.getString("9.0"),
                    mobileOS.AndroidOS.getString("10.0"),
                    mobileOS.AndroidOS.getString("10.0"),
                    mobileOS.AndroidOS.getString("9.0"),
                    mobileOS.AndroidOS.getString("10.0")
            };

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
            {mobileOS.WatchOS.getString("4.3.2"),
                    mobileOS.WatchOS.getString("7.0"),
                    mobileOS.WatchOS.getString("7.3 Beta"),
                    mobileOS.iOS.getString("13.5.1"),
                    mobileOS.iOS.getString("9.3.5"),
                    mobileOS.iOS.getString("13.6.1"),
                    mobileOS.iOS.getString("13.6"),
                    mobileOS.iOS.getString("14.3 Beta"),
                    mobileOS.iOS.getString("12.4.1"),
                    mobileOS.iOS.getString("12.4"),
                    mobileOS.iOS.getString("13.5.1"),
                    mobileOS.iOS.getString("14.2"),
                    mobileOS.iOS.getString("14.2")};

    public static String[] desktopOS =
            {mobileOS.MacOS.getString("11"),
                    mobileOS.WindowsOS.getString("10")};

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