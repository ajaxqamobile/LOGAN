package com.ajax.AjaxBotHelper.functions.delete_files;

import com.ajax.AjaxBotHelper.functions.common_enum.LogsPath;

import java.io.File;
import java.util.Objects;

public class DelLogs {


    public static void deleteLogs(Long ChatID) {

        try {

            for (File FindUserID : Objects.requireNonNull(new File(LogsPath.androidPath.getString()).listFiles())) {
                if (FindUserID.toString().contains(ChatID.toString())) {

                    for (File UserID : Objects.requireNonNull(new File(LogsPath.androidPath.getString()).listFiles())) {
                        if (UserID.isFile()) {
                        } else {
                            for (File folderID : Objects.requireNonNull(new File(String.valueOf(UserID)).listFiles())) {
                                if (folderID.isFile()) {
                                } else {
                                    for (File files : Objects.requireNonNull(new File(String.valueOf(folderID)).listFiles())) {
                                        if (files.isFile()) {
                                            files.delete();
                                        }
                                    }
                                    folderID.delete();
                                    UserID.delete();
                                }
                            }
                        }
                    }
                }
            }
        } catch (NullPointerException | StringIndexOutOfBoundsException e) {
//            e.printStackTrace();
        }
        try {
            for (File FindUserID : Objects.requireNonNull(new File(LogsPath.iOSPath.getString()).listFiles())) {
                if (FindUserID.toString().contains(ChatID.toString())) {
                    for (File UserID : Objects.requireNonNull(new File(LogsPath.iOSPath.getString()).listFiles())) {
                        if (UserID.isFile()) {
                        } else {
                            for (File folderID : Objects.requireNonNull(new File(String.valueOf(UserID)).listFiles())) {
                                if (folderID.isFile()) {
                                } else {
                                    for (File files : Objects.requireNonNull(new File(String.valueOf(folderID)).listFiles())) {
                                        if (files.isFile()) {
                                            files.delete();
                                        }
                                    }
                                    folderID.delete();
                                    UserID.delete();
                                }
                            }
                        }
                    }
                }
            }
        } catch (NullPointerException | StringIndexOutOfBoundsException e) {
//            e.printStackTrace();
        }
    }
}