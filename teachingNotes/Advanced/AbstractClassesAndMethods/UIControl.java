package com.Dracodess;

 public abstract class UIControl {
    protected boolean isEnabled = true;

 public abstract void render();

    public void enable(){
        isEnabled = true;
    }

    public void disable(){
        isEnabled = false;
    }

    public boolean isEnabled(){
        return isEnabled;
    }
}
