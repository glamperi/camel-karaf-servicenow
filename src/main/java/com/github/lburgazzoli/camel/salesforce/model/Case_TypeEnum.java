/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Nov 18 14:59:16 CET 2016
 */
package com.github.lburgazzoli.camel.salesforce.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Type
 */
public enum Case_TypeEnum {

    // Hardware
    HARDWARE("Hardware"),
    // Network
    NETWORK("Network"),
    // Other
    OTHER("Other"),
    // Software
    SOFTWARE("Software");

    final String value;

    private Case_TypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Case_TypeEnum fromValue(String value) {
        for (Case_TypeEnum e : Case_TypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
