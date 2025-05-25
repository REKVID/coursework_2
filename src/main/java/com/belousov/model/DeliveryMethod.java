package com.belousov.model;

public class DeliveryMethod {
    private int id;
    private String name;
    private double price;
    private int speedDays;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSpeedDays() {
        return speedDays;
    }

    public void setSpeedDays(int speedDays) {
        this.speedDays = speedDays;
    }
}