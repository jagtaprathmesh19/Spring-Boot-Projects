package com.example.events;

/**
 * Represents a user login event in the system.
 * This class demonstrates inheritance and method overriding from the Event class.
 * 
 * Key features:
 * - Extends the base Event class
 * - Implements specific login-related functionality
 * - Overrides toString() for custom string representation
 * - Demonstrates encapsulation with private fields
 */
public class UserLoginEvent extends Event {
    private String username;
    private boolean success;

    public UserLoginEvent(String username, boolean success) {
        super();
        this.username = username;
        this.success = success;
    }

    public String getUsername() {
        return username;
    }

    public boolean wasSuccessful() {
        return success;
    }

    /**
     * Provides a formatted string representation of the login event.
     * Demonstrates proper toString() implementation.
     */
    @Override
    public String toString() {
        return String.format("UserLoginEvent [Timestamp: %s, User: '%s', Success: %b]",
                getTimestamp(), username, success);
    }

    /**
     * Logs the login attempt for auditing purposes.
     * Demonstrates class-specific behavior.
     */
    public void auditLoginAttempt() {
        System.out.println("AUDIT: Login attempt by " + username + (success ? " was successful." : " FAILED."));
    }
} 
