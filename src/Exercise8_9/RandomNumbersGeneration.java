package Exercise8_9;

import java.security.SecureRandom;
import java.util.Scanner;


public class RandomNumbersGeneration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();

        System.out.print("Enter number of times to generate random numbers: ");
        int numberOfTimes = input.nextInt();

        int count = 0;
        while (count < numberOfTimes) {
            System.out.println(rand.nextInt(10, 100));
            count++;
        }
    }
}
