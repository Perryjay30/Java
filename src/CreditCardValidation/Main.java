package CreditCardValidation;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) throws InvalidCreditCardException, InvalidCreditCardLength {
        System.out.print("""
                CREDIT CARD VALIDATION!!!
                Press 1 to enter the credit card number you want to validate
                Press 2 to exit""");
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter an option: ");
        int userInput = sc.nextInt();
        switch(userInput) {
            case 1 -> checkValidation();
            case 2 -> exit(2);
        }
    }

    private static void checkValidation() throws InvalidCreditCardException, InvalidCreditCardLength {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your credit number to check validation");
        String cardNumber = input.nextLine();
        if (CreditCard.isValidCreditCard(cardNumber)) System.out.println("Is valid");
        else
            throw new InvalidCreditCardException("Credit can't be validated");
     }

}
