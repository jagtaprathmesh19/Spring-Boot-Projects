package com.example.events;

/**
 * Processes different types of events using Object class features.
 * This class demonstrates runtime type checking and polymorphic behavior.
 * 
 * Key features:
 * - Uses Object as a parameter type for maximum flexibility
 * - Demonstrates instanceof operator usage
 * - Shows safe type casting
 * - Implements polymorphic processing
 */
public class EventProcessor {

    /**
     * Processes any type of event using Object class features.
     * Demonstrates:
     * 1. Runtime type checking with instanceof
     * 2. Safe type casting
     * 3. Polymorphic method calls
     * 4. Object class method usage (toString, getClass)
     * 
     * @param eventData The event to process (can be any type of object)
     */
    public void processEvent(Object eventData) {
        System.out.println("\n----- Processing New Event -----");
        
        // 1. Generic operations using Object methods
        System.out.println("Received Event Data: " + eventData.toString());
        System.out.println("Runtime class of event: " + eventData.getClass().getName());

        // 2. Runtime Type Identification and Processing
        if (eventData instanceof UserLoginEvent) {
            System.out.println("Type: User Login");
            UserLoginEvent loginEvent = (UserLoginEvent) eventData;
            loginEvent.auditLoginAttempt();
            System.out.println("Login user: " + loginEvent.getUsername());

        } else if (eventData instanceof DataUpdateEvent) {
            System.out.println("Type: Data Update");
            DataUpdateEvent updateEvent = (DataUpdateEvent) eventData;
            updateEvent.logFieldChanges();
            System.out.println("Updated record: " + updateEvent.getRecordId());

        } else if (eventData instanceof ErrorMessageEvent) {
            System.out.println("Type: Error Message");
            ErrorMessageEvent errorEvent = (ErrorMessageEvent) eventData;
            errorEvent.escalateError();
            System.out.println("Error severity: " + errorEvent.getSeverity());

        } else if (eventData instanceof String) {
            System.out.println("Type: Simple String Message");
            String message = (String) eventData;
            System.out.println("Plain Text Message: \"" + message + "\"");
            if (message.toLowerCase().contains("urgent")) {
                System.out.println("URGENT_FLAG: This string message seems urgent.");
            }
        } else {
            System.out.println("Type: Unknown or Generic Object");
            System.out.println("No specific processing defined for type: " + eventData.getClass().getSimpleName());
        }
        System.out.println("----- Event Processing Complete -----");
    }
} 

