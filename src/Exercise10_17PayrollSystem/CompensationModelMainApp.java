package Exercise10_17PayrollSystem;

import Chapter10_PayrollSystem.BasePlusCommissionCompensationModel;

public class CompensationModelMainApp {
    public static void main(String[] args) {
        SalariedCompensationModel scm = new SalariedCompensationModel(125.00);
        HourlyCompensationModel hcm = new HourlyCompensationModel(30.00, 39);
        CommissionCompensationModel ccm = new CommissionCompensationModel(298.00, 0.10);
        BasePlusCommissionCompensationModel bpccm = new BasePlusCommissionCompensationModel(175.00, 0.8, 50.00);

        System.out.println("Employees Compensation model processed individually!!");

        System.out.printf("The Compensation Model for Salaried Employee is %.2f%n", scm.getWeeklySalary());
        System.out.printf("The Compensation model for Hourly Employee: %.2f%n", hcm.earnings());
        System.out.printf("Commission Employee compensation model: %.2f%n", ccm.earnings());
        System.out.printf("Base commission Employee compensation model: %.2f%n", bpccm.earnings());
    }
}
