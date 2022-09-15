package Exercise4_20;

import java.util.Scanner;

public class TaxCalculator {
    private static double earnings;

    public static void main(String[] args) {
        double tax;
        double sumOfTax = 0.0;
        int citizen = 1;
        System.out.println("Welcome to Tax Calculator!!!");
        Scanner input = new Scanner(System.in);
        int count = 0;
        while(count < 3) {
            System.out.printf("Enter name for citizen %d: ", citizen);
            String nameOfCitizen = input.nextLine();
            System.out.printf("Enter earnings for citizen %d: ", citizen);
            double earnings = input.nextDouble();
            input.nextLine();
            if(earnings <= 30_000.00) tax = earnings * 0.15;
            else tax = earnings * 0.20;
            count += 1;
            System.out.printf("the total tax for citizen %d is %.2f\n ", citizen, tax);
            citizen++;
            sumOfTax = sumOfTax + tax;
        }
        System.out.printf("The total tax for all citizens is %.2f:", sumOfTax);
    }

}
