package com.ajax.AjaxBotHelper.functions.array_info;

import com.ajax.AjaxBotHelper.functions.base_page.BasePage;
import com.ajax.AjaxBotHelper.functions.common_enum.Static_Data;

public class LogsInfo extends BasePage {

    public String filePath = Static_Data.DefualtFilePath.getString();
    public String mediaPath = Static_Data.DefualtMediaPath.getString();
    public String mediaFolder = Static_Data.DefualtMediaFolder.getString();
    public String LogFolder = Static_Data.DefualtLogFolder.getString();

    public static String AppsType;
    public static String AppsVer;

}
