package com.Dracodess;

public class Main {

    public static void main(String[] args) {
        String message = "Hello World" + "!!";

        System.out.println(message.startsWith("!!")); //false
        System.out.println(message.endsWith("!!")); //true
        System.out.println(message.length()); //13
        System.out.println(message.indexOf('W')); //6
        System.out.println(message.replace('!', '*')); //Hello World**  *.replace does not modify the original string
        System.out.println( message.toLowerCase()); //hello world!!

        String message2 = "   Hello \"World\"" + "!!   ";
        System.out.println(message2.trim()); //Hello "World"!!
        System.out.println(message2); //   Hello World!!
    }
}
