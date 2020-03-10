package com.Dracodess;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Multi Dimensional Array with 2 rows and 3 columns
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        System.out.println(Arrays.toString(numbers)); //[[I@7b23ec81, [I@6acbcfc0]
        //How to view Multi Dimensional Arrays
        System.out.println(Arrays.deepToString(numbers)); //[[1, 0, 0], [0, 0, 0]]

        //Curly Brace Syntax
        int [][] numbers2 = {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(numbers2)); //[[1, 2, 3], [4, 5, 6]]

    }
}
