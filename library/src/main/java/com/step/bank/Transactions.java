package com.step.bank;

import java.util.ArrayList;

public class Transactions {

    protected final ArrayList<Transaction> list;

    public Transactions() {
        this.list = new ArrayList<>();
    }
    public void debit(float amount,String name){
        this.list.add(new DebitTransaction(amount,name));
    }
}
