package com.ajax.AjaxBotHelper.functions.info_from_logs;

import com.ajax.AjaxBotHelper.bot.BotContext;
import com.ajax.AjaxBotHelper.functions.array_info.GetAllInfo;
import com.ajax.AjaxBotHelper.functions.common_enum.Path;
import com.ajax.AjaxBotHelper.functions.common_enum.Static_Data;
import com.ajax.AjaxBotHelper.functions.unzip.UnZip;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InfoFromLogs extends GetAllInfo {

    public void infoFromLogs(String theWay, BotContext context) throws IOException {

        if (UnZip.TrigOS.equals(Path.Android.getString())) {
            phoneInfoFromAndroidLogs(theWay, context);
//            HubsInfoFromLogs(theWay, context, Static_Data.Android.getString());
        } else {
            phoneInfoFromiOSLogs(theWay,context);
//            HubsInfoFromLogs(theWay, context, Static_Data.iOS.getString());
        }
    }

    public static void phoneInfoFromAndroidLogs(String theWay, BotContext context) throws IOException {

        String brandPhone,
                manufacturingPhone,
                modelPhone,
                ArchPhone;
        int SDK;

        String[] Phones = new String[6];

        FileInputStream inputStream = new FileInputStream(new File(theWay));
        HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
        HSSFSheet sheet = workbook.getSheetAt(6);

        Phones[0] = Static_Data.PhoneInfo.getString();
        HSSFCell sdk_int = sheet.getRow(1).getCell(0);
        DataFormatter formatter = new DataFormatter();
        String sdk_api = formatter.formatCellValue(sdk_int);
        SDK = Integer.parseInt(sdk_api);

        Phones[1] = CheckSDK.checkSDK(SDK);

        HSSFCell brand = sheet.getRow(1).getCell(2);
        brandPhone = Static_Data.brandPhone.getString() + brand;
        Phones[2] = brandPhone;
        HSSFCell manufacturer = sheet.getRow(1).getCell(8);
        manufacturingPhone = Static_Data.manufacturingPhone.getString() + manufacturer;
        Phones[3] = manufacturingPhone;
        HSSFCell model = sheet.getRow(1).getCell(9);
        modelPhone = Static_Data.modelPhone.getString() + model;
        Phones[4] = modelPhone;
        HSSFCell abis = sheet.getRow(1).getCell(12);
        ArchPhone = Static_Data.ArchPhone.getString() + abis;
        Phones[5] = ArchPhone;

        phoneInfo(Phones[0], context);
        API(Phones[1], context);
        brand(Phones[2], context);
        manufacturer(Phones[3], context);
        model(Phones[4], context);
        abis(Phones[5], context);
    }

    public static void phoneInfoFromiOSLogs(String theWay, BotContext context) throws IOException {

        try {

            FileInputStream inputStream = new FileInputStream(new File(theWay));
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheetPhone = workbook.getSheetAt(4);

            DataFormatter formatter2 = new DataFormatter();


            phoneInfo(Static_Data.PhoneInfo.getString(), context);
            brand(Static_Data.AppleBrand.getString(), context);

            XSSFCell iOS = sheetPhone.getRow(1).getCell(1);
            String iosPhone = formatter2.formatCellValue(iOS);
            manufacturer(Static_Data.AppleManufacturer.getString() + iosPhone, context);

            XSSFCell model = sheetPhone.getRow(1).getCell(0);
            String modelPhone = formatter2.formatCellValue(model);
            model(Static_Data.AppleModel.getString() + modelPhone, context);

        }catch (IllegalArgumentException e){

            phoneInfo(Static_Data.PhoneInfo.getString(), context);
            brand(Static_Data.AppleBrand.getString(), context);
            manufacturer(Static_Data.AppleManufacturer.getString() + "Данный лог не имеет нужной информации.", context);
            model(Static_Data.AppleModel.getString() + "Данный лог не имеет нужной информации.", context);
        }

        }

    public void HubsInfoFromLogs(String theWay, BotContext context, String OS) throws IOException {

        String HubVersion,
                HubName, HubID;

        CheckCell.getAllCell(theWay,OS);

        int CellHubType = CheckCell.CellHubType;
        int CellHubVer = CheckCell.CellHubVer;
        int CellHubName = CheckCell.CellHubName;
        int CellHubID = CheckCell.CellHubID;

        if (OS.equals(Static_Data.Android.getString())) {

            FileInputStream inputStream = new FileInputStream(new File(theWay));
            HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
            String[] Hubs = new String[5];

            Hubs[0] = Static_Data.HubInfo.getString();

            HSSFSheet sheetHubs = workbook.getSheetAt(0);
            int row_number = sheetHubs.getPhysicalNumberOfRows();

            for (int i = 1; i < row_number + 1; i++) {

                try {
                    HSSFCell Hub_one = sheetHubs.getRow(i).getCell(CellHubType);
                    DataFormatter formatter = new DataFormatter();
                    String HubType = formatter.formatCellValue(Hub_one);

                    Hubs[1] = CheckHubType.checkHubTypeAOS(HubType, Hub_one);

                    HSSFCell Hub_ver = sheetHubs.getRow(i).getCell(CellHubVer);
                    String HubVer = formatter.formatCellValue(Hub_ver);
                    int Hver = Integer.parseInt(HubVer);
                    HubVersion = Static_Data.HubVersion.getString() + Hver;
                    Hubs[2] = HubVersion;

                    HSSFCell Hub_name = sheetHubs.getRow(i).getCell(CellHubName);
                    String name = formatter.formatCellValue(Hub_name);
                    HubName = Static_Data.HubName.getString() + name;
                    Hubs[3] = HubName;

                    HSSFCell Hub_id = sheetHubs.getRow(i).getCell(CellHubID);
                    String hID = formatter.formatCellValue(Hub_id);
                    HubID = Static_Data.HubID.getString() + hID;
                    Hubs[4] = HubID;

                    for (int p = 0; p < 5; p++) {
                        setHubParamToArray(Hubs[p], context);
                    }

                } catch (NullPointerException ignore) {
                }
            }
        } else if (OS.equals(Static_Data.iOS.getString())) {
            String[] Hubs = new String[5];

            FileInputStream inputStream = new FileInputStream(new File(theWay));
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

            Hubs[0] = Static_Data.HubInfo.getString();

            XSSFSheet sheetHubs = workbook.getSheetAt(0);
            XSSFSheet sheetPhone = workbook.getSheetAt(4);

            Hubs[1] = null;
            int row_number = sheetHubs.getPhysicalNumberOfRows();
            DataFormatter formatter2 = new DataFormatter();

            phoneInfo(Static_Data.PhoneInfo.getString(), context);
            brand(Static_Data.AppleBrand.getString(), context);
            manufacturer(Static_Data.AppleManufacturer.getString(), context);
            XSSFCell model = sheetPhone.getRow(1).getCell(0);
            String modelPhone = formatter2.formatCellValue(model);
            model(Static_Data.AppleModel.getString()+modelPhone, context);

            for (int i = 1; i < (row_number + 1); i++) {
                try {
                    XSSFCell Hub_one = sheetHubs.getRow(i).getCell(CellHubType);
                    DataFormatter formatter = new DataFormatter();
                    String HubType = formatter.formatCellValue(Hub_one);

                    Hubs[1] = CheckHubType.checkHubTypeiOS(HubType, Hub_one);

                    XSSFCell Hub_ver = sheetHubs.getRow(i).getCell(CellHubVer);
                    String HubVer = formatter.formatCellValue(Hub_ver);
                    int Hver = Integer.parseInt(HubVer);
                    HubVersion = Static_Data.HubVersion.getString() + Hver;
                    Hubs[2] = HubVersion;

                    XSSFCell Hub_name = sheetHubs.getRow(i).getCell(CellHubName);
                    String name = formatter.formatCellValue(Hub_name);
                    HubName = Static_Data.HubName.getString() + name;
                    Hubs[3] = (HubName);

                    XSSFCell Hub_id = sheetHubs.getRow(i).getCell(CellHubID);
                    String hID = formatter.formatCellValue(Hub_id);
                    HubID = Static_Data.HubID.getString() + hID;
                    Hubs[4] = HubID;


                    setHubParamToArray(Hubs[0], context);
                    if (Hubs[1] == null) {
                        String info = Static_Data.HubModelFail.getString();
                        setHubParamToArray(info, context);
                    } else {
                        setHubParamToArray(Hubs[1], context);
                    }
                    if (Hubs[2].equals(Static_Data.HubVerFail.getString())) {
                        String info = Static_Data.HubVerFailInfo.getString();
                        setHubParamToArray(info, context);
                    } else {
                        setHubParamToArray(Hubs[2], context);
                    }
                    if (Hubs[3].equals(Static_Data.HubNameFail.getString())) {
                        String info = Static_Data.HubNameFailInfo.getString();
                        setHubParamToArray(info, context);
                    } else {
                        setHubParamToArray(Hubs[3], context);
                    }
                    setHubParamToArray(Hubs[4], context);

                } catch (NullPointerException ignored) {
                }
            }
        }
    }
}