package com.ajax.AjaxBotHelper.functions.array_info;

import com.ajax.AjaxBotHelper.bot.BotContext;
import com.ajax.AjaxBotHelper.functions.common_enum.Path;
import com.ajax.AjaxBotHelper.functions.common_enum.Static_Data;

public class GetAllInfo extends LogsInfo {

    public static String phoneInfo(String param, BotContext context) {
        String snap = context.getUser().getSnap();
        if (snap.equals(Path.Null.getString()) || snap.equals(Path.Empty.getString()) ||
                snap.startsWith(Static_Data.PhoneInfo.getString())) {
            return context.getUser().setSnap(param + Static_Data.NextLixe.getString());
        } else
            return context.getUser().setSnap(context.getUser().getSnap() + Static_Data.NextLixe.getString() + param +
                    Static_Data.NextLixe.getString());
    }

    public static String API(String param, BotContext context) {
        return context.getUser().setSnap(context.getUser().getSnap() + Static_Data.NextLixe.getString() + param +
                Static_Data.NextLixe.getString());
    }

    public static String brand(String param, BotContext context) {
        String snap = context.getUser().getSnap();
        if (snap.equals(Path.Null.getString()) || snap.equals(Path.Empty.getString())) {
            return context.getUser().setSnap(param + Static_Data.NextLixe.getString());
        } else
            return context.getUser().setSnap(context.getUser().getSnap() + Static_Data.NextLixe.getString() + param +
                    Static_Data.NextLixe.getString());
    }

    public static String manufacturer(String param, BotContext context) {
        return context.getUser().setSnap(context.getUser().getSnap() + Static_Data.NextLixe.getString() + param +
                Static_Data.NextLixe.getString());
    }

    public static String model(String param, BotContext context) {
        return context.getUser().setSnap(context.getUser().getSnap() + Static_Data.NextLixe.getString() + param +
                Static_Data.NextLixe.getString());
    }

    public static String abis(String param, BotContext context) {
        return context.getUser().setSnap(context.getUser().getSnap() + Static_Data.NextLixe.getString() + param +
                Static_Data.NextLixe.getString());
    }

    public void setHubParamToArray(String param, BotContext context) {
        context.getUser().setSnap(context.getUser().getSnap() + Static_Data.NextLixe.getString() + param +
                Static_Data.NextLixe.getString());
    }


}