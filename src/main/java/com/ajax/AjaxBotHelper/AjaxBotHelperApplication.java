package com.ajax.AjaxBotHelper;

import com.ajax.AjaxBotHelper.functions.common_enum.Path;
import com.ajax.AjaxBotHelper.functions.delete_files.DelFiles;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.telegram.telegrambots.ApiContextInitializer;

import java.io.File;

@SpringBootApplication
@EnableScheduling
public class AjaxBotHelperApplication {

//    public static void main(String[] args) {
//            DelFiles.deleteFiles(new File(Path.DownloadedLog.getString()));
//            DelFiles.deleteFiles(new File(Path.DownloadedPhoto.getString()));
//            DelFiles.deleteFiles(new File(Path.DownloadedFilesLog.getString()));
//            ApiContextInitializer.init();
//            SpringApplication.run(AjaxBotHelperApplication.class, args);
//    }

    public static void startBot() {
        DelFiles.deleteFiles(new File(Path.DownloadedLog.getString()));
        DelFiles.deleteFiles(new File(Path.DownloadedPhoto.getString()));
        DelFiles.deleteFiles(new File(Path.DownloadedFilesLog.getString()));
        ApiContextInitializer.init();
        SpringApplication.run(AjaxBotHelperApplication.class);
    }

}
