package br.com.alura.store;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.tax.ISS;
import br.com.alura.store.tax.Tax;
import br.com.alura.store.tax.TaxCalculator;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"));
        TaxCalculator calculator = new TaxCalculator();
        System.out.println(calculator.calculate(budget, new ISS()));
    }
}
