package Exercise9_16;

public class MainApp {
    public static void main(String[] args) {
        CompensationModel compensationModel = new CommissionCompensationModel(34000, 0.7);
        CompensationModel compensationModel1 = new BasePlusCommissionCompensationModel(45000, 0.5, 25000);
        Employee employee = new Employee("Bowen", "Lawson", "214-786-900", compensationModel);
        System.out.println(employee);
        employee.setCompensationModel(new CommissionCompensationModel(3000, 0.02));
        System.out.println(employee);
        System.out.println("============================================================================================");
        employee = new Employee("Richard", "Davies","563-678-906", compensationModel1);
        System.out.println(employee);
        employee.setCompensationModel(new BasePlusCommissionCompensationModel(78000, 0.4, 90000));
        System.out.println(employee);



    }
}
