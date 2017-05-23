/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 23 10:44:07 CEST 2017
 */
package com.github.lburgazzoli.camel.salesforce.model;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Origin
 */
public enum OriginEnum {

    // Email
    EMAIL("Email"),
    // Phone
    PHONE("Phone"),
    // Web
    WEB("Web");

    final String value;

    private OriginEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static OriginEnum fromValue(String value) {
        for (OriginEnum e : OriginEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
