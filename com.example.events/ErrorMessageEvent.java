package com.example.events;

/**
 * Represents an error message event in the system.
 * This class demonstrates error handling and severity-based processing.
 * 
 * Key features:
 * - Extends the base Event class
 * - Implements error-specific functionality
 * - Demonstrates severity-based behavior
 * - Shows proper toString() implementation
 */
public class ErrorMessageEvent extends Event {
    private int errorCode;
    private String message;
    private String severity; // e.g., "INFO", "WARNING", "CRITICAL"

    public ErrorMessageEvent(int errorCode, String message, String severity) {
        super();
        this.errorCode = errorCode;
        this.message = message;
        this.severity = severity;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getMessage() {
        return message;
    }

    public String getSeverity() {
        return severity;
    }

    /**
     * Provides a formatted string representation of the error event.
     * Demonstrates proper toString() implementation with all relevant fields.
     */
    @Override
    public String toString() {
        return String.format("ErrorMessageEvent [Timestamp: %s, Code: %d, Severity: %s, Message: '%s']",
                getTimestamp(), errorCode, severity, message);
    }

    /**
     * Handles error escalation based on severity level.
     * Demonstrates conditional processing based on object state.
     */
    public void escalateError() {
        if ("CRITICAL".equalsIgnoreCase(severity)) {
            System.out.println("ESCALATION: Critical Error " + errorCode + " reported: " + message + ". Paging on-call engineer!");
        } else {
            System.out.println("ERROR_LOG: " + severity + " Error " + errorCode + ": " + message);
        }
    }
} 

