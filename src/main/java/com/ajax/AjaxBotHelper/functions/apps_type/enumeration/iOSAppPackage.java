package com.ajax.AjaxBotHelper.functions.apps_type.enumeration;

public enum iOSAppPackage {

    iOSAjaxProRus("systems.ajax.pro.iosapp.russia"),
    iOSAjaxProRus2("systems_ajax_pro_iosapp_russia"),
    iOSAjaxRus("systems.ajax.iosapp.russia"),
    iOSAjaxRus2("systems_ajax_iosapp_russia"),
    iOSAjaxPro("systems.ajax.pro.iosapp"),
    iOSAjaxPro2("systems_ajax_pro_iosapp"),
    iOSYavir("com.ajaxsystems.yavir2000"),
    iOSYavir2("com_ajaxsystems_yavir2000"),
    iOSBedo("com.ajaxsystems.bedo"),
    iOSBedo2("com_ajaxsystems_bedo"),
    iOSElotec("no.elotec.ajax.app"),
    iOSElotec2("no_elotec_ajax_app"),
    iOS3Dalarma("com.ajaxsystems.3dalarma"),
    iOS3Dalarma2("com_ajaxsystems_3dalarma"),
    iOSHomeSecure("com.ajaxsystems.homesecure"),
    iOSHomeSecure2("com_ajaxsystems_homesecure"),
    iOSAjax("systems.ajax.iosapp"),
    iOSAjax2("systems_ajax_iosapp"),
    iOS24Sure("com.ajaxsystems.sure24"),
    iOS24Sure2("com_ajaxsystems_sure24"),
    iOSTagsApp("com.mcu.ajax.iosapp"),
    iOSTagsApp2("com_mcu_ajax_iosapp"),
    iOSEPro("com.mcu.ITESA.ajax.iosapp"),
    iOSEPro2("com_mcu_ITESA_ajax_iosapp"),
    False("NoName");

    private final String Type;

    iOSAppPackage(String T) {
        Type = T;
    }

    public String getType() {
        return Type;
    }
}
