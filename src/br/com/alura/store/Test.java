package br.com.alura.store;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.discount.DiscountsCalculator;
import br.com.alura.store.tax.ISS;
import br.com.alura.store.tax.Tax;
import br.com.alura.store.tax.TaxCalculator;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("501"), 7);
        TaxCalculator calculator = new TaxCalculator();
        DiscountsCalculator discount = new DiscountsCalculator();
        System.out.println(discount.calculate(budget));
        //System.out.println(calculator.calculate(budget, new ISS()));
    }
}
