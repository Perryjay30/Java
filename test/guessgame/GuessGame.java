package guessgame;

import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess number");

        int number1 = sc.nextInt();
        int number2 = 80;

        if(number1 == number2) {
            System.out.print("you are correct");
        }
        else {
            System.out.print("you are wrong");
        }

    }
}
