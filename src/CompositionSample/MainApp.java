package CompositionSample;

public class MainApp {
    public static void main(String[] args) {
        Person person = new Person("Kay", 19);
        System.out.println(person);
        Address address = new Address();
        address.setCity("Abuja");
        person.setAddress(address);
        System.out.println(person);
    }
}
