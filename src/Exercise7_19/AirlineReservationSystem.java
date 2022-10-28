package Exercise7_19;

import java.util.Scanner;

public class AirlineReservationSystem {
    static boolean [] planeSeats = new boolean[10];

    public static boolean getPlaneSeats() {
        return true;
    }


    static boolean firstClass() {
        for(int seatNumber = 0; seatNumber < planeSeats.length - 5; seatNumber++) {
            if(!planeSeats[seatNumber]) {
                System.out.println("Your seat has been booked, your seat number is " + seatNumber + "\nFirst Class");
                planeSeats[seatNumber] = true;
                break;
            }
        }
        return true;
    }

    static boolean economyClass() {
        for (int seatNumber = 5; seatNumber < planeSeats.length; seatNumber++) {
            if(!planeSeats[seatNumber]) {
                System.out.println("Your seat has been booked, your seat number is " + seatNumber + "\nEconomy Class");
                planeSeats[seatNumber] = true;
                break;
            }
        }
        return true;
    }

    static void alternativePlacementForEconomyClass() {
        System.out.println("First class is filled up, would you like to book a seat in the Economy class section?");
        System.out.println("If YES, Enter 1: ");
        System.out.println("If NO, Enter 2: ");

        Scanner input =  new Scanner(System.in);
        int userChoice = input.nextInt();
        if(userChoice == 1) {
            economyClass();
        } else if (userChoice == 2) {
            System.out.println("Next flight leaves in three hours!!");
        } else
            System.out.println("Wrong input");

    }

    static void alternativePlacementForFirstClass() {
        System.out.println("Economy class is filled up, would you like to book a seat in the First class section?");
        System.out.println("If YES, Enter 1: \nIf NO, Enter 2:");
        System.out.println("");

        Scanner input =  new Scanner(System.in);
        int userChoice = input.nextInt();
        if(userChoice == 1) {
            firstClass();
        } else if (userChoice == 2) {
            System.out.println("Next flight leaves in three hours!!");
        } else
            System.out.println("Wrong input");
    }


}
