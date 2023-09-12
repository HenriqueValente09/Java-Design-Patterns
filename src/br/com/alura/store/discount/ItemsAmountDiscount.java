package br.com.alura.store.discount;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class ItemsAmountDiscount extends Discount{
    public ItemsAmountDiscount(Discount next) {
        super(next);
    }

    public BigDecimal applyCalc(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    public boolean apply(Budget budget) {
        return budget.getItemsAmount() > 5;
    }
}
