package com.example.events;

/**
 * Main demonstration class for the event processing system.
 * This class shows how to use the Object class features in a practical application.
 * 
 * Key concepts demonstrated:
 * 1. Object class as the root of Java's class hierarchy
 * 2. Polymorphism through Object references
 * 3. Type checking and casting
 * 4. Method overriding
 * 5. Runtime type information
 */
public class DynamicEventDemo {
    public static void main(String[] args) {
        // Create an event processor that can handle any type of object
        EventProcessor processor = new EventProcessor();

        // ===== Creating Different Types of Events =====
        
        // 1. User Login Events
        // Demonstrates custom object creation and state management
        UserLoginEvent login1 = new UserLoginEvent("alice_wonder", true);
        UserLoginEvent login2 = new UserLoginEvent("bob_builder", false);

        // 2. Data Update Event
        // Shows complex object state with multiple field changes
        DataUpdateEvent update1 = new DataUpdateEvent("REC001");
        update1.addChange("status", "COMPLETED");
        update1.addChange("priority", "HIGH");

        // 3. Error Message Events
        // Demonstrates different severity levels and error handling
        ErrorMessageEvent error1 = new ErrorMessageEvent(404, "Resource not found", "WARNING");
        ErrorMessageEvent error2 = new ErrorMessageEvent(500, "Database server down", "CRITICAL");

        // 4. String Messages
        // Shows that even built-in types can be processed
        String infoMessage = "System maintenance scheduled for 2 AM.";
        String urgentMessage = "URGENT: Security breach detected!";
        
        // 5. Integer Object
        // Demonstrates processing of wrapper class objects
        Integer someOtherObject = Integer.valueOf(12345);

        // ===== Processing Events =====
        // Each processEvent call demonstrates:
        // - Runtime type checking
        // - Safe type casting
        // - Polymorphic behavior
        // - Object class method usage
        
        System.out.println("\n=== Processing Custom Event Objects ===");
        processor.processEvent(login1);    // UserLoginEvent
        processor.processEvent(update1);   // DataUpdateEvent
        processor.processEvent(error1);    // ErrorMessageEvent

        System.out.println("\n=== Processing String Objects ===");
        processor.processEvent(infoMessage);    // Regular String
        processor.processEvent(login2);         // Another UserLoginEvent
        processor.processEvent(error2);         // Another ErrorMessageEvent
        processor.processEvent(urgentMessage);  // String with special handling

        System.out.println("\n=== Processing Other Object Types ===");
        processor.processEvent(someOtherObject); // Integer object
    }
} 
