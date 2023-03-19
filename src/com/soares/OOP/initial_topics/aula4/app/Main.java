package com.soares.OOP.initial_topics.aula4.app;

import com.soares.OOP.initial_topics.aula4.util.Calculator;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%n ----= Data Circumference =----%n%n");

        System.out.print("Radius (m): ");
        double radiusCircumference = scanner.nextDouble();

        System.out.printf("%n * Circumference: %.2f m%n", Calculator.circumference(radiusCircumference));
        System.out.printf(" * Volume: %.2f m%n", Calculator.volume(radiusCircumference));
    }

}
