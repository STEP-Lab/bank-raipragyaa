package com.step.bank;

import java.util.Date;
import java.util.Objects;

public abstract class Transaction {
    protected final float amount;
    protected final String to;
    protected Date date;

    protected Transaction(float amount, String to, Date date) {
        this.amount = amount;
        this.to = to;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction)) return false;
        Transaction that = (Transaction) o;
        return Float.compare(that.amount, amount) == 0 &&
                Objects.equals(to, that.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, to);
    }
}
