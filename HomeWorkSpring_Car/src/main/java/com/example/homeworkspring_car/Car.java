package com.example.homeworkspring_car;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope(scopeName = "prototype")
public class Car {
    private Engine engine;
    private Transmission transmission;
    private List<Wheel> wheels;
    private Body body;
    private double price;
    private String brand;
    private String name;

    public Car() {
    }
    public Car(Engine engine, Transmission transmission, List<Wheel> wheels, Body body) {
        this.engine = engine;
        this.transmission = transmission;
        this.wheels = wheels;
        this.body = body;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car " + "brand: " + brand + ", name: " + name + ", price: " + price + " {" +
                " engine: horsePower= " + engine.getHorsePower() +
                ", engine: volume= " + engine.getVolume() +
                ", engine: weight= "  + engine.getWeight() +
                ", engine: price= " + engine.getPrice() + ";\n" +
                "transmission: numberOfGears= " + transmission.getNumberOfGears() +
                ", transmission: type= " + transmission.getType() +
                ", transmission: weight= " + transmission.getWeight() +
                ", transmission: price= " + transmission.getPrice() + ";\n" +
                "wheels: diameter= " + wheels.get(0).getDiameter() +
                ", wheels: weight= " + wheels.get(0).getWeight() +
                ", wheels: price= " + wheels.get(0).getPrice() + ";\n" +
                "body: type= " + body.getType() +
                ", body: weight= " + body.getWeight() +
                ", body: price= " + body.getPrice() + " " +
                '}';
    }
}
