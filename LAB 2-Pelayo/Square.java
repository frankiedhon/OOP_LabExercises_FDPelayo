public class Square extends Rectangle {
    public Square(String color, double side) {
        // A square is a rectangle with the same width and height
        super(color, side, side);
    }
}