package com.Dracodess;

public class Main {

    public static void main(String[] args) {
        int result1 = 10/3;
        System.out.println(result1);//3 because the division of a whole number gives you a whole number

        double result2 = 10/3;
        System.out.println(result2);//3.0

        double result3 = (double)10/(double)3;
        System.out.println(result3);//3.3333333333333335

        /* int x = 1;
        int y = x++;
        System.out.println(x);//2
        System.out.println(y);//1 */

        /*int x = 1;
        int y = ++x;
        System.out.println(x);//2
        System.out.println(y);//2 */

        //Other ways to increment
        int x = 1;
        x = x + 2; //3
        x += 2; //3

        //Augmented/Compound Operators
        x += 2;
        x /= 2;
        x -= 2;
        x *= 2;
    }
}
