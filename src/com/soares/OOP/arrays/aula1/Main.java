package com.soares.OOP.arrays.aula1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%n----= Height Average =----%n%n");
        System.out.print("How many heights do you want to get? ");
        int amount = scanner.nextInt();

        double[] heights = new double[amount];

        for (int i = 0; i < amount; i++) {
            System.out.print("Height: ");
            double height = scanner.nextDouble();
            heights[i] = height;
        }

        double sum = 0.0;

        for (int i = 0; i < amount; i++) {
            sum += heights[i];
        }

        double average = sum / amount;

        System.out.printf("%n * AVERAGE HEIGHT: %.2f%n%n", average);
    }
}