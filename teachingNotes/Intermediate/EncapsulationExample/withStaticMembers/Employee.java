//Abstraction: Reduce complexity by hiding unnecessary details
/*Coupling: The level of dependency between classes.
There will always be coupling but we need to aim to reduce coupling.*/
//Encapsulation: Bundle the data and methods that operate on the data in a single unit/object
package com.Dracodess;

public class Employee {

    // public access modifier makes these properties accessible in the main class
    //public int baseSalary;
    //public int hourlyRate;

    /*private access modifiers restrict access from main method and properties can only
    be set and read using Getter and Setter Methods */
    private int baseSalary;
    private int hourlyRate;

    //Static property
    public static int numberOfEmployees;

    //CONSTRUCTOR: Used to initialize our objects
    public Employee(int baseSalary){
       /* setBaseSalary(baseSalary);
        setHourlyRate(0);*/
        /* The this keyword is referring to the Employee Constructor w/ baseSalary and hourlyRate parameters
         to reuse the logic in that method*/
       this(baseSalary, 0);
    }
    //Constructor Overloading
    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    //METHODS

    /*Static Method
    Note: Can only see other static methods.
    You will need to create a new object to access the non static methods*/
    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);

    }

    public int calculateWages(int extraHours){
        return baseSalary + (getHourlyRate() * extraHours);
    }

    /*Method Overloading: Creating different implementations  of a method w/ different parameters
    Because you cant initialize a default value in Java like Python, we have to use Method overloading.
    Be aware of method overloading but don't over use it*/
    public int calculateWages(){
        //return baseSalary;
        return calculateWages(0); //Overloaded the calculateWages Method
    }

    //Getter and Setter Methods
    //Using a method to handle validation and set the private field/property baseSalary
    //Now that we have an Employee constructor using setBaseSalary we can set the access modifier to private
    private void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }

    //Using a method to get the value of baseSalary from the Main method
    /*Setting the access modifier to private is practicing abstraction/hiding unnecessary details
    and reducing coupling/dependency between classes*/
    private int getBaseSalary(){
        return baseSalary;
    }

    //Using a method to handle validation and set the private field/property hourlyRate
    //Now that we have an Employee constructor using setHourlyRate we can set the access modifier to private
    private void setHourlyRate(int hourlyRate){
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly Rate cannot be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    //Using a method to get the value of hourlyRate from the Main method
    /*Setting the access modifier to private is practicing abstraction/hiding unnecessary details
    and reducing coupling/dependency between classes*/
    private int getHourlyRate(){
        return hourlyRate;
    }

}
