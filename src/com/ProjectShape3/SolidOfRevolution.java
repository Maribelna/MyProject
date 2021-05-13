package com.ProjectShape3;

import java.util.Scanner;

public abstract class SolidOfRevolution implements Shape{
    abstract double getRadius();

    public double inputFromConsole (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите величину");
        return scanner.nextDouble();
    }
}
