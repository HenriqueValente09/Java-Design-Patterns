package br.com.alura.store.budget.status;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class UnderAnalysis extends Status{
    public BigDecimal calculateExtraDiscountValue(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    public void approve (Budget budget){
        budget.setStatus(new Approved());
    }

    public void reject (Budget budget){
        budget.setStatus(new Rejected());
    }

    public void complete (Budget budget){
        budget.setStatus(new Completed());
    }
}
