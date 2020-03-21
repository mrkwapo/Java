package com.Dracodess;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nate Kwapo 3/21/2020
 */
public class Main {

    public static void main(String[] args) {
        Employee remi = new Employee(100,"Remi", 100_000);
        Employee marlon = new Employee(101,"Marlon", 90_000);
        Employee kona = new Employee(100,"Kona", 80_000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(remi);
        employeeList.add(marlon);
        employeeList.add(kona);

        Customer marlonjr = new Customer(100, "Marlon Jr", 1);
        Customer aaron = new Customer(100, "Aaron", 2);
        Customer tyrelljr = new Customer(100, "Tyrell Jr", 3);

        List<Customer> customerList = new ArrayList<>();
        customerList.add(marlonjr);
        customerList.add(aaron);
        customerList.add(tyrelljr);

        Business careerDevs = new Business( "CareerDevs",employeeList, customerList);
        Employee satta = new Employee(104, "Satta", 75_000);

        careerDevs.addEmployee(satta);

        marlonjr.payFees((30000));
        tyrelljr.payFees(15000);
        tyrelljr.payFees(15000);
        aaron.payFees(35000);

        /*
        System.out.println(marlonjr.getName() + " has paid a total of: $" + marlonjr.getFeesPaid());
        System.out.println(tyrelljr.getName() + " has paid a total of: $" + tyrelljr.getFeesPaid());
        System.out.println(aaron.getName() + " has paid a total of: $" + aaron.getFeesPaid()); */

        //Using the to string override method
        System.out.println(tyrelljr);
        System.out.println(aaron);
        System.out.println(marlonjr);


        System.out.println(careerDevs.getBusinessName() + " has grossed $" + careerDevs.getTotalMoneyEarned());
        System.out.println();

        System.out.println("***After" + careerDevs.getBusinessName() + " has paid Salary***");
        marlon.receiveSalary(marlon.getSalary());

        //System.out.println(marlon.getName() + " has received a salary of $" + marlon.getSalary());
        System.out.println(marlon);
        System.out.println(careerDevs.getBusinessName() + " has a profit of $" + careerDevs.getTotalMoneyEarned());
        System.out.println(employeeList);

    }
}
