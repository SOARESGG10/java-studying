package com.soares.OOP.arrays.aula2.app;

import com.soares.OOP.arrays.aula2.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%n ----= Products =----%n%n");
        System.out.print("How many products will be registered? ");
        int amount = scanner.nextInt();

        Product[] products = new Product[amount];

        for (int i = 0; i < products.length; i++) {
            scanner.nextLine();
            System.out.print("Enter name product: ");
            String name = scanner.nextLine();

            System.out.print("Enter price product: ");
            double price = scanner.nextDouble();

            products[i] = new Product(name, price);
        }

        double sum = 0.0;

        for (int i = 0; i < products.length; i++) {
            sum += products[i].getPrice();
        }

        double average = sum / amount;

        System.out.printf("%n * AVERAGE PRICE: %.2f%n", average);
        System.out.printf("LENGTH ARRAY: %d", products.length);
        scanner.close();
    }

}
