package com.Dracodess;

public class TaxReport {
    private TaxCalculator calculator;

    public void show(TaxCalculator calculator) {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
