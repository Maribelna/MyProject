package com.ProjectShape2;

public class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        setVolume(Math.PI * Math.pow(radius,2) * height);
        return super.getVolume();
    }
}
