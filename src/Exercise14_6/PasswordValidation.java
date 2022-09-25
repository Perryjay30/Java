package Exercise14_6;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String input = sc.next();


        if (!validatePassword(input)) {
            System.out.println("Invalid input");
            System.out.println("Password length must be between 8 and 15. It must contain an uppercase letter and at least a digit");
        } else if (validatePassword(input))
            System.out.println("Password created successfully");
    }

    public static boolean validatePassword(String password) {
        if (password.length() < 8 || password.length() > 15) {
            System.out.println("Length must be between 8 and 15");
        }

        return password.matches("([A-Z][a-zA-Z]+\\d+)");

    }
}
