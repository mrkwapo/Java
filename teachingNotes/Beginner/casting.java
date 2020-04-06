package com.Dracodess;

public class Main {

    public static void main(String[] args) {
        //Implicit Casting : happens automatically when there is no chance of data loss
        //byte < short < int < long < float < double
        short x = 1;
        int y = x + 2;
        System.out.println(y); // 1 + 2 = 3

        double a = 1.1;
        double b = a + 2;
        System.out.println(b); //2.0 + 1.1 = 3.1

        short c = 1;
        float d = c + 2.0F;
        System.out.println(d);//1.0 + 2.0 = 3.0

        //Explicit Casting : Can only happen with compatible types
        double e = 1.9;
        int f = (int)e + 2;
        System.out.println(f); // 1 + 2 = 3

        //Casting with Incompatible types: Using wrapper Classes
        String g = "2";
        int h = Integer.parseInt(g) + 2;
        System.out.println(h); //2 + 2 = 4

        double i = Double.parseDouble(g) + 1.1;
        System.out.println(i); //2.0 + 1.1 = 3.1
    }
}
