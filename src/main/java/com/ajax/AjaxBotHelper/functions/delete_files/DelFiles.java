package com.ajax.AjaxBotHelper.functions.delete_files;

import java.io.File;

import static org.glassfish.grizzly.http.server.util.ExpandJar.delete;

public class DelFiles {
    public static void deleteFiles(File file) {


        if (!file.exists())
            return;
        if (file.isDirectory()) {
            for (File f : file.listFiles())
                delete(f);
            file.delete();
        } else {
            file.delete();
        }
    }

}
