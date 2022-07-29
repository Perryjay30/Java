package Exercise4_34;

import java.util.Scanner;

public class SpecifiedSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the specified number: ");
        int num = input.nextInt();

        int counter = 0;
        int total = 0;
        while(counter < 5) {
            System.out.println("Enter an integer: ");
            int number = input.nextInt();
            total += number;
            counter++;
        }

            if(total == num)
                System.out.println("total is equal to specified number");
            if(total > num)
                System.out.println("total is greater than specified number");



    }
}
