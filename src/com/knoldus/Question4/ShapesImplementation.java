package com.knoldus.Question4;
import java.util.Scanner;

import static java.lang.Math.PI;

class Shape {
    public double area() {
        return 0;
    }
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

public class ShapesImplementation {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Area of shape: " + shape.area());

        Circle circle = new Circle(10);
        System.out.println("Area of circle: " + circle.area());

        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Area of rectangle: " + rectangle.area());
    }
}
