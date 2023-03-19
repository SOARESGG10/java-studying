package com.soares.OOP.initial_topics.aula3.entities;

import java.util.Locale;
import java.util.Scanner;

public class Student {

    private String name;
    private double firstTrimesterGrade;
    private double secondTrimesterGrade;
    private double thirdTrimesterGrade;

    public String getName() {
        return name;
    }

    public double getFirstTrimesterGrade() {
        return firstTrimesterGrade;
    }

    public double getSecondTrimesterGrade() {
        return secondTrimesterGrade;
    }

    public double getThirdTrimesterGrade() {
        return thirdTrimesterGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstTrimesterGrade(double firstTrimesterGrade) {
        if (firstTrimesterGrade >= 0 && firstTrimesterGrade <= 30) {
            this.firstTrimesterGrade = firstTrimesterGrade;
        }
    }

    public void setSecondTrimesterGrade(double secondTrimesterGrade) {
        if (secondTrimesterGrade >= 0 && secondTrimesterGrade <= 35) {
            this.secondTrimesterGrade = secondTrimesterGrade;
        }
    }

    public void setThirdTrimesterGrade(double thirdTrimesterGrade) {
        if (thirdTrimesterGrade >= 0 && thirdTrimesterGrade <= 35) {
            this.thirdTrimesterGrade = thirdTrimesterGrade;
        }
    }

    public double finalGrade () {
        return firstTrimesterGrade + secondTrimesterGrade + thirdTrimesterGrade;
    }

    public void studentSituation() {

        System.out.printf("%n * FINAL GRANDE: %.2f%n", finalGrade());
        if (finalGrade() < 60) {
            double remainingGrade = 60 - finalGrade();
            System.out.println(" - FAILED");
            System.out.printf(" - MISSING %.2f POINTS%n", remainingGrade);
        } else {
            System.out.printf(" + PASS%n");
        }
    }

    public static void main (String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.printf("%n ----= Student Data =----%n%n");

        System.out.print("Student: ");
        String studentName = scanner.nextLine();
        student.setName(studentName);

        System.out.print("First semester grade: ");
        double studentFirstSemesterGrade = scanner.nextDouble();
        student.setFirstTrimesterGrade(studentFirstSemesterGrade);

        System.out.print("Second semester grade: ");
        double studentSecondSemesterGrade = scanner.nextDouble();
        student.setSecondTrimesterGrade(studentSecondSemesterGrade);

        System.out.print("Third semester grade: ");
        double studentThirdSemesterGrade = scanner.nextDouble();
        student.setThirdTrimesterGrade(studentThirdSemesterGrade);

        student.studentSituation();

        scanner.close();
    }
}
