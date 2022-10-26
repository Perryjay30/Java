package Exercise10_14Shape_Hierarchy;

public class Square extends TwoDimensionalShape {

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return String.format("%s%.2f", "The area of the Square is: ", getArea());
    }
}
