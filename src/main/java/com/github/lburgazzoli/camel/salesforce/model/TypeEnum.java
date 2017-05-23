/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 23 10:44:07 CEST 2017
 */
package com.github.lburgazzoli.camel.salesforce.model;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Type
 */
public enum TypeEnum {

    // Hardware
    HARDWARE("Hardware"),
    // Network
    NETWORK("Network"),
    // Other
    OTHER("Other"),
    // Software
    SOFTWARE("Software");

    final String value;

    private TypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
        for (TypeEnum e : TypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
