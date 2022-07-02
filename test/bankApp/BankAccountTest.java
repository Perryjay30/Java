package bankApp;

import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount gtcre8 = new BankAccount("Olubanji Tosin", 50.00);
        BankAccount firstmonie = new BankAccount("Kareem Ajoke", -7.53);

        System.out.printf("%s balance: $%s.2f%n", gtcre8.getName(), gtcre8.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", firstmonie.getName(), firstmonie.getBalance());

        Scanner input = new Scanner(System.in);
        System.out.print("enter deposit amount for gtcre8:");
        double depositAmount = input.nextDouble();
        System.out.printf("%n adding %2f to gtcrea8 balance%n%n", depositAmount);
        gtcre8.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n", gtcre8.getName(), gtcre8.getBalance());
            System.out.printf("%s balance: $%.2f%f%n%n", firstmonie.getName(), firstmonie.getBalance());

        System.out.print("Enter deposit amount for firstmonie");
        depositAmount = input.nextDouble();
        System.out.printf("%n adding %.2f to firstmonie balance%n%n", depositAmount);
        firstmonie.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n",
                gtcre8.getName(), gtcre8.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                firstmonie.getName(), firstmonie.getBalance());
        

    }
}

