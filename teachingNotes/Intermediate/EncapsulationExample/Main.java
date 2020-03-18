//Encapsulation: Bundle the data and methods that operate on the data in a single unit/object
package com.Dracodess;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.baseSalary = 50_000;
        employee.hourlyRate = 20;
        int wages = employee.calculateWages(10);
        System.out.println(wages);
    }

}
