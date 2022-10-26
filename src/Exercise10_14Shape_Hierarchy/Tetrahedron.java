package Exercise10_14Shape_Hierarchy;

public class Tetrahedron extends ThreeDimensionalShape {
    public double edge;

    public Tetrahedron(double edge) {
        this.edge = edge;
    }

    @Override
    double getArea() {
        return Math.sqrt(3) * Math.pow(edge, 2);
    }

    @Override
    double getVolume() {
        return Math.pow(edge, 3) / 6 * Math.sqrt(2);
    }

    public String toString() {
        return String.format("%s%.2f%n%s%.2f", "Total Surface Area of a Tetrahedron: ", getArea(), "Volume of a Tetrahedron: ", getVolume());
    }
}
