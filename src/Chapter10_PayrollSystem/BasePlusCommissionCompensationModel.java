package Chapter10_PayrollSystem;

import Exercise10_17PayrollSystem.CompensationModel;

public class BasePlusCommissionCompensationModel implements CompensationModel {
    private double baseSalary;
    private double commissionRate;
    private double grossSales;


    public BasePlusCommissionCompensationModel(double grossSales, double commissionRate, double baseSalary) {


        if (baseSalary < 0.0) // validate baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) // validate baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary + grossSales * commissionRate;
    }

    @Override
    public String toString()
    {
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried",
                "base salary", getBaseSalary());
    }
}
