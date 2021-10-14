package com.ajax.AjaxBotHelper.functions.info_from_logs;

import com.ajax.AjaxBotHelper.functions.common_enum.Static_Data;

import java.io.IOException;

public class CheckCell {

    static int CellHubType = 0;
    static int CellHubVer = 0;
    static int CellHubName = 0;
    static int CellHubID = 0;
    static int CellDevice = 0;
    static int CelliOS = 0;
    static int CellBuild = 0;
    static int CellApp = 0;

    public static void getAllCell(String theWay, String OS) throws IOException {
        int i = 0;
        if (OS.equals(Static_Data.Android.getString())) {
            while (CellHubType == 0 || CellHubVer == 0 || CellHubName == 0 || CellHubID == 0) {
                String item = Sheets.Sheet(theWay, i, Static_Data.Android.getString());
                switch (item) {
                    case "firmWareVersion":
                        CellHubVer = i;
                        break;
                    case "hexObjectId":
                        CellHubID = i;
                        break;
                    case "hubName":
                        CellHubName = i;
                        break;
                    case "hubSubtype":
                        CellHubType = i;
                        break;
                }
                i++;
            }
        } else if (OS.equals(Static_Data.iOS.getString())) {
            while (CellHubType == 0 || CellHubVer == 0 || CellHubName != 0 || CellHubID == 0) {
                String item = Sheets.Sheet(theWay, i, Static_Data.iOS.getString());
                switch (item) {
                    case "firmWareVersion":
                        CellHubVer = i;
                        break;
                    case "hexPid":
                        CellHubID = i;
                        break;
                    case "name":
                        CellHubName = i;
                        break;
                    case "subtype":
                        CellHubType = i;
                        break;
                    case "device":
                        CellDevice = i;
                        break;
                    case "iOS":
                        CelliOS = i;
                        break;
                    case "app":
                        CellApp = i;
                        break;
                    case "build":
                        CellBuild = i;
                        break;
                }
                i++;
            }
        }
    }
}
