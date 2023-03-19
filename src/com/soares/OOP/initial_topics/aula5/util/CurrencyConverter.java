package com.soares.OOP.initial_topics.aula5.util;

public class CurrencyConverter {

    private static double dollar;
    private static final double IOF = 0.0538;

    public static void setDollar (double dollar) {
        CurrencyConverter.dollar = dollar;
    }

    public static double converter (double real) {
        return dollar * real + dollar * IOF;
    }

}
