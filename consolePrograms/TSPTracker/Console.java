package com.Dracodess;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Console {
    //Setting the date format
    private final static String DATE_FORMAT = "MM/dd/yyyy";
    //Instantiating Scanner Class
    private static Scanner scanner = new Scanner(System.in);

    //This method prompts user for dates
    public static String readDate(String prompt) {
        String value;
        while (true) {
            System.out.print(prompt);
            value = scanner.next();
            if(isDateValid(value))
                break;
            System.out.println("Enter a valid date (MM/dd/yyyy)");
        }
        return value;
    }

    //This method validates user input is in a valid date format
    public static boolean isDateValid(String date)
    {
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
