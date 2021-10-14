package com.ajax.AjaxBotHelper.functions.info_from_logs;

import com.ajax.AjaxBotHelper.functions.common_enum.Static_Data;

public class CheckSDK {

    public static String checkSDK (int SDK){
        String SDKitem = null;

        if (SDK == 19) {
            SDKitem = Static_Data.API19.getString();
        } else if (SDK == 21) {
            SDKitem = Static_Data.API21.getString();
        } else if (SDK == 22) {
            SDKitem = Static_Data.API22.getString();
        } else if (SDK == 23) {
            SDKitem = Static_Data.API23.getString();
        } else if (SDK == 24) {
            SDKitem = Static_Data.API24.getString();
        } else if (SDK == 25) {
            SDKitem = Static_Data.API25.getString();
        } else if (SDK == 26) {
            SDKitem = Static_Data.API26.getString();
        } else if (SDK == 27) {
            SDKitem = Static_Data.API27.getString();
        } else if (SDK == 28) {
            SDKitem = Static_Data.API28.getString();
        } else if (SDK == 29) {
            SDKitem = Static_Data.API29.getString();
        } else if (SDK == 30) {
            SDKitem = Static_Data.API30.getString();
        } else {
            SDKitem = "Android SDK: "+SDK;
        }
        return SDKitem;
    }

}
