package com.soares.OOP.initial_topics.aula6.entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product (String name, double price, int quality) {
        this.name = name;
        this.price = price;
        this.quantity = quality;
    }
    public Product (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName () {
        return name;
    }

    public double getPrice () {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public double totalValueInStock () {
        return price * quantity;
    }

    public void addProducts (int quality) {
        this.quantity += quality;
    }

    public void removeProducts (int quality) {
        this.quantity -= quality;
    }
}
