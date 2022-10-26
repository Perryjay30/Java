package Exercise10_14Shape_Hierarchy;

public class Cube extends ThreeDimensionalShape {

    public double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return String.format("%s%.2f%n%s%.2f", "Surface Area of a cube is: ", getArea(), "Volume of a Cube is: ", getVolume());
    }
}
