package com.javastudio.school;

import com.javastudio.school.sample.SimpleSpring;

public class Startup {
    public static void main(String[] args) {

        SimpleSpring spring = new SimpleSpring();

        // spring.startSpringContext();
        spring.beanHasNoDefaultConstructor();
    }
}
