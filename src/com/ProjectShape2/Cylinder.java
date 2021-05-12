package com.ProjectShape2;

public class Cylinder extends SolidOfRevolution {

    public Cylinder(double height, double radius) {
        super(Math.PI * Math.pow(radius,2) * height);
    }
}
