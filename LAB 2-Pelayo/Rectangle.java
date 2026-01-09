public class Rectangle extends Shape {
    protected double width, height; // 'protected' so Square can see them

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() { return width * height; }
}