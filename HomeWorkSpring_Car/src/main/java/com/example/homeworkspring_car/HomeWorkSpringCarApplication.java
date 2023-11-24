package com.example.homeworkspring_car;

import com.example.homeworkspring_car.config.HomeWorkSpringCarConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class HomeWorkSpringCarApplication {

    public static void main(String[] args) {
        System.out.println("Введите первую машину (car1; car2; car3; car4): ");
        String var1 = new java.util.Scanner(System.in).nextLine();
        System.out.println("Введите вторую машину (car1; car2; car3; car4): ");
        String var2 = new java.util.Scanner(System.in).nextLine();


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HomeWorkSpringCarConfig.class);
        Car car = context.getBean(var1, Car.class);
        System.out.println(car);
        System.out.println();
        Car car1 = context.getBean(var2, Car.class);
        System.out.println(car1);
        context.close();
    }

}
