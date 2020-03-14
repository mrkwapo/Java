package com.Dracodess;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        int principal = 0;

        while(true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if((principal >= 1000 && principal <= 1_000_000 ))
                break;
            System.out.println("Enter a value between 1K and 1M");
        }

        float annualInterestRate = 0F;
        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = scanner.nextFloat();
            if((annualInterestRate >= 1 && annualInterestRate <= 30))
                break;
            System.out.println("Enter a value greater than 0 or less than or equal to 30");
        }

        float monthlyInterestRate = annualInterestRate/PERCENT/MONTHS_IN_YEAR;

        byte years = 0;
        while(true) {
            System.out.print("Period (Years): ");
            years = scanner.nextByte();
            if((years >= 1 && years <= 30))
                break;
            System.out.println("Enter a value greater than 0 or less than or equal to 30");
        }
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal *(monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))/(Math.pow(1+monthlyInterestRate, numberOfPayments)-1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " + mortgageFormatted);

    }
}
