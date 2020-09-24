package main.java.report;

public enum Comment {

    Environment("Environment: "),
    Device("Device: "),
    Server("Server: "),
    Description("Description: "),
    TestStatus("Test Status: "),
    AI("Additional information: "),
    Evidence("Evidence: ");


    private final String text;
    Comment(String P) {
        text = P;
    }
    public String getString() {
        return text;
    }

}
