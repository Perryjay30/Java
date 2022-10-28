package Exercise7_19;

import java.util.Scanner;

import static Exercise7_19.AirlineReservationSystem.*;

public class AirlineReservationSystemApplication {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("""
                ****************************************
                Welcome to Perry Airlines!.....
                ****************************************
                Wanna book a flight today?
                Please, type 1 for First Class: 
                Please, type 2 for Economy Class:
                """);
        int userSelection = input.nextInt();
        switch(userSelection) {
            case 1 -> firstClass();
            case 2 -> economyClass();
        }

        if(AirlineReservationSystem.planeSeats[0] && AirlineReservationSystem.planeSeats[1] && AirlineReservationSystem.planeSeats[2]
                && AirlineReservationSystem.planeSeats[3] && AirlineReservationSystem.planeSeats[4])
            alternativePlacementForEconomyClass();

        if(AirlineReservationSystem.planeSeats[5] && AirlineReservationSystem.planeSeats[6] && AirlineReservationSystem.planeSeats[7]
                && AirlineReservationSystem.planeSeats[8] && AirlineReservationSystem.planeSeats[9])
            alternativePlacementForFirstClass();

    }
}
