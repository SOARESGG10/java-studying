package com.soares.sequential_structure.aula1;

import java.util.Locale;

public class Main {


    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Video Card";

        byte age = 30;
        int code = 590;
        char gender = 'M';

        double price1 = 2250.99;
        double price2 = 2700.00;
        double measure = 53.654545;

        System.out.println("Products: ");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender %c.%n", age, code, gender);
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }

}
