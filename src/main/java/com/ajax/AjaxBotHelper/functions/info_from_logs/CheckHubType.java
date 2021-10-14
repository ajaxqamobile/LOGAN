package com.ajax.AjaxBotHelper.functions.info_from_logs;

import com.ajax.AjaxBotHelper.functions.common_enum.Static_Data;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class CheckHubType {

    public static String checkHubTypeAOS(String HubType, HSSFCell Hub_one) {

        String Hub_one_cell = null;

        if (Integer.parseInt(HubType) < 10) {
            System.out.println("Модель хаба " + Hub_one);
            int Htype = Integer.parseInt(HubType);
            if (Htype == 1) {
                Hub_one_cell = Static_Data.HubOne.getString();
            } else if (Htype == 2) {
                Hub_one_cell = Static_Data.HubPlus.getString();
            } else if (Htype == 3) {
                Hub_one_cell = Static_Data.HubYavir.getString();
            } else if (Htype == 4) {
                Hub_one_cell = Static_Data.HubYavirPlus.getString();
            } else if (Htype == 5) {
                Hub_one_cell = Static_Data.HubTwo.getString();
            } else if (Htype == 6) {
                Hub_one_cell = Static_Data.HubTwoPlus.getString();
            }

        }
        return Hub_one_cell;
    }

    public static String checkHubTypeiOS(String HubType, XSSFCell Hub_one) {

        String Hub_one_cell = null;

            if (Integer.parseInt(HubType) < 10) {
                System.out.println("Модель хаба " + Hub_one);
                int Htype = Integer.parseInt(HubType);
                if (Htype == 1) {
                    Hub_one_cell = Static_Data.HubOne.getString();
                } else if (Htype == 2) {
                    Hub_one_cell = Static_Data.HubPlus.getString();
                } else if (Htype == 3) {
                    Hub_one_cell = Static_Data.HubYavir.getString();
                } else if (Htype == 4) {
                    Hub_one_cell = Static_Data.HubYavirPlus.getString();
                } else if (Htype == 5) {
                    Hub_one_cell = Static_Data.HubTwo.getString();
                } else if (Htype == 6) {
                    Hub_one_cell = Static_Data.HubTwoPlus.getString();
                }

            }
        return Hub_one_cell;
    }

}
