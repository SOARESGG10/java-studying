package com.soares.OOP.initial_topics.aula1;

import com.soares.OOP.initial_topics.aula1.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main (String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);
        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.printf("Enter the measures of triangle X: %n%n");

        System.out.print("Enter measure A: ");
        x.a = scanner.nextDouble();

        System.out.print("Enter measure B: ");
        x.b = scanner.nextDouble();

        System.out.print("Enter measure C: ");
        x.c = scanner.nextDouble();

        System.out.printf("%nEnter the measures of triangle Y: %n%n");

        System.out.print("Enter measure A: ");
        y.a = scanner.nextDouble();

        System.out.print("Enter measure B: ");
        y.b = scanner.nextDouble();

        System.out.print("Enter measure C: ");
        y.c = scanner.nextDouble();

        double areaX = x.calculateArea();
        double areaY = y.calculateArea();

        System.out.printf("%n * Triangle X area: %f%n", areaX);
        System.out.printf("%n * Triangle Y area: %f%n", areaY);

        if (areaX > areaY) {
            System.out.printf("%n * Lager area: X");
        } else if(areaY > areaX) {
            System.out.printf("%n * Lager area: Y");
        } else {
            System.out.printf("%n * Equals areas");
        }

        scanner.close();
    }

}
