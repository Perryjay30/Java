package Exercise9_3;

public class Application {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Brenda", "Foxx",
                "456-678-123", 0.5, 5700.00);

//        System.out.print(commissionEmployee);
        System.out.println("\t\t\tCommission Employee");
        System.out.println("=========================================");
        System.out.printf("First Name: %s%n", commissionEmployee.getFirstName());
        System.out.printf("Last Name: %s%n", commissionEmployee.getLastName());
        System.out.printf("Social Security Number: %s%n", commissionEmployee.getSocialSecurityNumber());
        System.out.printf("Commission Rate: %s%n", commissionEmployee.getCommissionRate());
        System.out.printf("Gross Sales: %s%n", commissionEmployee.getGrossSales());
        System.out.printf("Total Earnings: %s%n", commissionEmployee.earnings());
        System.out.println("=========================================");



        BasePlusCommissionEmployee basePlusCommissionEmployee= new BasePlusCommissionEmployee(2000,
                new CommissionEmployee("Wright", "Nathan", "543-127-908", 0.6, 5000));

        System.out.println("\t\t\tBase Plus Commission Employee");
        System.out.println("=========================================");
        System.out.printf("First Name: %s%n", basePlusCommissionEmployee.getFirstName());
        System.out.printf("Last Name: %s%n", basePlusCommissionEmployee.getLastName());
        System.out.printf("Social Security Number: %s%n", basePlusCommissionEmployee.getSocialSecurityNumber());
        System.out.printf("Commission Rate: %s%n", basePlusCommissionEmployee.getCommissionRate());
        System.out.printf("Gross Sales: %s%n", basePlusCommissionEmployee.getGrossSales());
        System.out.printf("Base Salary: %s%n", basePlusCommissionEmployee.getBaseSalary());
        System.out.printf("Total Earnings: %s%n", basePlusCommissionEmployee.earnings());
        System.out.println("=========================================");



    }
}
