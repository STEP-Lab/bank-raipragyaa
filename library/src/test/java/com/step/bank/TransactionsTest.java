package com.step.bank;

import org.junit.Test;

import java.util.Date;

import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.junit.Assert.assertThat;

public class TransactionsTest {
    @Test
    public void shouldRecordDebitTransaction(){
        Transactions transactions = new Transactions();
        transactions.debit(2000,"Ishu");
        assertThat(transactions.list,hasItem(new DebitTransaction(2000,"Ishu", new Date())));
    }
}
