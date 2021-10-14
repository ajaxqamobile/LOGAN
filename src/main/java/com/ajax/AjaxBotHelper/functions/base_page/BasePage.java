package com.ajax.AjaxBotHelper.functions.base_page;

import com.ajax.AjaxBotHelper.bot.BotContext;
import com.ajax.AjaxBotHelper.functions.common_enum.Path;
import com.ajax.AjaxBotHelper.functions.find_file.FindFile;
import net.lingala.zip4j.exception.ZipException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class BasePage extends FindFile {

    public void startLog(BotContext context) throws ZipException, IOException {
        try {
            context.getUser().setSnap(Path.Null.getString());
            findLogForOpen(context);
        } catch (FileNotFoundException ignored) {
            System.out.println(Path.FailFindDownloadedLogs.getString());
        }
    }
}