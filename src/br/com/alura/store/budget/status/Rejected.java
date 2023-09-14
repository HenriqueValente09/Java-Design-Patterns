package br.com.alura.store.budget.status;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

public class Rejected extends Status{
    public void complete (Budget budget){
        budget.setStatus(new Completed());
    }

}
