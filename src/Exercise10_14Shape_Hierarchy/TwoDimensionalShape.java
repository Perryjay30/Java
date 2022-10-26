package Exercise10_14Shape_Hierarchy;

public abstract class TwoDimensionalShape implements Shape {
    abstract double getArea();

    @Override
    public String toString() {
        return "The get area surface is: " + getArea();
    }
}
