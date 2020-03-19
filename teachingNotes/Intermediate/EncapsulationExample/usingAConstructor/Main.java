//Abstraction: Reduce complexity by hiding unnecessary details
/*Coupling: The level of dependency between classes.
There will always be coupling but we need to aim to reduce coupling.*/
//Encapsulation: Bundle the data and methods that operate on the data in a single unit/object
package com.Dracodess;

public class Main {

    public static void main(String[] args) {
       Employee employee = new Employee(50_000, 20);
       /*the access modifiers are private so now these methods are not available in Main
        employee.setBaseSalary(42_000); 
        employee.setHourlyRate(20);*/
        int wages = employee.calculateWages(55);
        System.out.println(wages);

    }

}
