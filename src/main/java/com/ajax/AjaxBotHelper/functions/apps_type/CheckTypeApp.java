package com.ajax.AjaxBotHelper.functions.apps_type;

import com.ajax.AjaxBotHelper.functions.app_ver.VerStr;
import com.ajax.AjaxBotHelper.functions.apps_type.enumeration.AndroidAppPackage;
import com.ajax.AjaxBotHelper.functions.apps_type.enumeration.AppType;
import com.ajax.AjaxBotHelper.functions.apps_type.enumeration.iOSAppPackage;
import com.ajax.AjaxBotHelper.functions.array_info.LogsInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class CheckTypeApp extends LogsInfo {

    public static Boolean TR = true;
    public static String TypeThisApp = null;
    static String TypeName;

    public static String checkTypeIOSApp(String name) {
        int index = name.indexOf(AppType.Space.getString());
        int index2 = name.indexOf("20");
        try {
            TypeName = name.substring(0, index);
        } catch (StringIndexOutOfBoundsException e) {
            TypeName = name.substring(0, index2);
        }
        for (iOSAppPackage Type : iOSAppPackage.values()) {
            String TypeApp = Type.getType();
            if (TypeName.equals(TypeApp)) {
                switch (Type) {
                    case iOSAjaxProRus:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.AjaxRuPro.getString();
                        break;
                    case iOSAjaxRus:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.AjaxRu.getString();
                        break;
                    case iOSAjaxPro:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.AjaxPro.getString();
                        break;
                    case iOSYavir:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.Yavir.getString();
                        break;
                    case iOSBedo:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.Bedo.getString();
                        break;
                    case iOSElotec:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.Elotec.getString();
                        break;
                    case iOS3Dalarma:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.Alarma3d.getString();
                        break;
                    case iOSHomeSecure:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.HomeSecure.getString();
                        break;
                    case iOS24Sure:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.Sure24.getString();
                        break;
                    case iOSTagsApp:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.TagsApp.getString();
                        break;
                    case iOSEPro:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.EPro.getString();
                        break;
                    case iOSAjax:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.Ajax.getString();
                        break;
                    case iOSAjaxProRus2:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.AjaxRuPro.getString();
                        break;
                    case iOSAjaxRus2:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.AjaxRu.getString();
                        break;
                    case iOSAjaxPro2:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.AjaxPro.getString();
                        break;
                    case iOSYavir2:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.Yavir.getString();
                        break;
                    case iOSBedo2:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.Bedo.getString();
                        break;
                    case iOSElotec2:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.Elotec.getString();
                        break;
                    case iOS3Dalarma2:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.Alarma3d.getString();
                        break;
                    case iOSHomeSecure2:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.HomeSecure.getString();
                        break;
                    case iOS24Sure2:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.Sure24.getString();
                        break;
                    case iOSTagsApp2:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.TagsApp.getString();
                        break;
                    case iOSEPro2:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.EPro.getString();
                        break;
                    case iOSAjax2:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.Ajax.getString();
                        break;
                    default:
                        TypeThisApp = AppType.Failed.getString();
                        break;
                }
            } else {
                TypeThisApp = AppType.Failed.getString();
            }
            if (TypeName.equals(TypeApp)) break;
        }
        return AppsType = TypeThisApp;
    }


    public static String checkTypeAndroidApp(String Path) throws IOException {

        for (AndroidAppPackage Type : AndroidAppPackage.values()) {
            if (fileContainsWord(Path, Type.getType()) == TR) {
                switch (Type) {
                    case AndroidAjaxProRus:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.AjaxRuPro.getString();
                        break;
                    case AndroidAjaxRus:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.AjaxRu.getString();
                        break;
                    case AndroidAjaxPro:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.AjaxPro.getString();
                        break;
                    case AndroidYavir:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.Yavir.getString();
                        break;
                    case AndroidBedo:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.Bedo.getString();
                        break;
                    case AndroidElotec:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.Elotec.getString();
                        break;
                    case Android3Dalarma:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.Alarma3d.getString();
                        break;
                    case AndroidHomeSecure:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.HomeSecure.getString();
                        break;
                    case AndroidEPro:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.EPro.getString();
                        break;
                    case AndroidTagsApp:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.TagsApp.getString();
                        break;
                    case Android24Sure:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.Sure24.getString();
                        break;
                    case AndroidAjax:
                        TypeThisApp = AppType.TypeApp.getString() + AppType.Ajax.getString();
                        break;
                    default:
                        TypeThisApp = AppType.Failed.getString();
                        break;
                }
            } else {
                TypeThisApp = AppType.Failed.getString();
                break;
            }
            if (fileContainsWord(Path, Type.getType()) == TR) break;
        }
        return AppsType = TypeThisApp;
    }

    public static String fileContainsWordiOS(String fileName) throws FileNotFoundException {
        String StringBuild = null;
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String cols = line;
            if (cols.contains(VerStr.LastAppVersion.getString())) {
                System.out.println(line);
                StringBuild = line;
                break;
            }
        }
        return StringBuild;
    }

    public static boolean fileContainsWord(String fileName, String word) {
        try {
            return new String(Files.readAllBytes(Paths.get(fileName))).contains(word);
        } catch (Exception e) {
            return false;
        }
    }

}

