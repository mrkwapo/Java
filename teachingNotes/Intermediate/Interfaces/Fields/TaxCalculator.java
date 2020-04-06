package com.Dracodess;

public interface TaxCalculator {
    float minimumTax = 100; //All fields in Interfaces are Static and final (constants) so we initialize them here and can't change them in the future.
    //But you must be mindful if this value will be the same across all interfaces.
    //Because minimumTax may be different in implementations we shouldn't define it here. Instead implement something like Pi;
    double calculateTax(); //Interfaces have abstract methods. Code Block just declaration.
}
