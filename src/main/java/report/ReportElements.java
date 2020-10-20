package main.java.report;

public enum ReportElements {

    Environment("Environment: "),
    iOSversion("iOS version: "),
    iOSAppVersion("iOS App version: "),
    AOSversion("Android version: "),
    AOSAppVersion("Android App version: "),
    Server("Server: "),
    HubVer("Hub Version: "),
    HubType("Hub Type: "),
    TestStatus("Test Status: "),
    Evidence("Evidence: "),
    Device("Device: "),
    Repeated("How often is repeated: "),
    inRelease("The issue exists in the release app: "),
    Another("Reproduce on another platform: "),
    TestAccount("Test Account: "),
    Email("E-mail: "),
    Pass("Password: "),
    HubName("Hub's name: "),
    Preconditions("Preconditions: "),
    Description("Description: "),
    StepsToReproduce("Steps to Reproduce: "),
    AR("❌ Actual result: "),
    ER("✅ Expected Result: "),
    AI("Additional Information: "),
    Timestamp("Timestamp: "),
    SystemLog("System Log: ");

    private final String text;
    ReportElements(String P) {
        text = P;
    }
    public String getString() {
        return text;
    }

}
