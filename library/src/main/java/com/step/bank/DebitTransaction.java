package com.step.bank;

import java.util.Date;

public class DebitTransaction extends Transaction{
    public DebitTransaction(float amount, String to) {
        this(amount, to, new Date());
    }

    protected DebitTransaction(float amount, String to, Date date) {
        super(amount, to, date);
    }

}
