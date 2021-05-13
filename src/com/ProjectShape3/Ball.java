package com.ProjectShape3;

import java.util.Scanner;

public class Ball extends SolidOfRevolution{
    @Override
    public double getVolume() {
        return 4 / 3F * Math.PI * Math.pow(getRadius(), 3);
    }

    @Override
    double getRadius() {
        return inputFromConsole();
    }
}
