package Hotel_Management_System;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnicornHotelTest {

    UnicornHotel unicornHotel;
    @BeforeEach
    void startAllTestWith() {
        unicornHotel = new UnicornHotel(5);
        assertNotNull(unicornHotel);
    }

   @Test
   void testThatWeHaveRooms_AndTheyAreEmpty() {
        String [] rooms = unicornHotel.getRooms();
        assertNotNull(rooms);
        for(String room : rooms) {
            assertNull(room);
        }
    }

    @Test
    void testThatRoomsCanBeBooked()  {
        String name = "Segun";
        String result = unicornHotel.bookRoom("Segun");
        assertNotNull(result);
        assertEquals(name,unicornHotel.getRoomGuest(1));
        String name2 = "Lekan";
        unicornHotel.bookRoom("Lekan");
        assertEquals("name2",unicornHotel.getRoomGuest(2));
        }

    @Test
    void testThatGuestCanCheckOut() {
        assertNotNull(unicornHotel.checkOut("Segun"));
        assertEquals("name", unicornHotel.getRoomGuest(1));
        String name2 = "Lekan";
        unicornHotel.checkOut("Lekan");
        assertEquals(name2, unicornHotel.getRoomGuest(2));
    }
}
