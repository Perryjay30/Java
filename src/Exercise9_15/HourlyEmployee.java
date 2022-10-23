package Exercise9_15;

import Exercise9_14Employee_Hierarchy.Employee;

public class HourlyEmployee extends Employee {
    private double wages;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,double hours, double wages) {
        super(firstName, lastName, socialSecurityNumber);
        if(wages < 0.0) {
            throw new IllegalArgumentException("wages must be greater than 0.0");
        }
        if(hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("hours must between 0 and 168");
        }
        this.hours = hours;
        this.wages = wages;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        if(wages < 0.0) {
            throw new IllegalArgumentException("wages must be greater than 0.0");
        }
        this.wages = wages;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if(hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("hours must between 0 and 168");
        }
        this.hours = hours;
    }

    public double earnings() {
        int maxHours = 40;
        double overTime = 1.5;
        double earnings;
        if(hours <= 40) {
            earnings = hours * wages;
        } else {
            earnings = (hours - maxHours) * overTime * wages + (maxHours * wages);
        }
        return earnings;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Hours worked: " + hours + "\n" +
                "Wages per hour: " + wages;
    }
}
