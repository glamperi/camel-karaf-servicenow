/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed Feb 15 13:57:47 CET 2017
 */
package com.github.lburgazzoli.camel.salesforce.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Reason
 */
public enum Case_ReasonEnum {

    // Breakdown
    BREAKDOWN("Breakdown"),
    // Equipment Complexity
    EQUIPMENT_COMPLEXITY("Equipment Complexity"),
    // Equipment Design
    EQUIPMENT_DESIGN("Equipment Design"),
    // Feedback
    FEEDBACK("Feedback"),
    // Installation
    INSTALLATION("Installation"),
    // Other
    OTHER("Other"),
    // Performance
    PERFORMANCE("Performance");

    final String value;

    private Case_ReasonEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Case_ReasonEnum fromValue(String value) {
        for (Case_ReasonEnum e : Case_ReasonEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
