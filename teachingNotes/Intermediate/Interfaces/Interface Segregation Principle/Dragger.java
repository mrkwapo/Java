package com.Dracodess;

public class Dragger {
    public void drag(UIWidget draggable){
        draggable.drag(); //when this method passes the Draggable interface it only gives access to the methods in Draggable Interface
        draggable.render(); //now that this method passes the UIWidget interface it gives access to the methods in and inherited by UIWidget Interface
        System.out.println("Dragging done!");
    }


}
