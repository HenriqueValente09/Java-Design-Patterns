package br.com.alura.store.budget;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal value;
    private int itemsAmount;

    public Budget(BigDecimal value, int itemsAmount) {
        this.value = value;
        this.itemsAmount = itemsAmount;
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getItemsAmount() {
        return itemsAmount;
    }
}