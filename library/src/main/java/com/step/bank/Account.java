package com.step.bank;

public class Account {
    private final String accNumber;
    private final int balance;

    public Account(String accNumber, int balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccNumber() {
        return accNumber;
    }
}
