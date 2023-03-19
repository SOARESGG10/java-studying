package com.soares.OOP.arrays.aula3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%n ----= Negative and Positive Numbers =----%n%n");
        System.out.print("How many numbers will be checked? ");
        int amount = scanner.nextInt();

        int[] numbers = new int[amount];

        for (int i = 0; i < amount; i++) {
            System.out.print("Number: ");
            int number = scanner.nextInt();

            numbers[i] = number;
        }

        System.out.printf("%n ----= NEGATIVE NUMBERS =---- %n%n");
        for (int number : numbers) {
            if (number < 0) {
                System.out.printf(" * Negative Numbers: %d%n", number);
            }
        }

        System.out.printf("%n ----= POSITIVE NUMBERS =---- %n%n");
        for (int number : numbers) {
            if (number > 0) {
                System.out.printf(" * Positive Numbers: %d%n", number);
            }
        }
    scanner.close();
    }

}
