package com.Dracodess;

public class Main {

    //Demonstration of method injection by passing/or injecting the dependency through the method
    public static void main(String[] args) {
        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport();
        report.show(calculator); //40000.0

        report.show(new TaxCalculator2019()); //0.0
    }
}
