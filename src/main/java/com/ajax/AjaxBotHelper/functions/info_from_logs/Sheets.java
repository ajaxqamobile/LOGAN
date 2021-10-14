package com.ajax.AjaxBotHelper.functions.info_from_logs;

import com.ajax.AjaxBotHelper.functions.common_enum.Static_Data;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Sheets {

    public static String Sheet(String theWay,int i,String OS) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(theWay));
        String HUB = null;
        if (OS.equals(Static_Data.Android.getString())) {
            HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
            HSSFCell Hub_one = workbook.getSheetAt(0).getRow(0).getCell(i);
            DataFormatter formatter = new DataFormatter();
            HUB = formatter.formatCellValue(Hub_one);
        } else if (OS.equals(Static_Data.iOS.getString()))
        {
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFCell Hub_one = workbook.getSheetAt(0).getRow(0).getCell(i);
            DataFormatter formatter = new DataFormatter();
            HUB = formatter.formatCellValue(Hub_one);
        }
        return HUB;
    }
}
