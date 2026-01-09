import java.util.*;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    private double radius;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    public double getArea() { return Math.PI * radius * radius; }
    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; }
}

class Rectangle extends Shape {
    protected double width, height;
    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() { return width * height; }
    @Override
    public double getPerimeter() { return 2 * (width + height); }
}

class Square extends Rectangle {
    public Square(String color, double side) {
        super(color, side, side);
    }
}

class Triangle extends Shape {
    private double base, height, sideA, sideC;
    public Triangle(String color, double base, double height, double sideA, double sideC) {
        super(color);
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideC = sideC;
    }
    @Override
    public double getArea() { return 0.5 * base * height; }
    @Override
    public double getPerimeter() { return sideA + base + sideC; }
}