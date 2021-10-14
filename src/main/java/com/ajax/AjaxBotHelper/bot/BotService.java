package com.ajax.AjaxBotHelper.bot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class BotService {

    protected void Zip(String source_dir, String outputlog) throws Exception {

        FileOutputStream fos = new FileOutputStream(outputlog);
        ZipOutputStream zipOut = new ZipOutputStream(fos);
        File fileToZip = new File(source_dir);
        FileInputStream fis = new FileInputStream(fileToZip);
        ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
        zipOut.putNextEntry(zipEntry);
        byte[] bytes = new byte[1024];
        int length;
        while ((length = fis.read(bytes)) >= 0) {
            zipOut.write(bytes, 0, length);
        }
        zipOut.close();
        fis.close();
        fos.close();

    }

    protected double getFileSize(String filePath) {
        File file = new File(filePath);
        return (double) file.length() / (1024 * 1024);
    }

}

