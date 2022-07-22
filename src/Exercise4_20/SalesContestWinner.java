package Exercise4_20;

import java.util.Scanner;

public class SalesContestWinner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int largestNumber = 0;
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        int counter = 0;
        while (counter < 10) {
            System.out.println("Enter an integer: ");
            number = input.nextInt();
            counter++;
            if(number > largestNumber){
                largestNumber = number;
            }

        }

        System.out.printf("The largest number is %d ", number);

    }
}


