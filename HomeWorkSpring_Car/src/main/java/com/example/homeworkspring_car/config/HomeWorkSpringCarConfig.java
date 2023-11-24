package com.example.homeworkspring_car.config;

import com.example.homeworkspring_car.Body;
import com.example.homeworkspring_car.Car;
import com.example.homeworkspring_car.Transmission;
import com.example.homeworkspring_car.Wheel;
import com.example.homeworkspring_car.Engine;
import org.springframework.context.annotation.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

@Configuration
@ComponentScan(value = "com.example.homeworkspring_car")
@Scope(value = "prototype")
public class HomeWorkSpringCarConfig {
    @Bean
    public Engine engine() {
        Engine engine = new Engine();
        engine.setHorsePower(200);
        engine.setVolume(2.0);
        engine.setWeight(300.0);
        engine.setPrice(1000000);
        return engine;
    }
    @Bean
    public Engine engine1() {
        Engine engine = new Engine();
        engine.setHorsePower(350);
        engine.setVolume(2.5);
        engine.setWeight(300.0);
        engine.setPrice(2000000);
        return engine;
    }
    @Bean
    public Engine engine2() {
        Engine engine = new Engine();
        engine.setHorsePower(150);
        engine.setVolume(2.0);
        engine.setWeight(200.0);
        engine.setPrice(1800000);
        return engine;
    }
    @Bean
    public Engine engine3() {
        Engine engine = new Engine();
        engine.setHorsePower(150);
        engine.setVolume(1.5);
        engine.setWeight(200.0);
        engine.setPrice(300000);
        return engine;
    }

    @Bean
    public Transmission transmission() {
        Transmission transmission = new Transmission();
        transmission.setNumberOfGears(6);
        transmission.setType("Manual");
        transmission.setWeight(100.0);
        transmission.setPrice(300000);
        return transmission;
    }
    @Bean
    public Transmission transmission1() {
        Transmission transmission = new Transmission();
        transmission.setNumberOfGears(6);
        transmission.setType("Automatic");
        transmission.setWeight(100.0);
        transmission.setPrice(500000);
        return transmission;
    }
    @Bean
    public Transmission transmission2() {
        Transmission transmission = new Transmission();
        transmission.setNumberOfGears(6);
        transmission.setType("Manual");
        transmission.setWeight(100.0);
        transmission.setPrice(350000);
        return transmission;
    }
    @Bean
    public Transmission transmission3() {
        Transmission transmission = new Transmission();
        transmission.setNumberOfGears(7);
        transmission.setType("Automatic");
        transmission.setWeight(100.0);
        transmission.setPrice(200000);
        return transmission;
    }

    @Bean
    public Wheel wheel() {
        Wheel wheel = new Wheel();
        wheel.setDiameter(17.0);
        wheel.setWeight(20.0);
        wheel.setPrice(5000);
        return wheel;
    }
    @Bean
    public Wheel wheel1() {
        Wheel wheel = new Wheel();
        wheel.setDiameter(17.0);
        wheel.setWeight(20.0);
        wheel.setPrice(10000);
        return wheel;
    }

    @Bean
    public Body body() {
        Body body = new Body();
        body.setType("Sedan");
        body.setWeight(500.0);
        body.setPrice(500000);
        return body;
    }
    @Bean
    public Body body1() {
        Body body = new Body();
        body.setType("Crossover");
        body.setWeight(700.0);
        body.setPrice(1500000);
        return body;
    }
    @Bean
    public Body body2() {
        Body body = new Body();
        body.setType("Sedan");
        body.setWeight(600.0);
        body.setPrice(1000000);
        return body;
    }
    @Bean
    public Body body3() {
        Body body = new Body();
        body.setType("Crossover");
        body.setWeight(600.0);
        body.setPrice(500000);
        return body;
    }

    @Bean
    public Car car1(Engine engine, Transmission transmission, List<Wheel> wheels, Body body) {
        Car car = new Car();
        car.setEngine(engine);
        car.setTransmission(transmission);
        car.setWheels(wheels);
        car.setBody(body);
        car.setPrice(3000000);
        car.setBrand("Toyota");
        car.setName("Camry");
        return car;
    }
    @Bean
    public Car car2(Engine engine1, Transmission transmission1, List<Wheel> wheels1, Body body1) {
        Car car = new Car();
        car.setEngine(engine1);
        car.setTransmission(transmission1);
        car.setWheels(wheels1);
        car.setBody(body1);
        car.setPrice(6000000);
        car.setBrand("BMV");
        car.setName("X5");
        return car;
    }
    @Bean
    public Car car3(Engine engine2, Transmission transmission2, List<Wheel> wheels1, Body body2) {
        Car car = new Car();
        car.setEngine(engine2);
        car.setTransmission(transmission2);
        car.setWheels(wheels1);
        car.setBody(body2);
        car.setPrice(9000000);
        car.setBrand("Mercedes");
        car.setName("E-class");
        return car;
    }
    @Bean
    public Car car4(Engine engine3, Transmission transmission3, List<Wheel> wheels, Body body3) {
        Car car = new Car();
        car.setEngine(engine3);
        car.setTransmission(transmission3);
        car.setWheels(wheels);
        car.setBody(body3);
        car.setPrice(2929000);
        car.setBrand("Haval");
        car.setName("F7");
        return car;
    }

}
