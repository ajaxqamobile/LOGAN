package com.ajax.AjaxBotHelper.functions.find_file;

import com.ajax.AjaxBotHelper.bot.BotContext;
import com.ajax.AjaxBotHelper.functions.common_enum.Path;
import com.ajax.AjaxBotHelper.functions.common_enum.Static_Data;
import com.ajax.AjaxBotHelper.functions.unzip.UnZip;
import net.lingala.zip4j.exception.ZipException;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class FindFile extends UnZip {

    public String FileName = null;
    public String PhotoName = null;

    public String findLogForOpen(BotContext context) throws ZipException, IOException {

        File dir1 = new File(Path.DownloadedLog.getString() + context.getUser().getChatId() + Path.Slash.getString());
        System.out.println(Static_Data.LookingForFiles.getString() + context.getUser().getChatId());

        if (dir1.isDirectory()) {
            for (File item : Objects.requireNonNull(dir1.listFiles())) {
                if (item.isDirectory()) {
                    System.out.println(Static_Data.FoundFolder.getString() + item.getName());
                } else {
                    System.out.println(Static_Data.FoundFile.getString() + item.getName());
                    FileName = item.getName();
                    if (FileName.endsWith(Static_Data.PhotoFormat.getString())) {
                        PhotoName = FileName;
                    } else {
                        UnZipFile(FileName, context);
                    }
                }
            }
        }
        return PhotoName;
    }
}



