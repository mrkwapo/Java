//Primitive Types vs Reference Types
package com.Dracodess;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        //Primitive Types store actual values
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y); //1

        //Reference Types below are not independent of each other because they point to the same address in memory
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2.x); //2
        System.out.println(point2);//java.awt.Point[x=2,y=1]
    }
}
