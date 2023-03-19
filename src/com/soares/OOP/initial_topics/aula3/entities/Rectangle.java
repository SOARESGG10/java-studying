package com.soares.OOP.initial_topics.aula3.entities;

import java.util.Locale;
import java.util.Scanner;

public class Rectangle {

    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area () {
        double area =  width * height;
        return area;
    }

    public double perimeter () {
        double perimeter = (2 * width + 2 * height);
        return perimeter;
    }

    public double diagonal () {
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        return diagonal;
    }


    public static void main (String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.printf("%n ----= Rectangle Data =----%n%n");

        System.out.print("Width: ");
        double widthRectangle = scanner.nextDouble();
        rectangle.setWidth(widthRectangle);

        System.out.print("Height: ");
        double heightRectangle = scanner.nextDouble();
        rectangle.setHeight(heightRectangle);

        System.out.printf("%n * AREA: %.2f", rectangle.area());
        System.out.printf("%n * PERIMETER: %.2f", rectangle.perimeter());
        System.out.printf("%n * DIAGONAL: %.2f%n", rectangle.diagonal());

        scanner.close();
    }
}
