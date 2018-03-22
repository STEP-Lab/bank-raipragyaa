package com.step.bank;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AccountNumberTest {

    @Test(expected = InvalidAccNumberException.class)
    public void mustThrowExceptionForInvalidAccNo() throws InvalidAccNumberException {
        AccountNumber accountNumber = new AccountNumber("1234-qabj");
    }

    @Test(expected = InvalidAccNumberException.class)
    public void mustThrowExceptionForInvalidAccNoPattern() throws InvalidAccNumberException {
        AccountNumber accountNumber = new AccountNumber("1234");
    }
}
