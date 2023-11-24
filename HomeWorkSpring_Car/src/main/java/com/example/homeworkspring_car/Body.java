package com.example.homeworkspring_car;

import org.springframework.stereotype.Component;

@Component
public class Body {
    private String type;
    private double weight;
    private double price;

    public Body() {
    }

    public Body(String type, double weight, double price) {
        this.type = type;
        this.weight = weight;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
