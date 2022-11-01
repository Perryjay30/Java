package Exercise9_16;

public class Employee {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private CompensationModel compensationModel;


    public Employee(String firstName, String lastName, String socialSecurityNumber, CompensationModel compensationModel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.compensationModel = compensationModel;
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

    public CompensationModel getCompensationModel() {
        return compensationModel;
    }

    public void setCompensationModel(CompensationModel compensationModel) {
        this.compensationModel = compensationModel;
    }

    @Override
    public String toString() {
        return "Employee details: \n" +
                "First name: " + firstName + "\n" +
                "Last name: " + lastName + "\n" +
                "Social security number: " + socialSecurityNumber + "\n" +
                "Compensation Model: " + compensationModel;
    }
}
