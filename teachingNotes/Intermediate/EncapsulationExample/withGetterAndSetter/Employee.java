package com.Dracodess;
//Encapsulation: Bundle the data and methods that operate on the data in a single unit/object
public class Employee {

    // public access modifier makes these properties accessible in the main class
    //public int baseSalary;
    //public int hourlyRate;

    /*private access modifiers restrict access from main method and properties can only
    be set and read using Getter and Setter Methods */
    private int baseSalary;
    private int hourlyRate;

    //Methods
    public int calculateWages(int extraHours){
        return baseSalary + (getHourlyRate() * extraHours);
    }

    //Getter and Setter Methods
    //Using a method to handle validation and set the private field/property baseSalary
    public void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }

    //Using a method to get the value of baseSalary from the Main method
    public int getBaseSalary(){
        return baseSalary;
    }

    //Using a method to handle validation and set the private field/property hourlyRate
    public void setHourlyRate(int hourlyRate){
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate cannot be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    //Using a method to get the value of hourlyRate from the Main method
    public int getHourlyRate(){
        return hourlyRate;
    }

}
