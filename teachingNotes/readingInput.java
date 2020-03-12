package com.Dracodess;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Reading Input
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Age: "); //Age: 35
        byte age = scanner1.nextByte();
        System.out.println("You are " + age +  " years old."); // You are 35 years old. 

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Full Name: ");
        String name = scanner2.nextLine().trim();
        System.out.println("Your full name is " + name ); //Your full name is Nate Kwapo

    }
}
