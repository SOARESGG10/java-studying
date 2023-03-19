package com.soares.OOP.initial_topics.aula7.entities;

public class Bank {

    private final int account;
    private String holder;
    private double deposit;

    public Bank(int account, String holder, double deposit) {
        this.account = account;
        this.holder = holder;
        this.Deposit(deposit);
    }
    public Bank(int ACCOUNT, String holder) {
        this.account = ACCOUNT;
        this.holder = holder;
    }

    public int getAccount() {
        return account;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getDeposit() {
        return deposit;
    }

    public void Deposit (double value) {
        this.deposit += value;
    }

    public void Withdraw (double value) {
        final double FEE = 5.0;
        this.deposit -= value + FEE;
    }

}
