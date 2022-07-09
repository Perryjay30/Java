package SelfTask2;

import java.util.Scanner;

public class SelfTask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer");
        int num1 = input.nextInt();

        System.out.println("Enter first integer");
        int num2 = input.nextInt();

        int squareNum1 = num1 * num1;
        int squareNum2 = num2 * num2;

        int sum = squareNum1 + squareNum2;
        int diff = squareNum1 - squareNum2;

        System.out.printf("Sum is %d%n", sum);
        System.out.printf("diff is %d%n", diff);


    }
}
