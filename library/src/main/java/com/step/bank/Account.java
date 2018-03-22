package com.step.bank;

public class Account {
    private final AccountNumber accNumber;
    private double balance;

    public Account(AccountNumber accNumber, double balance) throws MinimumBalanceException {
        this.accNumber = accNumber;

        validateMinBalance(balance,"Balance is Insufficient to open account");
        this.balance = balance;
    }

    private void validateMinBalance(double balance, String s) throws MinimumBalanceException {
        if (balance < 1000){
            throw new MinimumBalanceException(s);
        }
    }

    public double getBalance() {
        return balance;
    }


    public double debit(int amount) throws MinimumBalanceException {
        validateMinBalance(balance-amount, "Given amount can not be debited because of insufficient balance");
        balance -= amount;
        return balance;
    }

    public double credit(int amount) {
        balance += amount;
        return balance;
    }
}
