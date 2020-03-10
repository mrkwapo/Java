package com.Dracodess;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        //This is how you Instantiate the NumberFormat Class/Factory Method
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result1 = currency.format(12258541.891);
        System.out.println(result1); // $12,258,541.89

        NumberFormat percentage = NumberFormat.getPercentInstance();
        String result2 = percentage.format(.99);
        System.out.println(result2); //99%

        //Example of method chaining
        String result3 = NumberFormat.getPercentInstance().format(.5);
        System.out.println(result3); //50%
    }
}
