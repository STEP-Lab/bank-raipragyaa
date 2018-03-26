package com.step.bank;

import java.util.Date;

public class CreditTransaction extends Transaction {

    protected CreditTransaction(float amount, String to, Date date) {
        super(amount, to, date);
    }

    public CreditTransaction(float amount, String to) {
        this(amount,to,new Date());
    }
}

