package com.soares.OOP.lists.aula2.entities;

public class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

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

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double increase) {
        this.salary += this.salary * (increase / 100);
    }

    @Override
    public String toString () {
        return "%d, %s, $ %.2f".formatted(id, name, salary);
    }

}
