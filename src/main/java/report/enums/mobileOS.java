package main.java.report.enums;

public enum mobileOS {

    AndroidOS("Android version: "),
    WatchOS("WatchOS version: "),
    MacOS("Desktop version: macOS Big Sur "),
    WindowsOS("Desktop version: Windows "),
    iOS("iOS version: ");

    private final String text;

    mobileOS(String P) {
        text = P;
    }

    public String getString(String ver) {
        return text+ver;
    }

}
