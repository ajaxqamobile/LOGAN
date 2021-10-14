package com.ajax.AjaxBotHelper.functions.find_xls_file;

import com.ajax.AjaxBotHelper.bot.BotContext;
import com.ajax.AjaxBotHelper.functions.app_ver.AppVer;
import com.ajax.AjaxBotHelper.functions.array_info.LogsInfo;
import com.ajax.AjaxBotHelper.functions.common_enum.LogsPath;
import com.ajax.AjaxBotHelper.functions.common_enum.Path;
import com.ajax.AjaxBotHelper.functions.common_enum.Static_Data;
import com.ajax.AjaxBotHelper.functions.info_from_logs.InfoFromLogs;
import com.ajax.AjaxBotHelper.functions.unzip.UnZip;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

import static com.ajax.AjaxBotHelper.bot.ChatBot.logsInfo;
import static com.ajax.AjaxBotHelper.functions.apps_type.CheckTypeApp.checkTypeAndroidApp;
import static com.ajax.AjaxBotHelper.functions.apps_type.CheckTypeApp.checkTypeIOSApp;

public class FindXlsFile extends AppVer {
    public static InfoFromLogs infoFromLogs = new InfoFromLogs();
    public static String FileName;
    public static String FolderName;
    public static String TheWay;
    public static String FullWayToLog;
    public static String FullWay;

    public static String findXlsFile(BotContext context) throws IOException {
        if (UnZip.TrigOS.equals(Path.Android.getString())) {
            File dir1 = new File(LogsPath.androidPath.getString() + context.getUser().getChatId() +
                    Path.Slash.getString());
            System.out.println(Static_Data.LookingForSnapshotFileAOS.getString() + context.getUser().getChatId() +
                    Path.Slash.getString());
            if (dir1.isDirectory()) {
                for (File item : Objects.requireNonNull(dir1.listFiles())) {
                    if (item.isDirectory()) {
                        System.out.println(Static_Data.FoundFolder.getString() + item.getName());
                        FolderName = item.getName();
                        logsInfo.LogFolder = LogsPath.androidPath.getString() + context.getUser().getChatId() +
                                Path.Slash.getString() + FolderName;
                        File dir = new File(logsInfo.LogFolder);
                        TheWay = LogsPath.androidPath.getString() + context.getUser().getChatId() +
                                Path.Slash.getString() + FolderName;
                        for (File itemm : Objects.requireNonNull(dir.listFiles())) {
                            FileName = itemm.getName();
                            if (FileName.endsWith(Static_Data.LogFormat.getString())) {
                                FullWayToLog = TheWay + Path.Slash.getString() + FileName;
                                getAOSappVer(FileName);
                                logsInfo.filePath = FullWayToLog;
                                context.getUser().setLogs(FullWayToLog);
                            } else if (Snapshot.snapshotAOS.getString().equals(FileName)) {
                                System.out.println(Static_Data.FoundFile.getString() + FileName);
                                System.out.println(Static_Data.StartToReadFile.getString() + FileName);
                                String FullWay = TheWay + Path.Slash.getString() + FileName;
                                infoFromLogs.infoFromLogs(FullWay, context);
                            }
                        }
                        context.getUser().setSnap(context.getUser().getSnap() + Static_Data.NextLixe.getString() +
                                checkTypeAndroidApp(context.getUser().getLogs()));
                        context.getUser().setSnap(context.getUser().getSnap() + LogsInfo.AppsVer);
                    }
                    context.getUser().setSnapPath(TheWay + Path.Slash.getString() + Snapshot.snapshotAOS.getString());
                }
            }
        } else if (UnZip.TrigOS.equals(Path.iOS.getString())) {
            File dir1 = new File(LogsPath.iOSPath.getString() + context.getUser().getChatId() +
                    Path.Slash.getString());
            System.out.println(Static_Data.LookingForSnapshotFileIOS.getString() + context.getUser().getChatId() +
                    Path.Slash.getString());
            if (dir1.isDirectory()) {
                for (File item : Objects.requireNonNull(dir1.listFiles())) {
                    if (item.isDirectory()) {
                        System.out.println(Static_Data.FoundFolder.getString() + item.getName());
                        FolderName = item.getName();
                        logsInfo.LogFolder = LogsPath.iOSPath.getString() + context.getUser().getChatId() +
                                Path.Slash.getString() + FolderName;
                        File dir = new File(logsInfo.LogFolder);
                        TheWay = LogsPath.iOSPath.getString() + context.getUser().getChatId() +
                                Path.Slash.getString() + FolderName;
                        for (File itemm : Objects.requireNonNull(dir.listFiles())) {
                            FileName = itemm.getName();
                            if (FileName.endsWith(Static_Data.LogFormat.getString())) {
                                FullWayToLog = TheWay + Path.Slash.getString() + FileName;
                                logsInfo.filePath = FullWayToLog;
                                FullWay = TheWay + Path.Slash.getString() + Snapshot.snapshotIOS.getString();
                                getIOSappVer(com.ajax.AjaxBotHelper.functions.find_xls_file.FindXlsFile.FullWay, FullWayToLog);
                                context.getUser().setLogs(FullWayToLog);
                            } else if (Snapshot.snapshotIOS.getString().equals(FileName)) {
                                System.out.println(Static_Data.FoundFile.getString() + FileName);
                                System.out.println(Static_Data.StartToReadFile.getString() + FileName);
                                FullWay = TheWay + Path.Slash.getString() + FileName;
                                infoFromLogs.infoFromLogs(FullWay, context);
                                context.getUser().setSnapPath(FullWay);
                            } else {
                                System.out.println(Static_Data.FoundFile.getString() + FileName);
                                System.out.println(Static_Data.StartToReadFile.getString() + Snapshot.snapshotIOS.getString());
                                FullWay = TheWay + Path.Slash.getString() + Snapshot.snapshotIOS.getString();
                                infoFromLogs.infoFromLogs(FullWay, context);
                                context.getUser().setSnapPath(FullWay);
                            }

                        }
                        String fileName = context.getUser().getLogFileName();
                        context.getUser().setSnap(context.getUser().getSnap() + Static_Data.NextLixe.getString() +
                                checkTypeIOSApp(fileName));
                        context.getUser().setSnap(context.getUser().getSnap() + LogsInfo.AppsVer);
                    }
                }
            }
        }
        return TheWay;
    }
}