package com.javastudio.school.service;

public class BeanHasNoDefaultConstructor {

    private final String value1;
    private final String value2;

    public BeanHasNoDefaultConstructor(String value1, String value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return value1 + " " + value2;
    }
}
