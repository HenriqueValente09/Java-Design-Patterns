package br.com.alura.store.discount;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountsCalculator {
    public BigDecimal calculate(Budget budget){
        if (budget.getItemsAmount() > 5) {
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }

        return BigDecimal.ZERO;
    }
}