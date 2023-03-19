package com.soares.OOP.initial_topics.aula7;

import com.soares.OOP.initial_topics.aula7.entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);
        Bank bank;

        System.out.printf("%n ----= Account data =----%n%n");

        System.out.print("Enter account number: ");
        int account = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter account holder: ");
        String holder = scanner.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char response = scanner.nextLine().charAt(0);

        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDepositValue = scanner.nextDouble();
            bank = new Bank(account, holder, initialDepositValue);
        } else {
            bank = new Bank(account, holder);
        }

        System.out.printf("%n ----= Account data =----%n%n");
        System.out.printf(" * Account %d, Holder: %s, Balance: $ %.2f%n%n",
                bank.getAccount(), bank.getHolder(), bank.getDeposit());

        System.out.print("Enter deposit value: ");
        double deposit = scanner.nextDouble();
        bank.Deposit(deposit);

        System.out.printf("%n ----= Updated account data =----%n%n");
        System.out.printf(" * Account %d, Holder: %s, Balance: $ %.2f%n%n",
                bank.getAccount(), bank.getHolder(), bank.getDeposit());

        System.out.print("Enter a withdraw value: ");
        double withdraw = scanner.nextDouble();
        bank.Withdraw(withdraw);

        System.out.printf("%n ----= Updated account data =----%n%n");
        System.out.printf(" * Account %d, Holder: %s, Balance: $ %.2f%n",
                bank.getAccount(), bank.getHolder(), bank.getDeposit());
    }


}
