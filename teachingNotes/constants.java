package com.Dracodess;

public class Main {

    public static void main(String[] args) {
       float pi = 3.14F;
       pi = 1;
       System.out.println(pi);//1

       final float pi2 = 3.14F; //the compiler will treat the variable as a constant with the "final" keyword so the value doesn't change
       System.out.println(pi2);//3.14

    }
}
