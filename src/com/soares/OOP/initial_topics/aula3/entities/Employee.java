package com.soares.OOP.initial_topics.aula3.entities;

import java.util.Locale;
import java.util.Scanner;

public class Employee {

    private String name;
    private double grossSalary;
    private double tax;

    public void setName(String name) {
        this.name = name;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary (double percentage) {
        this.grossSalary += (this.grossSalary * percentage) / 100;
    }

    public static void main (String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.printf("%n----= Employee Data =----%n%n");

        System.out.print("Name: ");
        String nameEmployee = scanner.nextLine();
        employee.setName(nameEmployee);

        System.out.print("Gross Salary: ");
        double grossSalaryEmployee = scanner.nextDouble();
        employee.setGrossSalary(grossSalaryEmployee);

        System.out.print("Tax: ");
        double taxEmployee = scanner.nextDouble();
        employee.setTax(taxEmployee);

        System.out.printf("%n * Employee: %s, $ %.2f%n%n", employee.getName(), employee.netSalary());
        System.out.print("Which percentage to increase salary? ");
        double percentageIncreaseEmployee = scanner.nextDouble();
        employee.increaseSalary(percentageIncreaseEmployee);

        System.out.printf("%n * Updated data: %s, $ %.2f%n", employee.getName(), employee.netSalary());

        scanner.close();
    }
}
