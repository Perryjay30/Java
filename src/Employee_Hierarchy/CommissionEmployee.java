package Employee_Hierarchy;

public class CommissionEmployee extends Employee {

   private double grossSales;
   private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales) {
        super(firstName, lastName, socialSecurityNumber);

        if(grossSales < 0.0) {
            throw new IllegalArgumentException("gross must be >= 0.0");
        }
        if(commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("commissionRate must be less than 0.0 and greater than 1.0");
        }
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0) {
            throw new IllegalArgumentException("gross must be >= 0.0");
        }
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }


    public void setCommissionRate(double commissionRate) {
        if(commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("commissionRate must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double earnings() {
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Gross sales: " + grossSales + "\n" +
                "Commission rate: " + commissionRate + "\n" +
                "Total earnings: " + earnings();
    }
}
