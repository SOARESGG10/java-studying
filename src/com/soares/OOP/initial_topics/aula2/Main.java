package com.soares.OOP.initial_topics.aula2;

import com.soares.OOP.initial_topics.aula2.entities.Product;

import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main (String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

        System.out.printf("%n-----= Register Product =-----%n");
        System.out.print("Name: ");
        String nameProduct = scanner.next();
        product.setName(nameProduct);

        System.out.print("Price: ");
        double priceProduct = scanner.nextDouble();
        product.setPrice(priceProduct);

        System.out.print("Quality: ");
        int qualityProduct = scanner.nextInt();
        product.setQuantity(qualityProduct);

        System.out.printf("%nProduct data: %s, $ %.2f, %d units, Total: $ %.2f%n%n",
                product.getName(), product.getPrice(), product.getQuantity(), product.totalValueInStock());

        System.out.print("Enter the number of products to be added in stock: ");
        int qualityAdded = scanner.nextInt();
        product.addProducts(qualityAdded);
        System.out.printf("%n * Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n%n",
                product.getName(), product.getPrice(), product.getQuantity(), product.totalValueInStock());

        System.out.print("Enter the number of products to be added in stock: ");
        int qualityRemoved = scanner.nextInt();
        product.removeProducts(qualityRemoved);
        System.out.printf("%n * Updated data: %s, $ %.2f, %d units, Total: $ %.2f%n",
                product.getName(), product.getPrice(), product.getQuantity(), product.totalValueInStock());


    }

}
