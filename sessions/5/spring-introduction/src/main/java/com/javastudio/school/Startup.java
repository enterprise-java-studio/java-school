package com.javastudio.school;

import com.javastudio.school.service.CarService;
import com.javastudio.school.util.Spring;

public class Startup {
    public static void main(String[] args) {

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
}
