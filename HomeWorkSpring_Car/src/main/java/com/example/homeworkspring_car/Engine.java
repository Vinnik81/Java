package com.example.homeworkspring_car;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    private int horsePower;
    private double volume;
    private double weight;
    private double price;

    public Engine() {
    }

    public Engine(int horsePower, double volume, double weight, double price) {
        this.horsePower = horsePower;
        this.volume = volume;
        this.weight = weight;
        this.price = price;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
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
