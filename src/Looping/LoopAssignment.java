package Looping;

import java.util.Scanner;

public class LoopAssignment {

    public static void main(String[] args) {
        int counter;
        int count;
        int num;

        System.out.print("Input number of rows: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        for (counter = 1; counter <= num; counter++) {
            for (int k = 1; k <= (num - counter); k++) {
                System.out.print(" ");
            }
            for (count = 1; count <= (2 * counter) - 1; count++) {
                System.out.print(counter);
            }
            System.out.println();
        }

    }
}