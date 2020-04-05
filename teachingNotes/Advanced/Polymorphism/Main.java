package com.Dracodess;

public class Main {

    public static void main(String[] args) {
        UIControl[] controls = {new TextBox(), new CheckBox()};
        for (var control : controls)
            control.render(); //outputs: Render TextBox
                                        //Render CheckBox
    }
}
