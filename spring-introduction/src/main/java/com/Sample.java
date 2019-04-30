package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import srv.Service;

public class Sample {
    private static ApplicationContext iocContainer = new ClassPathXmlApplicationContext("spring-config.xml");

    public static void main(String[] args) {
//        Service service = new ServiceImpl();
        Service service = (Service) iocContainer.getBean("x");

        service.doSometh("H");
    }

}
