package com.step.bank;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.assertThat;

public class TransactionsTest {

    private Transactions transactions;

    @Before
    public void setUp() throws Exception {
        transactions = new Transactions();
    }

    @Test
    public void shouldRecordDebitTransaction(){
        transactions.debit(2000,"Ishu");
        assertThat(transactions.list,hasItem(new DebitTransaction(2000,"Ishu", new Date())));
    }

    @Test
    public void shouldRecordCreditTransaction() {
     transactions.credit(4000,"Pragya");
     assertThat(transactions.list,hasItem(new CreditTransaction(4000,"Pragya")));
    }

    @Test
    public void mustRecordDebitAndCreditTransaction() {
        transactions.credit(3000,"Pragya");
        transactions.debit(2000,"Ravinder");
        assertThat(transactions.list,hasItems(new CreditTransaction(3000,"Pragya"),new DebitTransaction(2000,"Ravinder")));
    }
}
