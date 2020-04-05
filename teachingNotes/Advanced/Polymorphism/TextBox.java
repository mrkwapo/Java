package com.Dracodess;

public class TextBox extends UIControl {
    private String text = ""; //Field

    @Override
    public void render() { //Encapsulating its own render method
        System.out.println("Render TextBox");
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
