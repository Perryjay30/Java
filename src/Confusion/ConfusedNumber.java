package Confusion;

import java.util.Scanner;

public class ConfusedNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        if(num == 0)
            System.out.println("1");
        if(num == 1)
            System.out.println("0");


    }
}
