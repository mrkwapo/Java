//Abstraction: Reduce complexity by hiding unnecessary details
/*Coupling: The level of dependency between classes.
There will always be coupling but we need to aim to reduce coupling.*/
//Encapsulation: Bundle the data and methods that operate on the data in a single unit/object
package com.Dracodess;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setBaseSalary(42000);
        employee.setHourlyRate(20);
        int wages = employee.calculateWages(55);
        System.out.println(wages);

        /*Using the private access modifiers on the Getters in the Employee Class, reduces the
        number of methods exposed outside the Employee class and reduces coupling in the future
        System.out.println("Base Salary: " + employee.getBaseSalary()); //Cannot be used now
        System.out.println("Hourly Rate: " + employee.getHourlyRate()); //Cannot be used now
        */
    }

}
