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
                    qaPhones.MeizuM6T.getString(),
                    qaPhones.NexusP6.getString(),
                    qaPhones.Prestigio.getString(),
                    qaPhones.MeizuPRO6.getString(),
                    qaPhones.HuaweiPSmart.getString(),
                    qaPhones.SamsungGalaxyA51.getString(),
                    qaPhones.Vivo1920.getString(),
                    qaPhones.HuaweiNova5T.getString(),
                    qaPhones.GalaxyA20s.getString(),
                    qaPhones.XiaomiRedmiNote2.getString(),
                    qaPhones.Lenovo.getString(),
                    qaPhones.Nokia5_3.getString(),
                    qaPhones.MotoG8.getString(),
                    qaPhones.SamsungGalaxyM21.getString(),
                    qaPhones.SamsungGalaxyS20.getString(),
                    qaPhones.RedmiNote9Pro.getString(),
                    qaPhones.RedmiNote9.getString(),
                    qaPhones.HuaweiP40.getString(),
                    qaPhones.XiaomiRedmi3s.getString(),
                    qaPhones.XiaomiMi11.getString(),
                    qaPhones.One_Plus_8T.getString(),
                    qaPhones.Alcatel.getString(),
                    qaPhones.SamsungGalaxyM12.getString(),
                    qaPhones.SonyXperia10.getString(),

            };

    public static String[] desktopPhones =
            {qaPhones.MacBook.getString(),
                    qaPhones.WindowsPC.getString()};

    public static String[] androidOS =
            {qaPhones.GalaxyS9_OS.getString(),
                    qaPhones.XiaomiRedmiNote7_OS.getString(),
                    qaPhones.SamsungGalaxyA5_OS.getString(),
                    qaPhones.GooglePixel3a_OS.getString(),
                    qaPhones.SamsungGalaxyS4_OS.getString(),
                    qaPhones.XiaomiMIA2_OS.getString(),
                    qaPhones.MeizuM6T_OS.getString(),
                    qaPhones.NexusP6_OS.getString(),
                    qaPhones.Prestigio_OS.getString(),
                    qaPhones.MeizuPRO6_OS.getString(),
                    qaPhones.HuaweiPSmart_OS.getString(),
                    qaPhones.SamsungGalaxyA51_OS.getString(),
                    qaPhones.Vivo1920_OS.getString(),
                    qaPhones.HuaweiNova5T_OS.getString(),
                    qaPhones.GalaxyA20s_OS.getString(),
                    qaPhones.XiaomiRedmiNote2_OS.getString(),
                    qaPhones.Lenovo_OS.getString(),
                    qaPhones.Nokia5_3_OS.getString(),
                    qaPhones.MotoG8_OS.getString(),
                    qaPhones.SamsungGalaxyM21_OS.getString(),
                    qaPhones.SamsungGalaxyS20_OS.getString(),
                    qaPhones.RedmiNote9Pro_OS.getString(),
                    qaPhones.RedmiNote9_OS.getString(),
                    qaPhones.HuaweiP40_OS.getString(),
                    qaPhones.XiaomiRedmi3s_OS.getString(),
                    qaPhones.XiaomiMi11_OS.getString(),
                    qaPhones.One_Plus_8T_OS.getString(),
                    qaPhones.Alcatel_OS.getString(),
                    qaPhones.SamsungGalaxyM12_OS.getString(),
                    qaPhones.SonyXperia10_OS.getString(),

            };

    public static String[] iOSPhones =
            {qaPhones.AppleWatch1.getString(),
                    qaPhones.AppleWatch3.getString(),
                    qaPhones.AppleWatch5.getString(),
                    qaPhones.iPhone7.getString(),
                    qaPhones.iPhone4.getString(),
                    qaPhones.iPhoneSE.getString(),
                    qaPhones.iPhoneX.getString(),
                    qaPhones.iPhoneXS.getString(),
                    qaPhones.iPhone6.getString(),
                    qaPhones.iPhone6s.getString(),
                    qaPhones.iPhoneSE2020.getString(),
                    qaPhones.iPhone8Plus.getString(),
                    qaPhones.iPhoneXR.getString(),
                    qaPhones.iPhone12mini.getString(),
                    qaPhones.iPhone11.getString(),
                    qaPhones.iPhone11Pro.getString(),
                    qaPhones.iPhone12ProMax.getString(),
                    qaPhones.iPhone5s.getString()
            };

    public static String[] iOSOS =
            {qaPhones.AppleWatch1_OS.getString(),
                    qaPhones.AppleWatch3_OS.getString(),
                    qaPhones.AppleWatch5_OS.getString(),
                    qaPhones.iPhone7_OS.getString(),
                    qaPhones.iPhone4_OS.getString(),
                    qaPhones.iPhoneSE_OS.getString(),
                    qaPhones.iPhoneX_OS.getString(),
                    qaPhones.iPhoneXS_OS.getString(),
                    qaPhones.iPhone6_OS.getString(),
                    qaPhones.iPhone6s_OS.getString(),
                    qaPhones.iPhoneSE2020_OS.getString(),
                    qaPhones.iPhone8Plus_OS.getString(),
                    qaPhones.iPhoneXR_OS.getString(),
                    qaPhones.iPhone12mini_OS.getString(),
                    qaPhones.iPhone11_OS.getString(),
                    qaPhones.iPhone11Pro_OS.getString(),
                    qaPhones.iPhone12ProMax_OS.getString(),
                    qaPhones.iPhone5s_OS.getString()
            };

    public static String[] desktopOS =
            {qaPhones.MacBook_OS.getString(),
                    qaPhones.WindowsPC_OS.getString()};

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

            case "reboot", "r" -> Main.retry();
        }
        lastData.phone = currentPhone;
        return currentPhone;
    }
}