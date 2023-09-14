package br.com.alura.store.budget.status;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class Approved extends Status{
    public BigDecimal calculateExtraDiscountValue(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.03"));
    }

    public void complete (Budget budget){
        budget.setStatus(new Completed());
    }
}
