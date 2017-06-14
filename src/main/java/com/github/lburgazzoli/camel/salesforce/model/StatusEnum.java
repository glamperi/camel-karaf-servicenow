/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 23 10:44:07 CEST 2017
 */
package com.github.lburgazzoli.camel.salesforce.model;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Status
 */
public enum StatusEnum {

    // Closed
    CLOSED("Closed"),
    // Escalated
    ESCALATED("Escalated"),
    // New
    NEW("New"),
    // Working
    WORKING("Working");

    final String value;

    private StatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
        for (StatusEnum e : StatusEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}