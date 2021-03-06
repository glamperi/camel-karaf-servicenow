/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Feb 16 13:01:59 CET 2017
 */
package com.github.lburgazzoli.camel.salesforce.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Product__c
 */
public enum Case_ProductEnum {

    // GC1020
    GC1020("GC1020"),
    // GC1040
    GC1040("GC1040"),
    // GC1060
    GC1060("GC1060"),
    // GC3020
    GC3020("GC3020"),
    // GC3040
    GC3040("GC3040"),
    // GC3060
    GC3060("GC3060"),
    // GC5020
    GC5020("GC5020"),
    // GC5040
    GC5040("GC5040"),
    // GC5060
    GC5060("GC5060");

    final String value;

    private Case_ProductEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Case_ProductEnum fromValue(String value) {
        for (Case_ProductEnum e : Case_ProductEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
