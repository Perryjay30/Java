package Exercise9_15;

import static org.junit.jupiter.api.Assertions.*;

class HourlyEmployeeTest {

    public static void main(String[] args) {

        HourlyEmployee worker = new HourlyEmployee("Shawn", "Davies", "456-61-6543",16.0, 200);
        System.out.println("worker information obtained by get methods");
        System.out.printf("%n%s  %s%n", "First name is: ", worker.getFirstName());
        System.out.printf("%n%s  %s%n", "Last Name is: ", worker.getLastName());
        System.out.printf("%n%s  %s%n", "Social Security Number is: ", worker.getSocialSecurityNumber());
        System.out.printf("%n%s  %.2f%n", "Hours is: ", worker.getHours());
        System.out.printf("%n%s  %.2f%n", "Wages is: ", worker.getWages());

        worker.setHours(160);
        worker.setWages(200);
        System.out.println();
        System.out.printf("%s%s", " worker information updated by to string", worker);

    }

}