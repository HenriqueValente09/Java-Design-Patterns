package br.com.alura.store.discount;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class BudgetDiscount extends Discount{
    public BudgetDiscount(Discount next) {
        super(next);
    }

    public BigDecimal applyCalc(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.06"));
    }

    public boolean apply(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("500")) > 0;
    }
}
