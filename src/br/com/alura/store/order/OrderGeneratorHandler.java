package br.com.alura.store.order;

import br.com.alura.store.budget.Budget;

import java.time.LocalDateTime;

public class OrderGeneratorHandler {

    public void execute (OrderGenerator data) {
        Budget budget = new Budget(data.getBudgetValue(), data.getItemsAmount());
        String client = data.getClient();

        Order order = new Order(client, LocalDateTime.now(), budget);
    }
}
