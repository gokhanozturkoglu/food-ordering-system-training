package com.food.ordering.system.valueobject;

import java.math.BigDecimal;

public class Money {

    public static final Money ZERO = new Money(BigDecimal.ZERO);

    private final BigDecimal amount;

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public boolean isGreaterThanZero() {
        return amount != null && amount.compareTo(BigDecimal.ZERO) > 0;
    }

    public boolean isGreaterThan(Money money) {
        return this.amount != null && this.amount.compareTo(money.amount) > 0;
    }

    public Money add(Money money) {
        return new Money(this.amount.add(money.amount));
    }

    public Money substract(Money money) {
        return new Money(this.amount.subtract(money.amount));
    }

    public Money multiply(int multiplier) {
        return new Money(this.amount.multiply(BigDecimal.valueOf(multiplier)));
    }

    private BigDecimal setScale(BigDecimal input) {
        return input.setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }




}
