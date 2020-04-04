package com.Dracodess;

//Demonstrating how to inherit from a parent that has an argument in the constructor
public class TextBox extends UIControl {
    private String text = ""; //Field

    public TextBox() {
        super(true); //Have to use the super keyword to set the boolean value for isEnabled arguement inherited from the UIControl constructor
        System.out.println("TextBox");
    }

    //Methods
    public void setText(String text){
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}
