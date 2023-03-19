package com.soares.OOP.lists.aula1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args)  {

        List<String> names = new ArrayList<>();

        names.add("Beatriz");
        names.add("Ana");
        names.add("Claudia");
        names.add("Marcos");
        names.add("Angela");
        names.add("Fernando");
        names.add("Maria");
        names.add(2,"Carlos");

        System.out.printf("%n[Initial] Length List: %d%n%n", names.size());

        for (String name : names) {
            System.out.println(" * " + name);
        }

        System.out.printf("%n----= Removing Names =-----%n%n");

        names.removeIf(name -> name.charAt(0) == 'C');
        for (String name : names) {
            System.out.println(" * " + name);
        }

        System.out.printf("%n----= Searching Names =-----%n%n");

        System.out.printf("Index of 'Ana': %d", names.indexOf("Ana"));

        System.out.printf("%n%n----= Filtering Names =-----%n%n");
        List<String> filteringNames = names.stream().filter(name -> name.charAt(0) == 'M').toList();

        for (String name : filteringNames) {
            System.out.println(" * " + name);
        }

        System.out.printf("%n----= Filtering the first name =-----%n%n");

        String filteringFirstName = names.stream().filter(name -> name.charAt(0) == 'Z').findFirst().orElse(null);
        System.out.println(" * " + filteringFirstName);

    }

}
