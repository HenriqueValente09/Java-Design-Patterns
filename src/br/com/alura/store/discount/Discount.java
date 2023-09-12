package br.com.alura.store.discount;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public abstract class Discount {
    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    public BigDecimal calculate(Budget budget){
        if(apply(budget)){
            return applyCalc(budget);
        }

        return next.calculate(budget);
    }

    protected abstract BigDecimal applyCalc(Budget budget);
    public abstract boolean apply(Budget budget);
}
