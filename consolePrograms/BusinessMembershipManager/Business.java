package com.Dracodess;

import java.util.List;

/**
 * Created by Nate Kwapo 3/21/2020
 */
public class Business {
    private List<Employee> employees;
    private List<Customer> customers;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;
    private String businessName;

    /**
     * This is a constructor of a new Business Object
     * @param employees list of employees in the business
     * @param customers list of customers in the business
     */
    public Business(String businessName, List<Employee> employees, List<Customer> customers) {
        this.employees = employees;
        this.customers = customers;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
        this.businessName = businessName;
    }

    /**
     *
     * @return Business' Name
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     *
     * @return list of Employees in the business
     */
    public List<Employee> getEmployees() {
        return employees;
    }

    /**
     * Adds a new employee to the Business
     * @param employee the employee to be added
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /**
     *
     * @return the list of customers
     */
    public List<Customer> getCustomers() {
        return customers;
    }

    /**
     * Adds a new customer to the business
     * @param customer the customer to be added to the business
     */
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    /**
     *
     * @return the total money earned by the business
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     *Adds to the total money earned by the business
     * @param moneyEarned money that is to be added to the total earnings of the business
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     *
     * @return the total money spent by the business
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Updates the total money spent by the business
     * which is the Employee Salary given by the Business
     * @param moneySpent
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;

    }
}
