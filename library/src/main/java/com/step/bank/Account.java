package com.step.bank;

public class Account {
    private final String accNumber;
    private double balance;

    public Account(String accNumber, double balance) throws MinimumBalanceException,InvalidAccNumberException {
        if(!accNumber.matches("\\d{4}-\\d{4}")){
            throw  new InvalidAccNumberException();
        }
        this.accNumber = accNumber;
        validateMinBalance(balance);
        this.balance = balance;
    }

    private void validateMinBalance(double balance) throws MinimumBalanceException {
        if (balance < 1000){
            throw new MinimumBalanceException();
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public double debit(int amount) throws MinimumBalanceException {
        validateMinBalance(balance-amount);
        balance -= amount;
        return balance;
    }
}
