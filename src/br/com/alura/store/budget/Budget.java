package br.com.alura.store.budget;

import br.com.alura.store.budget.status.Status;
import br.com.alura.store.budget.status.UnderAnalysis;

import java.math.BigDecimal;

public class Budget {
    private BigDecimal value;
    private int itemsAmount;
    private Status status;

    public Budget(BigDecimal value, int itemsAmount) {
        this.value = value;
        this.itemsAmount = itemsAmount;
        this.status = new UnderAnalysis();
    }

    public void applyExtraDiscount() {
        BigDecimal extraDiscountValue = this.status.calculateExtraDiscountValue(this);

        this.value = this.value.subtract(extraDiscountValue);
    }

    public void approve (){
        this.status.approve(this);
    }

    public void reject (){
        this.status.reject(this);
    }

    public void complete (){
        this.status.complete(this);
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getItemsAmount() {
        return itemsAmount;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}