package com.soares.input_data.aula1;

import java.util.Scanner;

public class Main {


    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.printf("Hello, %s. You have %d years old", name, age);

        input.close();
    }
}
