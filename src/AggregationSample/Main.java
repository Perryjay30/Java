package AggregationSample;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Ado","Ado-Ekiti","Nigeria");
        Student student = new Student("Jacob", 18, address);
        System.out.println(student);
        address.setStreet("Lagos");
        System.out.println(student);








    }
}
