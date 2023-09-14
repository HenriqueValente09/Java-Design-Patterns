package br.com.alura.store.order;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderGenerator {
    private String client;
    private BigDecimal budgetValue;
    private int itemsAmount;

    public OrderGenerator(String client, BigDecimal budgetValue, int itemsAmount) {
        this.client = client;
        this.budgetValue = budgetValue;
        this.itemsAmount = itemsAmount;
    }

    public void execute () {
        Budget budget = new Budget(this.budgetValue, this.itemsAmount);
        String client = this.client;

        Order order = new Order(client, LocalDateTime.now(), budget);
    }
}
