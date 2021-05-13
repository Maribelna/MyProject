package com.ProjectShape3;

import java.util.ArrayList;
import java.util.List;

public class Box implements Shape {

    List<Shape> list = new ArrayList<>();
    private double maxVolume;

    public Box(double maxVolume) {
        this.maxVolume = maxVolume;
    }

    @Override
    public double getVolume() {
        return realVolume();
    }

    public boolean add(Shape shape) {
        if (maxVolume > (realVolume()+shape.getVolume())) {
            list.add(shape);
            return true;
        }
        return false;
    }

    private double realVolume(){
        double num = 0;
        for (Shape shape: list){
            num = shape.getVolume()+ num;
            return num;
        }
        return 0;
    }
}
