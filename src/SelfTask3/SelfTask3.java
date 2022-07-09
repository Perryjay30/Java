package SelfTask3;

import java.util.Scanner;

public class SelfTask3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");
        int joker = input.nextInt();
        if(joker > 100){
            System.out.println("joker is greater than 100");
        }
        if(joker == 100) {
            System.out.println("joker is equal to 100");
        }
        if(joker < 100) {
            System.out.println("joker is less than 100");
        }
        if(joker != 100) {
            System.out.println("joker is not equal to 100");
        }
        int squareNum = joker * joker;
        if(squareNum > 100) {
            System.out.println("square number is greater than 100");
        }
        if(squareNum < 100) {
            System.out.println("square number is less than 100");
        }
        if(squareNum == 100) {
            System.out.println("square number is equal to 100");
        }
        if(squareNum != 100) {
            System.out.println("square number is not equal to 100");
        }
    }
}
