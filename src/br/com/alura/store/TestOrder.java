package br.com.alura.store;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.order.Order;
import br.com.alura.store.order.OrderGenerator;
import br.com.alura.store.order.OrderGeneratorHandler;
import br.com.alura.store.order.action.ActionAfterOrder;
import br.com.alura.store.order.action.SaveDatabase;
import br.com.alura.store.order.action.SendEmail;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TestOrder {
    public static void main(String[] args) {
        String client = args[0];
        BigDecimal budgetValue = new BigDecimal(args[1]);
        int itemsAmount = Integer.parseInt(args[2]);

        OrderGenerator generator = new OrderGenerator(client, budgetValue, itemsAmount);
        OrderGeneratorHandler handler = new OrderGeneratorHandler(Arrays.asList((ActionAfterOrder) new SendEmail(), (ActionAfterOrder) new SaveDatabase()));
        handler.execute(generator);
    }
}
