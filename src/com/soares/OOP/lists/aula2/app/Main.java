package com.soares.OOP.lists.aula2.app;

import com.soares.OOP.lists.aula2.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.printf("%n----= Employee Register =----%n%n");

        System.out.print("How many employees will be registered? ");
        int amount = scanner.nextInt();

        for (int i = 0; i < amount; i++) {
            System.out.printf("%nEmployee #%d: %n", i + 1);

            System.out.print("ID: ");
            int id = scanner.nextInt();

            while (checkIdEmployee(employees, id)) {
                System.out.printf("%n- This ID has already been registered. ID: ");
                id = scanner.nextInt();
                System.out.println();
            }

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();


            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            Employee employee = new Employee(id, name, salary);
            employees.add(employee);
        }

        System.out.printf("%nEnter the employee id tha will have salary increase: ");
        int idEmployee = scanner.nextInt();
        Employee employeeIncrease = employees.stream().filter(employee -> employee.getId() == idEmployee).findFirst().orElse(null);

        if (employeeIncrease == null) {
            System.out.printf("%n- This id does not exist!!%n");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = scanner.nextDouble();
            employeeIncrease.increaseSalary(percentage);
        }

        System.out.printf("%n----= List of employees =----%n");

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        scanner.close();
    }

    public static boolean checkIdEmployee (List<Employee> employees, int id) {
        Employee filteredEmployee = employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
        return filteredEmployee != null;
    }

}
