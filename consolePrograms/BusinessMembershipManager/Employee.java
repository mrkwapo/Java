package com.Dracodess;

/**
 * Created by Nate Kwapo 3/21/2020
 * This Class is reasponsible for keeping track
 * of an Employee's name id and salary.
 */
public class Employee {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new Employee onject
     * @param id Employee's id
     * @param name Employee's name
     * @param salary Employee's Salary
     */
    public Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     *
     * @return the Employee ID
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return the Employee's Name
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return the Employee's Salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Used to set or update an Employee's sSalary
     * @param salary Employee's salary
     */
    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     * Adds to Salary Earned
     * Removes from total money earned by Business
     * @param salary salary of Employee
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        Business.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Employee: " + name
                + "\nSalary Paid: $" + salaryEarned;
    }
}
