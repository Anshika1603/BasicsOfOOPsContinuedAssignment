package com.knoldus.Question9;

abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Draw a Circle");
    }
}

class Rectangle extends Shape {
    public void draw() {
        System.out.println("Draw a Rectangle");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("Draw a Triangle");
    }
}

public class ShapeImplementation{
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        circle.draw();
        rectangle.draw();
        triangle.draw();

    }
}

