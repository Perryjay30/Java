package Exercise8_4;

public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calculate() {
        double volume = (radius * radius) * height;
        System.out.printf("The volume of the cylinder " + volume);
    }

    public static void main(String[] args) {
        Cylinder gas = new Cylinder(7.00, 21.00);
        gas.calculate();
    }
}
