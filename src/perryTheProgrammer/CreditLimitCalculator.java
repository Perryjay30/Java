package perryTheProgrammer;

import java.util.Scanner;

public class CreditLimitCalculator {

    public static void main(String[] args) {
        int customer = 1;
        int accountNumber;
        float balance;
        int itemsCharged;
        int creditLimit;
        Scanner input = new Scanner(System. in);
        System.out.printf("Enter the account number for Customer%d: ", customer);
        accountNumber = input.nextInt();

        while(accountNumber != -3) {
            System.out.printf("Enter balance for Customer%d: ", customer);
            balance = input.nextInt();
            System.out.printf("Enter items Charged for Customer %d: ", customer);
            itemsCharged = input.nextInt();
            System.out.printf("Enter credit limit for Customer %d: ", customer);
            creditLimit = input.nextInt();
            double totalOfAllItems = (double) balance / itemsCharged;
            System.out.printf("Total of all items is %.2f\n ", totalOfAllItems);
            double newBalance = balance + itemsCharged - creditLimit;
            System.out.printf("New balance is %.2f\n ", newBalance);
            if (creditLimit <= 100) {
                System.out.println("credit limit exceeded");
                customer++;
            } else {
                customer++;
                System.out.printf("Enter the account number for customer%d: ", customer);
                accountNumber = input.nextInt();
            }
        }
    }
}
