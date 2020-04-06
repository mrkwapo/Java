package com.Dracodess;

public class Main {

    public static void main(String[] args) {
        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport(calculator);
        report.show(); //40000.0

        report.setCalculator(new TaxCalculator2019());
        report.show(); //0.0
    }
}
