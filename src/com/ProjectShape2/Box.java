package com.ProjectShape2;

import java.util.ArrayList;
import java.util.List;

public class Box extends Shape {

    private final List<Shape> list = new ArrayList<>();
    private float maxVolume;

    public Box(float maxVolume) {
        super(0);
        this.maxVolume = maxVolume;
    }

    public boolean add(Shape shape){
        if (maxVolume > (getVolume()+shape.getVolume())) {
            list.add(shape);
            setVolume(getVolume()+shape.getVolume());
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Ball ball = new Ball(2);
        double das = ball.getVolume();
        Box box = new Box(30);
        box.add(ball);
        Cylinder cylinder = new Cylinder(1,2);
        box.add(cylinder);

    }

}
