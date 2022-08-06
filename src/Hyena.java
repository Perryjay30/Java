import InheritanceTask.Animal;

public class Hyena extends Animal {

    String color;
    int height;

    public Hyena(String name, int hand, int age, int height, String color) {
        super(name, hand, age);
        this.color = color;
        this.height = height;
    }


    public void laugh() {
        System.out.println("Please don't be annoyed but i love laughing");
    }
    public void move() {
        System.out.println("I'm moving like a flash");
    }
}
