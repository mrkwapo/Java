package com.Dracodess;

public class Main {

    //Demonstration of method injection by passing/or injecting the dependency through the method
    public static void main(String[] args) {

    }

    public void doSomething(TaxCalculator calculator){
        //TaxCalculator.minimumTax; //because the value might change it us not good practice to use fields in interfaces
    }
}
