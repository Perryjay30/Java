package SelfTask6;

import java.util.Scanner;

public class SelfTask6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer");
        int ajoke1 = input.nextInt();

        System.out.println("Enter second Integer");
        int ajoke2 = input.nextInt();

        System.out.println("Enter third integer");
        int ajoke3 = input.nextInt();

        System.out.println("Enter forth integer");
        int ajoke4 = input.nextInt();

        if(ajoke1 < ajoke2) {
            System.out.println("The smallest is ajoke1");
        }

            if(ajoke3 < ajoke4) {
            System.out.println("The largest is ajoke4");
        }

    }
}
