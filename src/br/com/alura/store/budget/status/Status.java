package br.com.alura.store.budget.status;

import br.com.alura.store.StatusException;
import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public abstract class Status {

    public BigDecimal calculateExtraDiscountValue(Budget budget){
        return BigDecimal.ZERO;
    }

    public void approve (Budget budget){
        throw new StatusException("The budget couldn't be approved!");
    }

    public void reject (Budget budget){
        throw new StatusException("The budget couldn't be rejected!");
    }

    public void complete (Budget budget){
        throw new StatusException("The budget couldn't be completed!");
    }
}
