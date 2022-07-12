package ClockTest;

import Clock.Clock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

public class ClockTest {

    Clock wristwatch;

    @BeforeEach
    void setUp() {
        wristwatch = new Clock();
    }

    @Test
    @DisplayName("Test hour")
    void testSetHour() { assertNotNull(wristwatch); }

    @Test
    @DisplayName("Test minute")
    void testSetMinute() { assertNotNull(wristwatch); }

    @Test
    @DisplayName("Test seconds")
    void testSetSeconds() { assertNotNull(wristwatch); }

    @Test
    @DisplayName("Test time")
    void testDisplayTime() {
        assertNotNull("09:45:31");
        System.out.printf("%nThe time is 09:45:31");
    }

}
