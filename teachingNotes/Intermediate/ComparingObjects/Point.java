package com.Dracodess;  


import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) //proper way to override the equals method
            return true;

/*       //To avoid a casting exception we have to verify the obj is an instance of Point
        if (obj instanceof Point){
            var other = (Point)obj;
            return other.x == x && other.y == y;
        }
        return false;*/

        //to simplify the statement above we reversing the condition statement
        if(!(obj instanceof Point))
            return false;

        var other = (Point) obj;
        return other.x == x && other.y == y;

    }

    //whenever you override a method you should always override the hashcode too
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
