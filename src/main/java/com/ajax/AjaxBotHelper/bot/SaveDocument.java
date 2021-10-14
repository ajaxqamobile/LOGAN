package com.ajax.AjaxBotHelper.bot;


import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class SaveDocument {

    @Value(value = "${bot.token}")
    protected String botToken = "909343168:AAGmWspUFXHq5buqbPXPpr3yefcaucE4h8o";//Release
//    protected String botToken = "1038659514:AAG0D88JZu7fdxP_--wHcYvqLfMSGmD2el8";//Debug
//    protected String botToken = "1462216555:AAG3oz36CuirFBQiJzQnq2U0C5EstHtoPL0";//Debug 2


    public void download(String id, String format, BotContext context) throws IOException {
        String namePath = "";
        Long userID = context.getUser().getChatId();
        JSONObject json = null;
        try {
            json = readJsonFromUrl("https://api.telegram.org/bot" + botToken + "/getFile?file_id=" + id);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (json != null) {
            namePath = json.getJSONObject("result").getString("file_path");
        }

        String newURL = "https://api.telegram.org/file/bot" + botToken + "/" + namePath;
//PATH TO LOCAL DIRECTORY

        FileUtils.copyURLToFile(new URL(newURL), new File("src/main/resources/Downloaded Log/" + userID + "/" + id + format));
    }

    private String readAll(Reader rd) throws IOException {
        ;
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        try (InputStream is = new URL(url).openStream()) {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
            String jsonText = readAll(rd);
            return new JSONObject(jsonText);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}




