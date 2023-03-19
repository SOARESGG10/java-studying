package com.soares.sequential_structure.aula2;

import java.util.Locale;

public class Main {

    public static void main (String[] args) {
        //Calculate area of a trapezoid

        Locale.setDefault(Locale.US);

        float biggerBase = 6.5f;
        float minorBase = 4.2f;
        float height = 2.5f;
        float area = ((biggerBase + minorBase) / 2) * height;

        System.out.println("--------= Info trapezoid =-------- ");
        System.out.printf("Bigger base: %.1f%n", biggerBase);
        System.out.printf("Minor base: %.1f%n", minorBase);
        System.out.printf("Height: %.1f%n", height);
        System.out.printf("Area of a trapezoid: %.1f%n", area);
    }

}
