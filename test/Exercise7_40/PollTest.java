package Exercise7_40;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PollTest {
    private Poll polar;
    @BeforeEach
    void setup() {
     polar = new Poll();
    }

    @Test
    void testTCalculateAverage() {
        //given
        int [] polarNumbers = {10, 20, 30, 40, 50};
        polar.calculateAverage(polarNumbers);
        assertEquals(30, polar.getAverageRating());
    }

    @Test
    void testToCalculateHighestPoints() {
        int [] polarNumbers = {10, 20, 30, 40, 50};
        int highestPoints = polar.getHighestPoint(polarNumbers);
        assertEquals(50, highestPoints);
    }

    @Test
    void testToCalculateLowestPoints() {
        int [] polarNumbers = {10, 20, 30, 40, 50};
        int lowestPoints = polar.getLowestPoint(polarNumbers);
        assertEquals(10, lowestPoints);
    }

}