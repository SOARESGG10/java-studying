package com.soares.OOP.matriz.aula2;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%n----= Matriz =----%n%n");

        System.out.print("How many rows will the matriz be composed of?: ");
        int rows = scanner.nextInt();

        System.out.print("How many columns will the matriz be composed of?: ");
        int columns = scanner.nextInt();

        int[][] matrizNumbers = new int[rows][columns];

        for (int x = 0; x < matrizNumbers.length; x++) {
            for (int y = 0; y < matrizNumbers[x].length; y++) {
                System.out.printf("Number (%d,%d): ", x, y);
                matrizNumbers[x][y] = scanner.nextInt();
            }
        }

        System.out.print("Choose the number you want to analyze: ");
        int number = scanner.nextInt();

        for (int x = 0; x < matrizNumbers.length; x++) {
            for (int y = 0; y < matrizNumbers[x].length; y++) {
                if (matrizNumbers[x][y] == number) {
                    System.out.printf("%n----= Position (%d,%d) =----%n%n", x, y);
                    if (y > 0) {
                        System.out.printf("LEFT: %d%n", matrizNumbers[x][y - 1]);
                    }

                     if (x > 0) {
                         System.out.printf("UP: %d%n", matrizNumbers[x - 1][y]);
                     }

                     if (y < matrizNumbers[x].length - 1) {
                         System.out.printf("RIGHT: %d%n", matrizNumbers[x][y + 1]);
                     }

                     if (x < matrizNumbers[x].length - 1) {
                         System.out.printf("DOWN: %d%n", matrizNumbers[x + 1][y]);
                     }
                }
            }
        }
        scanner.close();
    }
}
