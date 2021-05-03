package com.ProjectShape;

public class Pyramid extends Shape{

    private double s;
    private double h;

    public Pyramid(double s, double h) {
        super((1/3) * s * h);
    }
}
