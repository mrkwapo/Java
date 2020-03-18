package com.Dracodess;
//Encapsulation: Bundle the data and methods that operate on the data in a single unit/object
public class Employee {

    public int baseSalary;
    public int hourlyRate ;
    //public int extraHours; //in case extra hours changes often we dont initialize it here. instead we pass it in the method

    //Methods
    public int calculateWages(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }

}
