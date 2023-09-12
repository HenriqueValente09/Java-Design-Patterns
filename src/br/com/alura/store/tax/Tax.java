package br.com.alura.store.tax;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public interface Tax {
    public BigDecimal calculate(Budget budget);
}
