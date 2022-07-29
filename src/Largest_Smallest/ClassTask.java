package Largest_Smallest;

import java.util.Scanner;

public class ClassTask {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        largestNum();
//        lowestNum();

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter number 1: ");
        int user_input = input.nextInt();
        int largestNumber = user_input;
        int lowestNumber = user_input;


        int count = 1;
        while (count < 5) {
            System.out.printf("Enter an integer", count + 1);
            user_input = input.nextInt();
//            count++;

            if (user_input > largestNumber) {
                largestNumber = user_input;
            }
            if (user_input < lowestNumber) {
                lowestNumber = user_input;
            }
            count = count + 1;
        }
        System.out.printf("The largest number is %d ", largestNumber);
        System.out.printf("%nThe lowest number is %d ", lowestNumber);
    }
}


//    public static void largestNum() {
//        int largestNumber = 0;
////        int lowestNumber = 1_000_000;
//
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Enter an integer");
//            int number = input.nextInt();
//
//            if (number > largestNumber) {
//                largestNumber = number;
//            }
//            if (number < lowestNumber) {
//                lowestNumber = number;
//            }
//        }
//        System.out.printf("The largest number is %d ", largestNumber);
//        System.out.printf("%nThe lowest number is %d ", lowestNumber);
//    }
//
//    public static void lowestNum() {
//        int lowestNumber = 1_000_000;
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Enter an integer");
//            int number = input.nextInt();
//
//            if (number < lowestNumber) {
//                lowestNumber = number;
//            }
//        }
//        System.out.printf("%nThe lowest number is %d ", lowestNumber);
//    }
//    int largestNumber = 0;
//    int lowestNumber = 1_000_000;
//
//
//        for (int counter = 0; counter < 5; counter++) {
//        System.out.println("Enter an integer");
//        int number = input.nextInt();
//
//        if (number > largestNumber) {
//            largestNumber = number;
//        } else if (number < lowestNumber) {
//            lowestNumber = number;
//        }
//    }
//        System.out.printf("The largest number is %d ", largestNumber);
//        System.out.printf("%nThe lowest number is %d ", lowestNumber);
//}



