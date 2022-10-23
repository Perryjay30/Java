package Exercise7_29;

import java.util.Scanner;

public class FibonacciSeries {
    private static final Scanner input = new Scanner(System.in);
    static int sum = 0;
    public static int Fibonacci(int nth) {
        int num1 = 0;
        int num2 = 1;
        for (int i = 2; i < nth; i++) {
//            for (int i = 0; i < nth; i++)
//            if(i < 2)
//                sum = i;
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of Fiboccani Series: ");
        int number = input.nextInt();

        System.out.printf("Fiboccani Series of %d is %d%n ", number, Fibonacci(number));
    }
}
