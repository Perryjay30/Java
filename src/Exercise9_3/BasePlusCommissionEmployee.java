package Exercise9_3;

public class BasePlusCommissionEmployee {

    private final double baseSalary;

    private CommissionEmployee commissionEmployee;

    public BasePlusCommissionEmployee(double baseSalary, CommissionEmployee commissionEmployee) {
        this.baseSalary = baseSalary;
        this.commissionEmployee = commissionEmployee;
    }

    public String getFirstName() {
        return commissionEmployee.getFirstName();
    }

    public String getLastName() {
        return commissionEmployee.getLastName();
    }

    public String getSocialSecurityNumber(){
        return commissionEmployee.getSocialSecurityNumber();
    }

    public double getCommissionRate() {
        return commissionEmployee.getCommissionRate();
    }

    public double getGrossSales() {
        return commissionEmployee.getGrossSales();
    }

    public double earnings() {
        return getBaseSalary() + (commissionEmployee.getGrossSales() * commissionEmployee.getCommissionRate());
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}
