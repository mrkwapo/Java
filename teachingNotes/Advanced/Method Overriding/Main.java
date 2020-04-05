package com.Dracodess;

public class Main {

    public static void main(String[] args) {
        //Overriding Annotation Demo
        var textBox = new TextBox();
        textBox.setText("Hello World");
        System.out.println(textBox.toString());//Hello World
        System.out.println(textBox);//Hello World because println automatically calls the toString method
    }
}
