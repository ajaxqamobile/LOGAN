package com.ajax.AjaxBotHelper.functions.find_xls_file;

public enum Snapshot {

    snapshotAOS("snapshot.xls"),
    snapshotIOS("snapshot.xlsx");

    private final String snap;

    Snapshot(String S) {
        snap = S;

    }

    public String getString() {
        return snap;
    }

}
