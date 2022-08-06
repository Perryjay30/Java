import InheritanceTask.Animal;

public class Cheetah extends Animal {

String color;
int bones;
    public Cheetah(String name, int hand, int age, String color, int bones) {
        super(name, hand, age);
        this.color = color;
        this.bones = bones;
    }

    public void talk() {
        System.out.println("You better run when you see me coming, because amma hunt you down");
    }
    public void stealth() {
        System.out.println("A cheetah's stealth movement is badass");
    }
}
