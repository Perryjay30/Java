package Chapter10_PayrollSystem;

import java.util.Date;

public abstract class Employee implements Payable{
    private final String firstName;
    private final String lastName;
    private final Date birthDate;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s%nSocial security number: %s",
                getFirstName(), getLastName(), getBirthDate(), getSocialSecurityNumber());
    }
    public abstract double earnings();
    public double getPaymentAmount() {
        return earnings();
    }
}
