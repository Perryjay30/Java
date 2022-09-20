package Exercise6_24;

import java.util.Scanner;

public class PerfectNumber {

    public static boolean isPerfect(int number){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int number = input.nextInt();
        int total = 0;
        for(int fact = 1; fact <= number / 2; fact++)
            if(number % fact == 0) {
                System.out.printf("%d  ", fact);
                total += fact;
            }
        if(total == number)
            System.out.printf("\n%d is a perfect number", number);
        else if (total > number){
            System.out.printf("\n%d is abundant", number);
        } else
            System.out.printf("\n%d is deficient", number);
        return false;
    }

    public static void main(String[] args) {
       isPerfect(64);
    }
}
