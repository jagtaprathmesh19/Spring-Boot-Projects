package com.example.events;

import java.util.Date;

/**
 * Base abstract class for all events in the system.
 * This class demonstrates the use of Object class inheritance and method overriding.
 * 
 * Key features:
 * - Abstract class that serves as a base for all event types
 * - Implements common functionality (timestamp)
 * - Forces subclasses to implement toString()
 * - Demonstrates inheritance from Object class
 */
public abstract class Event {
    protected final Date timestamp;

    public Event() {
        this.timestamp = new Date();
    }

    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * Abstract method that forces all subclasses to provide their own string representation.
     * This is a good practice for all classes that extend Object.
     */
    @Override
    public abstract String toString();
} 
