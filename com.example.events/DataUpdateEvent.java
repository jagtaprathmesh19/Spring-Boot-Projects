package com.example.events;

import java.util.Map;
import java.util.HashMap;

/**
 * Represents a data update event in the system.
 * This class demonstrates complex object state management and Map usage.
 * 
 * Key features:
 * - Extends the base Event class
 * - Uses Map to store field changes
 * - Implements custom logging functionality
 * - Demonstrates proper toString() implementation
 */
public class DataUpdateEvent extends Event {
    private String recordId;
    private Map<String, Object> updatedFields;

    public DataUpdateEvent(String recordId) {
        super();
        this.recordId = recordId;
        this.updatedFields = new HashMap<>();
    }

    public void addChange(String fieldName, Object newValue) {
        this.updatedFields.put(fieldName, newValue);
    }

    public String getRecordId() {
        return recordId;
    }

    public Map<String, Object> getUpdatedFields() {
        return updatedFields;
    }

    /**
     * Provides a formatted string representation of the data update event.
     * Demonstrates proper toString() implementation with field count.
     */
    @Override
    public String toString() {
        return String.format("DataUpdateEvent [Timestamp: %s, RecordID: '%s', Changes: %d fields]",
                getTimestamp(), recordId, updatedFields.size());
    }

    /**
     * Logs all field changes for the update event.
     * Demonstrates iteration over Map entries and formatted output.
     */
    public void logFieldChanges() {
        System.out.println("DATA_UPDATE_LOG: Record '" + recordId + "' updated. Fields changed:");
        for (Map.Entry<String, Object> entry : updatedFields.entrySet()) {
            System.out.println("  - " + entry.getKey() + ": " + entry.getValue());
        }
    }
} 

