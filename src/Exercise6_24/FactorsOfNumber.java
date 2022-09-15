package Exercise6_24;

import java.util.Scanner;

public class FactorsOfNumber {

    public static void factors() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int i = 1;
        while (i < number) {
            if (number % i == 0) {
                System.out.printf("%d  ", i);
                i++;
            }
        }
    }

    public static void main(String[] args) {
        factors();
    }
}