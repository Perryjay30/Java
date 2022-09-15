package Exercise8_6;

public class SavingsAccount {
    private double annualInterestRate;
    private double savingsBalance;

    boolean accountIsAvailable;

    public SavingsAccount(double annualInterestRate, double savingsBalance) {
        this.annualInterestRate = annualInterestRate;
        this.savingsBalance = savingsBalance;
    }

    public void isThereAnAccount() {
        accountIsAvailable = true;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest() {
        double calculate = getSavingsBalance() * getAnnualInterestRate() / 12;
        return calculate;

    }

    public double modifyAnnualInterestRate() {
       double setAnnualInterestRate;
        return 0.05;
    }

    public double modifiedMonthlyInterest() {
        double modified = getSavingsBalance() * modifyAnnualInterestRate() / 12;
        return modified;
    }

}
