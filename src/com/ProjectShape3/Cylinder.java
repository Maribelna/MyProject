package com.ProjectShape3;

public class Cylinder extends SolidOfRevolution{
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(getRadius(),2) * height;
    }

    @Override
    double getRadius() {
        return inputFromConsole();
    }
}
