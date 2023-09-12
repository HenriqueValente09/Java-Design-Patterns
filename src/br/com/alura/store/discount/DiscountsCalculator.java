package br.com.alura.store.discount;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountsCalculator {
    public BigDecimal calculate(Budget budget){
        Discount discount = new ItemsAmountDiscount(new BudgetDiscount(new NoDiscount()));

        return discount.calculate(budget);
    }
}
