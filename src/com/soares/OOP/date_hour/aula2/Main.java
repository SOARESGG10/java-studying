package com.soares.OOP.date_hour.aula2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main (String[] args) {

        DateTimeFormatter formatterLocalDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterLocalDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter formatterInstant = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());

        LocalDate dateLocalDate = LocalDate.parse("2004-07-20");
        LocalDate nextDaysLocalDate = dateLocalDate.plusDays(10); // + 10 days
        LocalDate pastDaysLocalDate = dateLocalDate.minusDays(10); // -10 days

        LocalDateTime dateLocalDateTime = LocalDateTime.parse("2004-07-20T20:00:00");
        LocalDateTime nextDaysLocalDateTime = dateLocalDateTime.plusDays(3);
        LocalDateTime pastDaysLocalDateTime = dateLocalDateTime.minusDays(3);

        Instant dateInstant = Instant.parse("2004-07-20T20:00:00Z");
        Instant nextMinutesInstant = dateInstant.plus(30, ChronoUnit.MINUTES);
        Instant pastMinutesInstant = dateInstant.minus(30, ChronoUnit.MINUTES);

        System.out.printf("%n----= LocalDate =----%n%n");
        System.out.printf("[LocalDate] Date: %s%n", dateLocalDate.format(formatterLocalDate));
        System.out.printf("[LocalDate] Next Days: %s%n", nextDaysLocalDate.format(formatterLocalDate));
        System.out.printf("[LocalDate] Past Days: %s%n", pastDaysLocalDate.format(formatterLocalDate));

        System.out.printf("%n----= LocalDateTime =----%n%n");
        System.out.printf("[LocalDateTime] Date: %s%n", dateLocalDateTime.format(formatterLocalDateTime));
        System.out.printf("[LocalDateTime] Next Hours: %s%n", nextDaysLocalDateTime.format(formatterLocalDateTime));
        System.out.printf("[LocalDateTime] Past Hours: %s%n", pastDaysLocalDateTime.format(formatterLocalDateTime));

        System.out.printf("%n----= Instant =----%n%n");
        System.out.printf("[Instant] Date: %s%n", dateLocalDateTime.format(formatterLocalDateTime));
        System.out.printf("[Instant] Next Minutes: %s%n", formatterInstant.format(nextMinutesInstant));
        System.out.printf("[Instant] Past Minutes: %s%n", formatterInstant.format(pastMinutesInstant));

        System.out.printf("%n----= Duration =----%n%n");
        Duration durationDate = Duration.between(pastDaysLocalDateTime, dateLocalDateTime);
        System.out.printf("* %s | %s%n", pastDaysLocalDateTime.format(formatterLocalDateTime), dateLocalDateTime.format(formatterLocalDateTime));
        System.out.printf("[Duration]: %s days%n", durationDate.toDays());

    }
}
