package io.github.vertanzil;

import java.util.Arrays;
import java.util.Optional;
import java.util.Collections;
/**
 * This enum is immutable and thread-safe.
 */
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

    private static void validateParameters(final String code, final String description) {
        if (code == null || code.isEmpty() || description == null || description.isEmpty()) {
            throw new IllegalArgumentException("Code and description must not be null or empty");
        }
    }

    Messages(final String code, final String description) {
        validateParameters(code, description);
        this.code = ERROR_CODE_PREFIX + code;
        this.description = description;
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

    /**
     * Retrieve a Messages enum by its code.
     * @param code the code to search for
     * @return an Optional containing the matching Messages enum, or empty if not found
     */
    public static Optional<Messages> fromCode(String code) {
        return Collections.unmodifiableList(Arrays.asList(values())).stream()
                .filter(message -> message.getCode().equals(ERROR_CODE_PREFIX + code))
                .findFirst();
    }

    /**
     * Retrieve a Messages enum by its description.
     * @param description the description to search for
     * @return an Optional containing the matching Messages enum, or empty if not found
     */
    public static Optional<Messages> fromDescription(String description) {
        return Arrays.stream(values())
                .filter(message -> message.getDescription().equals(description))
                .findFirst();
    }
}