package PerryTheProgrammer7;

import java.util.Scanner;

public class PositiveAndNegativeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive or negative integers. input ends if it is 0: ");
        int number = sc.nextInt();
        float total = 0;
        float average = 0;
        while(number != 0) {
            total += number;
            average = total / number;

            System.out.println("Enter positive or negative integers. input ends if it is 0: ");
            number = sc.nextInt();
            }

        System.out.println("the total is " + total);
        System.out.println("\nThe average is " + average);
    }
}
