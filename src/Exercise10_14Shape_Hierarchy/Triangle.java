package Exercise10_14Shape_Hierarchy;

public class Triangle extends TwoDimensionalShape {
    private final double height;
    private final double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }
    @Override
    double getArea() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return String.format("%s%.2f", "The Area of a triangle is: ", getArea());
    }
}
