package com.Dracodess;

public class Main {

    public static void main(String[] args) {
        //Procedural Paradigm: Main method can get cluttered with variables and procedures(methods)
        
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int wages = calculateWage(baseSalary,extraHours,hourlyRate);
        System.out.println(wages);
    }

    public static int calculateWage(
            int baseSalary,
            int extraHours,
            int hourlyRate
    ){
        return baseSalary + (extraHours * hourlyRate);
    }
}
