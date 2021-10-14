package com.ajax.AjaxBotHelper.functions.app_ver;

import com.ajax.AjaxBotHelper.functions.apps_type.CheckTypeApp;
import com.ajax.AjaxBotHelper.functions.array_info.LogsInfo;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static java.lang.Integer.parseInt;

public class AppVer {

    static String ver;
    static String StringBuild;
    static String IntBuild;


    public static String getIOSappVer(String theWay,String filePath) throws IOException {

        StringBuild = CheckTypeApp.fileContainsWordiOS(filePath);
        IntBuild = StringBuild.substring(32);
        int length = IntBuild.length();
        IntBuild  = IntBuild.substring(0,length-1);
        System.out.println(IntBuild);
        try {
            FileInputStream inputStream = new FileInputStream(new File(theWay));
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheetPhone = workbook.getSheetAt(4);
            DataFormatter formatter2 = new DataFormatter();

            XSSFCell app = sheetPhone.getRow(1).getCell(2);
            XSSFCell build = sheetPhone.getRow(1).getCell(3);
            String appPhone = formatter2.formatCellValue(app);
            String buildPhone = formatter2.formatCellValue(build);
            ver = VerStr.Biuld.getString() +appPhone +"."+ IntBuild +" -> "+appPhone+"."+buildPhone;

        }catch (IllegalArgumentException e){
            ver = VerStr.Biuld.getString()+ IntBuild;
        }
        return LogsInfo.AppsVer = ver;
    }


    public static String getAOSappVer(String fileName) {

        String Name = fileName;
        int indexOne = Name.indexOf(VerStr.BracketOne.getString());
        String CutNameOne = Name.substring(indexOne + 1);
        int indexTwo = CutNameOne.indexOf(VerStr.BracketTwo.getString());
        String CutNameTwo = CutNameOne.substring(0, indexTwo);
        int FirstNumber = (parseInt(CutNameTwo) / 1000000);
        int SecondNumber = ((parseInt(CutNameTwo) % 1000000)) / 10000;
        System.out.println(CutNameTwo);
        int OtherNumber = (parseInt(CutNameTwo) % 10000);
        String ver;
        if (OtherNumber <= 9) {
            ver = VerStr.Version.getString() + FirstNumber + VerStr.Dot.getString() + SecondNumber +
                    VerStr.Dot.getString() + OtherNumber + VerStr.Biuld.getString() +
                    VerStr.Release.getString();
        } else {
            ver = VerStr.Version.getString() + FirstNumber + VerStr.Dot.getString() + SecondNumber +
                    VerStr.Biuld.getString() + OtherNumber;
        }
        return LogsInfo.AppsVer = ver;
    }
}
