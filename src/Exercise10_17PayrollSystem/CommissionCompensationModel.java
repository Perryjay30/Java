package Exercise10_17PayrollSystem;

public class CommissionCompensationModel implements CompensationModel{
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    public  CommissionCompensationModel( double grossSales, double commissionRate) {


        if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

        if (grossSales < 0.0) // validate
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
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

    public double getCommissionRate() {
        return commissionRate;
    }

    public double earnings() {

        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
                "commission Compensation Model",
                "gross sales", getGrossSales(),
                "commission rate", getCommissionRate());
    }
}
