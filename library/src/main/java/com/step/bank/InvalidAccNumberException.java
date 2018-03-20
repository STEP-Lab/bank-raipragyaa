package com.step.bank;

public class InvalidAccNumberException extends Throwable {
    public InvalidAccNumberException() {
        super("Invalid Account Number");
    }
}
