package com.Dracodess;

public class TextBox extends UIControl {
    private String text = ""; //Field

    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }

    @Override //lets the complier know that we will be overriding the method that matches this signature (toString)
    public String toString() {
        return text;
    }
    //Methods
    public void setText(String text){
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}
