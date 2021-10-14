package com.ajax.AjaxBotHelper.functions.delete_files;

import com.ajax.AjaxBotHelper.functions.common_enum.Path;

import java.io.File;
import java.util.Objects;

public class DelPhoto {

    public static void deletePhoto(Long ChatID) {
        try {
            for (File FindUserID : Objects.requireNonNull(new File(Path.DownloadedPhoto.getString()).listFiles())) {
                if (FindUserID.toString().contains(ChatID.toString())) {
                    if (FindUserID.isFile()) {
                    } else {
                        for (File photo : Objects.requireNonNull(new File(String.valueOf(FindUserID)).listFiles())) {
                            if (photo.isFile()) {
                                photo.delete();
                                FindUserID.delete();
                            }
                        }
                    }
                }
            }
        } catch (NullPointerException ignored) {
        }
    }
}
