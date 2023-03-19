package com.soares.OOP.initial_topics.aula2.entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product() {
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

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
