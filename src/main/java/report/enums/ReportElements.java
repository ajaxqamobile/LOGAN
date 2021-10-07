package main.java.report.enums;

public enum ReportElements {

    Environment("Environment: "),
    iOSAppVersion("iOS App version: "),
    AOSAppVersion("Android App version: "),
    Server("Server: "),
    HubVer("Hub Version: "),
    HubType("Hub Type: "),
    Case("Case "),
    TestStatus("Test Status: "),
    Evidence("Evidence: "),
    Device("Device: "),
    AOSVer("Android version: "),
    iOSVer("iOS version: "),
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
    Meteora("JSON for Meteora:"),
    SystemLog("System Log: "),
    Space50("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

    private final String text;

    ReportElements(String P) {
        text = P;
    }

    public String getString() {
        return text;
    }

}
