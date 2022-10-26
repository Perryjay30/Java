package Exercise10_14Shape_Hierarchy;

public class Circle extends TwoDimensionalShape {
    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    @Override
    double getArea() {
        return (Math.PI * diameter * diameter) / 4;
    }

    public String toString() {
        return String.format("%s%.2f", "The Area of Circle is: ", getArea());
    }
}
