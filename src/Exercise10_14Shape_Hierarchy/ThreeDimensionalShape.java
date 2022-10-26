package Exercise10_14Shape_Hierarchy;

public abstract class ThreeDimensionalShape implements Shape {
    abstract double getArea();

    abstract double getVolume();

    public String toString() {
        return "The Area Surface: " + getArea() + "\n" +
                "Total Volume: " + getVolume();
    }

}
