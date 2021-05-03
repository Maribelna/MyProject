package com.ProjectShape;

public class Ball extends SolidOfRevolution {

    public Ball(double radius) {
        super(4/3 * Math.PI * Math.pow(radius,3));
    }
}
