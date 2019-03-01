package com.javastudio.school.sample;

import com.javastudio.school.service.BeanHasNoDefaultConstructor;
import com.javastudio.school.service.CarService;
import com.javastudio.school.util.Spring;

public class SimpleSpring {
    public void startSpringContext() {
        try {
            while (true) {
                CarService carService = (CarService) Spring.getBean("carService");
                carService.start();

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void beanHasNoDefaultConstructor() {
        BeanHasNoDefaultConstructor noDefaultConstructor = (BeanHasNoDefaultConstructor) Spring.getBean("beanHasNoDefaultConstructor");
        System.out.println(noDefaultConstructor.toString());
    }
}
