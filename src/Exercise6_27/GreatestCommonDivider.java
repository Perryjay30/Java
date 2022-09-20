package Exercise6_27;

import java.util.Scanner;

public class GreatestCommonDivider {

    public static void main(String[] args) {
        greatestCommonDivisor();

    }

    public static void greatestCommonDivisor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();
//        int gcd = 0;
            if(n1 % n2 == 0) {
//                gcd = n1;
                System.out.println("The greatest divisor is " + n1);
            } else
                System.out.println("Invalid input");

    }
}
