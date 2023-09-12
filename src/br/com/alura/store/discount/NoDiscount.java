package br.com.alura.store.discount;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount{

    public NoDiscount() {
        super(null);
    }

    public BigDecimal applyCalc(Budget budget) {
        return BigDecimal.ZERO;
    }

    public boolean apply(Budget budget) {
        return true;
    }
}
