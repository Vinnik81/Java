package com.example.homeworkspring_car;

import org.springframework.stereotype.Component;

@Component
public class Wheel {
    private double diameter;
    private double weight;
    private double price;

    public Wheel() {
    }

    public Wheel(double diameter, double weight, double price) {
        this.diameter = diameter;
        this.weight = weight;
        this.price = price;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
