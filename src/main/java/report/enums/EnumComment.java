package main.java.report.enums;

public enum EnumComment {

    Environment("Environment: "),
    Device("Device: "),
    Server("Server: "),
    Description("Description: "),
    TestStatus("Test Status: "),
    AI("Additional information: "),
    Evidence("Evidence: ");


    private final String text;
    EnumComment(String P) {
        text = P;
    }
    public String getString() {
        return text;
    }

}
