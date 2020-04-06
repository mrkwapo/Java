package com.Dracodess;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String message = greetUser("Nate", "Kwapo");
        System.out.println(message);
    }
    //Method
    public static String greetUser(String firstName, String lastName){
        return "Hello " + firstName +" " + lastName;
    }
}
