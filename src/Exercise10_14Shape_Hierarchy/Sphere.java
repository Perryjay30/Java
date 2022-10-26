package Exercise10_14Shape_Hierarchy;

public class Sphere extends ThreeDimensionalShape {

    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    double getVolume() {
        return 4 * Math.PI * Math.pow(radius, 3);
    }

    public String toString() {
        return String.format("%s%.2f%n%s%.2f", "Surface Area of a Sphere: ", getArea(), "Total Volume of a Sphere: ", getVolume());
    }
}
