package com.ProjectShape2;

public class Pyramid extends Shape {

    private double s;
    private double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    public double getVolume() {
        setVolume((1/3F) * s * h);
        return super.getVolume();
    }
}
