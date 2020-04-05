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
        var point1 = new Point(1,2);
        var point2 = new Point(1,2);

        System.out.println(point1 == point2); //false because they are refernce types that point to addresses
        System.out.println(point1.equals(point2)); //false before using override method we still so we will need to override the eauals method in Point Class
        System.out.println(point1.equals(point2)); //true after using override method

        // Because we overrode the hashCode method this contrasts the original hashcode method.
        System.out.println(point1.hashCode());//994
        System.out.println(point2.hashCode());//994
    }
}
