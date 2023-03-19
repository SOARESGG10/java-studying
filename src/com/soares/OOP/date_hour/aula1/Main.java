package com.soares.OOP.date_hour.aula1;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main (String[] args) {

        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");


//       Date and Date Time Now
        LocalDate dateNow = LocalDate.now();
        LocalDateTime dateTimeNow = LocalDateTime.now();
        Instant dateTimeNowGMT = Instant.now();

//        String -> Object Date
        LocalDate dateISO8601 = LocalDate.parse("2000-01-01");
        LocalDateTime dateTimeISO8601 = LocalDateTime.parse("2000-01-01T20:00:01");
        Instant dateTimeISO8601GMT = Instant.parse("2000-01-01T20:00:01-03:00");

        LocalDate dateFormatCustom = LocalDate.parse("20/01/2000", formatterDate);
        LocalDateTime dateTimeFormatCustom = LocalDateTime.parse("20/01/2000 20:00:01", formatterDateTime);

        LocalDate dateOf = LocalDate.of(2000, 1, 1);
        LocalDateTime dateTimeOf = LocalDateTime.of(2000, 1, 1, 20, 0, 1);

        System.out.printf("%n----= String -> Object Date =----%n%n");
        System.out.println(" * " + dateNow);
        System.out.println(" * " + dateTimeNow);
        System.out.println(" * " + dateTimeNowGMT);
        System.out.println(" * " + dateISO8601);
        System.out.println(" * " + dateTimeISO8601);
        System.out.println(" * " + dateTimeISO8601GMT);
        System.out.println(" * " + dateFormatCustom);
        System.out.println(" * " + dateTimeFormatCustom);
        System.out.println(" * " + dateOf);
        System.out.println(" * " + dateTimeOf);

        System.out.printf("%n----= Object Date -> String =----%n%n");
        System.out.println(" * " + dateNow.format(formatterDate));
        System.out.println(" * " + dateTimeNow.format(formatterDateTime));
//      ------------------------- OR -------------------------------------
        System.out.println(" * " + formatterDate.format(dateNow));
        System.out.println(" * " + formatterDateTime.format(dateTimeNow));

    }

}