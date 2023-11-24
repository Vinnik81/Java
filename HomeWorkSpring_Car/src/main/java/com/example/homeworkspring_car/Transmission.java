package com.example.homeworkspring_car;

import org.springframework.stereotype.Component;

@Component
public class Transmission {
    private int numberOfGears;
    private String type;
    private double weight;
    private double price;

    public Transmission() {
    }

    public Transmission(int numberOfGears, String type, double weight, double price) {
        this.numberOfGears = numberOfGears;
        this.type = type;
        this.weight = weight;
        this.price = price;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
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
