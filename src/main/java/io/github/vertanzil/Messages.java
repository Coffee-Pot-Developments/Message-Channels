package io.github.vertanzil;

/**
 *
 */
public enum Messages {
    Message_001("0001", "Files not found."),
    Message_002("0002", "No connection to the database"),
    Message_003("0003", "Server offline"),
    Message_004("0004", "Not found"),
    ;

    private String code;
    private String description;
    private static final String ERROR_CODE_PREFIX = "BCV";

    private void Error(final String code, final String description) {
        this.code = code;
        this.description = description;
    }

    Messages(final String number, final String s) {
        code = ERROR_CODE_PREFIX + number;
        description = s;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return error code
     */
    public String getCode() {
        return code;
    }

    /**
     * @return get error code with prefix
     */
    public static String getErrorCodePrefix() {
        return ERROR_CODE_PREFIX;
    }

    /**
     * @return Error code and description that is formatted.
     */
    public String getFormattedDescriptionWithCode() {
        return code + " " + description;
    }

    /**
     * @return description formatted with code.
     */
    public String getFormattedDescription() {
        return ERROR_CODE_PREFIX + " " + description;
    }

}