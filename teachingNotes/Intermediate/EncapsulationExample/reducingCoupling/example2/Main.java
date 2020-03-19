//Abstraction: Reduce complexity by hiding unnecessary details
/*Coupling: The level of dependency between classes.
There will always be coupling but we need to aim to reduce coupling.*/
//Encapsulation: Bundle the data and methods that operate on the data in a single unit/object
package com.Dracodess;

public class Main {

    public static void main(String[] args) {

        Browser browser = new Browser();
        /*Now the browser object only has a single method. The sendHttpRequest and findIpAddress methods are unnecessary to the Main method and
        pollute the interface of the Browser Class. Main only needs the navigate method. Therefore
        private access modifiers are used on the sendHttpRequest and findIpAddress methods*/

        browser.navigate("www.google.com");

    }

}
