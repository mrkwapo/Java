//Abstraction: Reduce complexity by hiding unnecessary details
/*Coupling: The level of dependency between classes.
There will always be coupling but we need to aim to reduce coupling.*/
//Encapsulation: Bundle the data and methods that operate on the data in a single unit/object
package com.Dracodess;

public class Main {

    public static void main(String[] args) {
       Employee employee = new Employee(50_000, 20);
        //employee.setBaseSalary(42_000);
        //employee.setHourlyRate(20);

        //now that the calculateWages method has been overloaded we can call it with or without parameters
        int wages = employee.calculateWages();
        System.out.println(wages);

    }

}
