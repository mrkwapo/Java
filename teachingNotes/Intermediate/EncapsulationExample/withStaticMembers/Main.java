/*Static Members: Instance members belong to instances/objects while Static members belong to a class.
Example:
Exployee.numberOfEmployees //The static member numberOfEmployees should not be used in new instances of an Employee
and should only exist once, within a class. */
//Abstraction: Reduce complexity by hiding unnecessary details
/*Coupling: The level of dependency between classes.
There will always be coupling but we need to aim to reduce coupling.*/
//Encapsulation: Bundle the data and methods that operate on the data in a single unit/object
package com.Dracodess;

public class Main {

    public static void main(String[] args) {
        /*Now that we have overloaded the constructor, we can create an Employee object w/ 2 arguments
         or another employee object w/ only 1 argument*/

       Employee employee1 = new Employee(55_000, 20);
       Employee employee2 = new Employee(50_000);
        //employee.setBaseSalary(42_000);
        //employee.setHourlyRate(20);

        //System.out.println("Number of Employees: "+ Employee.numberOfEmployees); //accessing static property
        Employee.printNumberOfEmployees(); //using static method to get value of a property

        //now that the calculateWages method has been overloaded we can call it with or without parameters
        int wages1 = employee1.calculateWages();
        System.out.println("Employee 1 Wages: " + wages1);

        int wages2 = employee2.calculateWages();
        System.out.println("Employee 2 Wages: " + wages2);

    }

}
