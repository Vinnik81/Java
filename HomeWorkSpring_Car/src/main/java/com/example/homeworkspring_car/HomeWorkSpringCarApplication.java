package com.example.homeworkspring_car;

import com.example.homeworkspring_car.config.HomeWorkSpringCarConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class HomeWorkSpringCarApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HomeWorkSpringCarConfig.class);
        Car car = context.getBean("car3", Car.class);
        System.out.println(car);
        System.out.println();
        Car car1 = context.getBean("car4", Car.class);
        System.out.println(car1);
        context.close();
    }

}
