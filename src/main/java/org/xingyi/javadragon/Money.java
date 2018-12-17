package org.xingyi.javadragon;

import java.util.Objects;

class Money {
    int amount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    public Money(int amount) {
        this.amount = amount;
    }

}
