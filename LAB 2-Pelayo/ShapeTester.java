public class ShapeTester {
    public static void main(String[] args) {
        Shape[] myShapes = {
            new Circle("Red", 5),
            new Rectangle("Blue", 4, 6),
            new Square("Yellow", 4),
            new Triangle("Orange", 3, 8)
        };

        for (Shape s : myShapes) {
            System.out.println(s.getClass().getSimpleName() + 
                               " [" + s.getColor() + "] Area: " + s.getArea());
        }
    }
}