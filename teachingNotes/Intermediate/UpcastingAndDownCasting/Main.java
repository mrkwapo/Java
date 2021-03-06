package com.Dracodess; 

public class Main {

    public static void main(String[] args) {
        var control = new UIControl(true);
        var textBox = new TextBox();
        //show(control); //com.Dracodess.UIControl@5f184fc6
        //show(textBox); //Hello World ....Upcasting this method from UIControl
        show(control);
    }

   /* because this show method is accepts the UIControl object
    we can give it an instance of the UIControl or any of its derivatives.
    However at compile time we can only work with the members of the UI Control unless we explicitly cast
    this control object a different type such as TextBox on line 25 which is called Down Casting*/
    public static void show(UIControl control){
       //to avoid a casting exception we need to make sure the control object being passed is a TextBox type:
        if (control instanceof TextBox) {
            var textBox = (TextBox)control;
            textBox.setText("Hello World");
        }
        System.out.println(control);
    }
}
