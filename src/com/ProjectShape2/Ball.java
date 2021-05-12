package com.ProjectShape2;

public class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        setVolume(4 / 3F * Math.PI * Math.pow(radius, 3));
        return super.getVolume();
    }
}
