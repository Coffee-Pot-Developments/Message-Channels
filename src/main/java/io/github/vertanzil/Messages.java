package io.github.vertanzil;

public enum Messages {
    Message_001("0001", "Files not found."),
    Message_002("0002", "No connection to the database"),
    Message_003("0003", "Server offline"),
    Message_004("0004", "Not found"),
    ;

    private String code;
    private String description;
    private static final String ERROR_CODE_PREFIX = "BCV";

    private void Error(String code, String description) {
        this.code = code;
        this.description = description;
    }

    Messages(String number, String s) {
        this.code = ERROR_CODE_PREFIX + number;
        this.description = s;
    }

    public String getDescription() {
        return description;
    }

    public String getCode() {
        return code;
    }

    private String getErrorCodePrefix() {
        return ERROR_CODE_PREFIX;
    }

    public String getFormattedDescriptionWithCode() {
        return getCode() + " " + getDescription();
    }

    public String getFormattedDescription() {
        return getErrorCodePrefix() + " " + getDescription();
    }

}