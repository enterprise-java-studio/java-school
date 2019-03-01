package com.javastudio.school.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring {

    private static ApplicationContext container = new ClassPathXmlApplicationContext("spring-config.xml");

    public static Object getBean(String beanId) {
        return container.getBean(beanId);
    }

    public static void init() {
        container = new ClassPathXmlApplicationContext("spring-config.xml");
    }

}
