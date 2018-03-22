package com.step.bank;

public class AccountNumber {
    private String number;

    public AccountNumber(String number) throws InvalidAccNumberException {
        validateAccountNumber(number);
        this.number = number;
    }

    private void validateAccountNumber(String number) throws InvalidAccNumberException {
        if(!number.matches("\\d{4}-\\d{4}")){
            throw  new InvalidAccNumberException();
        }
    }
}
