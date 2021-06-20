package com.example.week6.enums;

public enum Sex {
    MALE("M"),
    FEMALE("F");

    private final String label;
    private Sex(String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
