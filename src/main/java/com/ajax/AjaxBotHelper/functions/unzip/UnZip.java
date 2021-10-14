package com.ajax.AjaxBotHelper.functions.unzip;

import com.ajax.AjaxBotHelper.bot.BotContext;
import com.ajax.AjaxBotHelper.functions.common_enum.LogsPath;
import com.ajax.AjaxBotHelper.functions.common_enum.Path;
import com.ajax.AjaxBotHelper.functions.find_xls_file.FindXlsFile;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UnZip extends FindXlsFile {
    public static String TrigOS = null;
    public String TrigUnzip = Path.Android.getString();

    public void UnZipFile(String Name, BotContext context) throws ZipException, IOException {
        try {
            TrigUnzip(TrigUnzip, Name, context);
        } catch (NullPointerException | FileNotFoundException e) {
        } finally {
            delZip(Name, context);
        }
    }

    public String TrigUnzip(String Trig, String Name, BotContext context) throws ZipException, IOException {
        ZipFile zipFile = new ZipFile(Path.DownloadedLog.getString() + context.getUser().getChatId() +
                Path.Slash.getString() + Name);
        System.out.println(Path.StartSetPass.getString() + Name);
        if (zipFile.isEncrypted()) {
            if (Trig == Path.Android.getString()) {
                try {
                    zipFile.setPassword(LogsPass.androidPass.getPass().toCharArray());
                    zipFile.extractAll(LogsPath.androidPath.getString() + context.getUser().getChatId() +
                            Path.Slash.getString() + Name);
                    File file1 = new File(LogsPath.androidPath.getString() + context.getUser().getChatId() +
                            Path.Slash.getString() + Name);
                    File file11 = new File(LogsPath.androidPath.getString() + context.getUser().getChatId());
                    file1.delete();
                    file11.delete();
                    TrigOS = Path.Android.getString();
                    System.out.println(Path.ThisIsAndroid.getString());
                } catch (ZipException e) {
                    TrigUnzip = Path.iOS.getString();
                    TrigUnzip(TrigUnzip, Name, context);
                } finally {
                    File file3 = new File(Path.DownloadedLog.getString() + context.getUser().getChatId() +
                            Path.Slash.getString() + Name);
                    File file33 = new File(Path.DownloadedLog.getString() + context.getUser().getChatId());
                    file3.delete();
                    file33.delete();
                    System.out.println(Path.DeleteFile.getString() + Name);
                    findXlsFile(context);
                }
            } else {
                try {
                    zipFile.setPassword(LogsPass.iOSPassOld.getPass().toCharArray());
                    zipFile.extractAll(LogsPath.iOSPath.getString() + context.getUser().getChatId() +
                            Path.Slash.getString() + Name);
                    File file1 = new File(LogsPath.androidPath.getString() + context.getUser().getChatId() +
                            Path.Slash.getString() + Name);
                    File file11 = new File(LogsPath.androidPath.getString() + context.getUser().getChatId());
                    file1.delete();
                    file11.delete();
                    File file2 = new File(LogsPath.iOSPath.getString() + context.getUser().getChatId() +
                            Path.Slash.getString() + Name);
                    File file22 = new File(LogsPath.iOSPath.getString() + context.getUser().getChatId());
                    file2.delete();
                    file22.delete();
                    TrigOS = Path.iOS.getString();
                    System.out.println(Path.ThisIsIOS.getString());
                } catch (ZipException e) {
                    //ExceptionUnzip(context);
                    zipFile.setPassword(LogsPass.iOSPassNew.getPass().toCharArray());
                    zipFile.extractAll(LogsPath.iOSPath.getString() + context.getUser().getChatId() +
                            Path.Slash.getString() + Name);
                    File file1 = new File(LogsPath.androidPath.getString() + context.getUser().getChatId() +
                            Path.Slash.getString() + Name);
                    File file11 = new File(LogsPath.androidPath.getString() + context.getUser().getChatId());
                    file1.delete();
                    file11.delete();
                    File file2 = new File(LogsPath.iOSPath.getString() + context.getUser().getChatId() +
                            Path.Slash.getString() + Name);
                    File file22 = new File(LogsPath.iOSPath.getString() + context.getUser().getChatId());
                    file2.delete();
                    file22.delete();
                    TrigOS = Path.iOS.getString();
                    System.out.println(Path.ThisIsIOS.getString());
                } finally {
                    File file3 = new File(Path.DownloadedLog.getString() + context.getUser().getChatId() +
                            Path.Slash.getString() + Name);
                    File file33 = new File(Path.DownloadedLog.getString() + context.getUser().getChatId());
                    file3.delete();
                    file33.delete();
                    System.out.println(Path.DeleteFile.getString() + Name);
                    findXlsFile(context);
                }
                return TrigOS;
            }
        }
        return TrigUnzip;
    }

    public void ExceptionUnzip(BotContext context) {
        context.getUser().setLogs(Path.Null.getString());
    }

    public void delZip(String Name, BotContext context) {
        try {
            File file3 = new File(Path.DownloadedLog.getString() + context.getUser().getChatId() +
                    Path.Slash.getString() + Name);
            File file33 = new File(Path.DownloadedLog.getString() + context.getUser().getChatId());
            file3.delete();
            file33.delete();
        } catch (NullPointerException ignored) {
        }
    }
}