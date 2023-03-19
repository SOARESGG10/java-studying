package com.soares.OOP.arrays.aula4.app;

import com.soares.OOP.arrays.aula4.entities.Rent;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        Rent[] rents = new Rent[10];

        System.out.printf("%n ----= Rent System =----%n%n");

        System.out.print("How many rooms will be rented? ");
        int amount = scanner.nextInt();

        for (int i = 0; i < amount; i++) {
            System.out.printf("%nRent #%d:%n", i + 1);

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.next();

            System.out.print("Room: ");
            int room = scanner.nextInt();

            rents[room] = new Rent(name, email, room);
        }

        System.out.printf("%n ----= Busy rooms =----%n%n");
        for (Rent rent : rents) {
            if (rent != null) {
                System.out.println(rent);
            }
        }

    }

}
