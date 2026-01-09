// File: ShapeTester.java
public class ShapeTester {
    public static void main(String[] args) {
        // Creating an array of Shape objects (Polymorphism)
        Shape[] shapes = {
            new Circle("Red", 5.0),
            new Rectangle("Blue", 4.0, 6.0),
            new Square("Yellow", 4.0),
            new Triangle("Green", 3.0, 4.0, 3.0, 5.0)
        };

        System.out.println("OOP SHAPE REPORT");
        System.out.println("================================");

        for (Shape s : shapes) {
            // getClass().getSimpleName() gets the name of the class (e.g., "Circle")
            System.out.println("Type      : " + s.getClass().getSimpleName());
            System.out.println("Color     : " + s.getColor());
            System.out.printf("Area      : %.2f\n", s.getArea());
            System.out.printf("Perimeter : %.2f\n", s.getPerimeter());
            System.out.println("--------------------------------");
        }
    }
}