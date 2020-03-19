//Encapsulation: Bundle the data and methods that operate on the data in a single unit/object
package com.Dracodess;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setBaseSalary(42000);
        employee.setHourlyRate(20);
        int wages = employee.calculateWages(55);
        System.out.println(wages);
        System.out.println("Base Salary: " + employee.getBaseSalary());
        System.out.println("Hourly Rate: " + employee.getHourlyRate());
    }

}
