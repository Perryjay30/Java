package AnnualInvestment;

import java.util.Scanner;

public class Investment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        double amount = input.nextDouble();
        System.out.println("What's the rate? ");
        double rate = input.nextDouble();
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        //double answer;
        for (int i = 1; i < year; i++) {
            rate = amount * 0.05;
            amount += rate;
            System.out.printf("Year %d:\t\t$%.2f\n", i, amount);
        }

    }
}
