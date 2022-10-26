package Exercise10_14Shape_Hierarchy;

public class ShapeTesting {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5);
        Cube cube = new Cube(16.3);
        Sphere sphere = new Sphere(9.7);
        Square square = new Square(8.9);
        Tetrahedron tetrahedron = new Tetrahedron(15.4);
        Triangle triangle = new Triangle(5.5, 3.9);

//        System.out.println(circle);
//        System.out.println(cube);
//        System.out.println(sphere);
//        System.out.println(square);
//        System.out.println(tetrahedron);
//        System.out.println(triangle);

        Shape [] shape = new Shape[6];
        shape[0] = circle;
        shape[1] = cube;
        shape[2] = sphere;
        shape[3] = square;
        shape[4] = tetrahedron;
        shape[5] = triangle;

        for(Shape shapes : shape) {
            System.out.println(shapes);
            System.out.println();
        }
    }
}
