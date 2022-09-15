package CompoundInterestCalculations;

public class Interest {
    public static void main(String[] args) {
        double principal = 1000.0;
//        double rate = 0.05;
        double rate = 0.06;
//        double rate = 0.07;
//        double rate = 0.08;
//        double rate = 0.09;
//        double rate = 0.10;


        System.out.printf("%s%20s%n", "Year", "Amount On Deposit");

        for (int year = 1; year <= 10; year++) {
            double amount = principal * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }
}
