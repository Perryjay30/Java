package Exercise7_19;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Exercise7_19.AirlineReservationSystem.*;
import static org.junit.jupiter.api.Assertions.*;

class AirlineReservationSystemTest {

    private AirlineReservationSystem qatarAirways;

    @BeforeEach
    void doThisRepeatedly() {
        qatarAirways = new AirlineReservationSystem();
    }

    @Test
    void testThatThereAreEmptySeatsInThePlane() {
         boolean [] planeSeats = new boolean[10];
         assertTrue(getPlaneSeats());
    }

    @Test
    void testFirstClassSeatsCanBeBookedOnThePlane() {
        assertTrue(AirlineReservationSystem.firstClass());
    }

    @Test
    void testThatEconomyCLassCanBeBookedOnThePlane() {
        assertTrue(AirlineReservationSystem.economyClass());
    }

    @Test
    void testThatEconomyCLassCanBeBookedIfFirstClassSeatsAreFull() {
        boolean [] planeSeats = new boolean[10];
        if(planeSeats[0] && planeSeats[1] && planeSeats[2] && planeSeats[3] && planeSeats[4])
            alternativePlacementForEconomyClass();
    }

    @Test
    void testThatFirstCLassCanBeBookedIfEconomyClassSeatsAreFull() {
        boolean[] planeSeats = new boolean[10];
        if(planeSeats[5] && planeSeats[6] && planeSeats[7] && planeSeats[8] && planeSeats[9])
            alternativePlacementForFirstClass();
    }

}