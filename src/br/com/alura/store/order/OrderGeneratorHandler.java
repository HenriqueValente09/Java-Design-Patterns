package br.com.alura.store.order;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.order.action.ActionAfterOrder;

import java.time.LocalDateTime;
import java.util.List;

public class OrderGeneratorHandler {

    private List<ActionAfterOrder> actions;

    public OrderGeneratorHandler(List<ActionAfterOrder> actions) {
        this.actions = actions;
    }

    public void execute (OrderGenerator data) {
        Budget budget = new Budget(data.getBudgetValue(), data.getItemsAmount());
        String client = data.getClient();

        Order order = new Order(client, LocalDateTime.now(), budget);

        actions.forEach(a -> a.execute(order));
    }
}
