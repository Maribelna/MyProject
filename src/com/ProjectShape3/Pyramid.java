package com.ProjectShape3;

public class Pyramid implements Shape {

    private final double s;
    private final double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return (1/3F) * s * h;
    }
}
