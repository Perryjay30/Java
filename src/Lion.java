import InheritanceTask.Animal;

public class Lion extends Animal {

    int eyes;
    String firstName;
    int nose;

    public Lion(String name, int hand, int age, int eyes, String firstName, int nose) {
        super(name, hand, age);
        this.eyes = eyes;
        this.firstName = firstName;
        this.nose = nose;
    }


    public void talk() {
        System.out.println("I'm the king of the jungle. show me some fucking respect");
    }
    public void eat() {
        System.out.println("I love eating, I eat anything and everything raw!!");
    }


}
