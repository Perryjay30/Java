package Exercise9_16;

public class BasePlusCommissionCompensationModel extends CompensationModel {
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage
    private double baseSalary;


    public  BasePlusCommissionCompensationModel( double grossSales, double commissionRate, double baseSalary) {


        if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

        if (grossSales < 0.0) // validate
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) // validate
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

        this.commissionRate = commissionRate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public double earnings() {

        return getBaseSalary() + getCommissionRate() * getGrossSales();
    }

    public String toString() {
        return String.format("%s: %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "Gross Sales: ", getGrossSales(),
                "Commission Rate: ", getCommissionRate(),
                "Base salary: ", getBaseSalary(),
                "Total Earnings: ", earnings());
    }

}
