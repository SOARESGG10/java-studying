package com.soares.OOP.initial_topics.aula5.app;

import com.soares.OOP.initial_topics.aula5.util.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%n ----= Currency Converter =----%n%n");

        System.out.print("What is the dollar price: ");
        double dollarNow = scanner.nextDouble();
        CurrencyConverter.setDollar(dollarNow);

        System.out.print("How many reais in dollars will be bought? ");
        double howManyReais = scanner.nextDouble();

        System.out.printf("%n * Amount to be paid in reais: %.2f%n", CurrencyConverter.converter(howManyReais));

    }

}
