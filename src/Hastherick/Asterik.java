package Hastherick;

import java.util.Scanner;

public class Asterik {

    public static void main(String[] args){
        int counter;
        int count;
        int asterick;

        System.out.print("Input number of rows: ");
        Scanner input = new Scanner(System.in);
        asterick = input.nextInt();

        for(counter = 1; counter <= asterick; counter++){
            for(int k = 1; k <= asterick - counter; k++){
                System.out.print(" ");
            }
            for(count = 1; count <= (2 * counter) -1; count++) {
                    System.out.print("*");
            }

            System.out.println();
            }
    }
}
