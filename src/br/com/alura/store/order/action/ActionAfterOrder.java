package br.com.alura.store.order.action;

import br.com.alura.store.order.Order;

public interface ActionAfterOrder {
    public void execute (Order order);
}
