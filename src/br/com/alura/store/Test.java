package br.com.alura.store;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.tax.TaxType;
import br.com.alura.store.tax.TaxesCalculator;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"));
        TaxesCalculator calculator = new TaxesCalculator();
        System.out.println(calculator.calculate(budget, TaxType.ISS));
    }
}
