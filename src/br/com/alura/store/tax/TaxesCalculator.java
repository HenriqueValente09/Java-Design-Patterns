package br.com.alura.store.tax;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class TaxesCalculator {
    public BigDecimal calculate(Budget budget, TaxType taxType) {
        switch (taxType) {
            case ICMS:
                return budget.getValue().multiply(new BigDecimal("0.1"));
            case ISS:
                return budget.getValue().multiply(new BigDecimal("0.06"));
            default:
                return BigDecimal.ZERO;
        }
    }
}
