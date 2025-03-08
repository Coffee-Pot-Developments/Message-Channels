package io.github.vertanzil;

public enum Messages {
    /**
     * Error code for file not found.
     */
    FILE_NOT_FOUND("0001", "Files not found."),

    /**
     * Error code for no database connection.
     */
    NO_DB_CONNECTION("0002", "No connection to the database"),

    /**
     * Error code for server offline.
     */
    SERVER_OFFLINE("0003", "Server offline"),

    /**
     * Error code for not found.
     */
    NOT_FOUND("0004", "Not found"),
    ;

    private final String code;
    private final String description;
    private static final String ERROR_CODE_PREFIX = "BCV";

    Messages(final String number, final String s) {
        if (number == null || number.isEmpty() || s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Number and description must not be null or empty");
        }
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
        return code + " " + description;
    }

}