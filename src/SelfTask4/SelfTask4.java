package SelfTask4;

import java.util.Scanner;

public class SelfTask4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer");
        int number1 = input.nextInt();
        System.out.println("Enter second integer");
        int number2 = input.nextInt();
        System.out.println("Enter third integer");
        int number3 = input.nextInt();

        int sum = number1 + number2 + number3;
        System.out.printf("sum is %d%n", sum);

        int product = number1 * number2 * number3;
        System.out.printf("product is %d%n", product);

        int average = sum / 3;
        System.out.printf("average is %d%n", average);

        if(number1 < number2) {
            System.out.println("number1 is the smallest");
        }
        if(number3 > number2) {
            System.out.println("number3 is the largest");
        }

    }
}
