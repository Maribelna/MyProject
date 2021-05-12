package com.ProjectShape2;

public class Ball extends SolidOfRevolution {

    public Ball(double radius) {
        super(4/3F * Math.PI * Math.pow(radius,3));
    }


}
