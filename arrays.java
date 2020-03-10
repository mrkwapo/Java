package com.Dracodess;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(numbers); //gives you an address in memory such as, [I@7b23ec81

        //How you can view Arrays
        System.out.println(Arrays.toString(numbers)); //[1, 2, 0, 0, 0]

        //Better to initialize values to arrays as so:
        int[] numbers2 = {2,5,3,6,8};
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2)); // [2, 3, 5, 6, 8]
        System.out.println(numbers2.length); //5
    }
}
