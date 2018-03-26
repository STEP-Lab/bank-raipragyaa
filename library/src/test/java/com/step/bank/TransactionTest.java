package com.step.bank;

import org.junit.Test;

import java.util.Date;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TransactionTest {
 @Test
 public void mustRecordeTransactionDate(){
     Date date = new Date();
     Transaction transaction = new DebitTransaction(1000,"Pragya", date);
    assertThat(transaction.getDate(),is(date));
 }
}
