package br.com.alura.store.budget;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal value;
    private int itemsAmount;
    private String status;

    public Budget(BigDecimal value, int itemsAmount) {
        this.value = value;
        this.itemsAmount = itemsAmount;
    }

    public void applyExtraDiscount() {
        BigDecimal extraDiscountValue = null;
        if (status.equals("UNDER_ANALYSIS")) {
            extraDiscountValue = new BigDecimal("0.05");
        } else if (status.equals("APPROVED")) {
            extraDiscountValue = new BigDecimal("0.02");
        }

        this.value = this.value.subtract(extraDiscountValue);
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getItemsAmount() {
        return itemsAmount;
    }
}