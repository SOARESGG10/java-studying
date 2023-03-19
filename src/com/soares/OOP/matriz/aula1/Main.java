package com.soares.OOP.matriz.aula1;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%n----= Matriz =----%n%n");

        System.out.print("How many rows and columns will the matriz be composed of?: ");
        int amount = scanner.nextInt();

        int[][] matrizNumbers = new int[amount][amount];

            for (int x = 0; x < matrizNumbers.length; x++) {
                for (int y = 0; y < matrizNumbers[x].length; y++) {
                    System.out.printf("Number (%d,%d): ", x, y);
                    matrizNumbers[x][y] = scanner.nextInt();
                }
            }

            System.out.printf("%n----= Main Diagonal =----%n%n");
            for (int x = 0; x < matrizNumbers.length; x++) {
                for (int y = 0; y < matrizNumbers[x].length; y++) {
                    if (x == y) {
                        System.out.printf("Number (%d,%d): %d%n", x, y, matrizNumbers[x][y]);
                    }
                }
            }

                System.out.printf("%n----= Negative Numbers =----%n%n");
                for (int x = 0; x < matrizNumbers.length; x++) {
                    for (int y = 0; y < matrizNumbers[x].length; y++) {
                        if (matrizNumbers[x][y] < 0) {
                            System.out.printf("Number (%d,%d): %d%n", x, y, matrizNumbers[x][y]);
                        }
                    }
                }

        scanner.close();
    }

}
