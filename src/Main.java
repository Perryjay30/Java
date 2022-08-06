import InheritanceTask.Animal;

public class Main {

    public static void main(String[] args) {
        Cheetah pepsy = new Cheetah("sam", 4, 14,"White and Black",114);
        pepsy.talk();
        pepsy.stealth();
        pepsy.run();

        Hyena winrar = new Hyena("tom", 4,20,9,"black");
        winrar.laugh();
        winrar.move();
        winrar.run();

        Lion buabu = new Lion("Jack Lions", 4,90,2, "Lions", 1);
        buabu.talk();
        buabu.eat();
        buabu.run();
    }
}
