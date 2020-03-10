package com.Dracodess;

public class Main {

    public static void main(String[] args) {
        int result1 = Math.round(1.5F);
        System.out.println(result1); //2

        int result2a = (int)Math.ceil(1.1F);
        System.out.println(result2a); //2

        double result2b = Math.ceil(1.1F);
        System.out.println(result2b); //2.0

        double result3 = Math.floor(1.9F);
        System.out.println(result3); //1.0

        int result4 = Math.max(2,3);
        System.out.println(result4); //3

        double result5a = Math.random(); //random method returns a double
        System.out.println(result5a); // ex: 0.5598677835149376

        double result5b = Math.random() * 100; //random method returns a double between 0 and 100
        System.out.println(result5b); // ex: 64.38236219349835

        double result5c = Math.round(Math.random() * 100); //random method returns a rounded double between 0 and 100
        System.out.println(result5c); // ex: 51.0

        int result5d = (int)Math.round(Math.random() * 100); //random method returns an integer between 0 and 100
        System.out.println(result5d); // ex: 85

        int result5e = (int)Math.random() * 100; // returns 0 * 100 = 0
        System.out.println(result5e); //0

        int result5f = (int)(Math.random() * 100); //random method returns an integer between 0 and 100
        System.out.println(result5f); // ex: 5

    }
}
