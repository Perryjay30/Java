package PerryTheProgrammer3;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {

        int number = (int)(Math.random() * 101);

        Scanner perry = new Scanner(System.in);
        System.out.print("Enter a magic number between 0 to 100: ");

        int guess = -1;
        while(guess != number) {
            System.out.println("\nGuess a number:");
            guess = perry.nextInt();

            if(guess == number) {
                System.out.println("\nwow! You're correct");
            } else if
            (guess > number){
                System.out.println("\nnumber too high");
            } else {
                System.out.println("\nnumber too low");
            }
        }
    }
}
