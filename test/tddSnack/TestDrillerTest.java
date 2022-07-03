package tddSnack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerTest {
    TestDriller testDriller;
    @BeforeEach
    void setUp(){
        testDriller = new TestDriller();
    }
    @Test
    @DisplayName("Test for cost at range of 1 - 4")
    void testForCostAtRangeOf1to4(){
        //when
        int cost = testDriller.costRange(4);
        //check
        assertEquals(8000, cost);
    }

    @Test
    @DisplayName("Test for cost at range of 5 - 9")
    void testForCostAtRangeOf5to9(){
        //when
        int cost = testDriller.costRange(9);
        //check
        assertEquals(16200, cost);
    }

    @Test
    @DisplayName("Test for cost at range of 10 - 29")
    void testForCostAtRangeOf10to29(){
        //when
        int cost = testDriller.costRange(29);
        //check
        assertEquals(46400, cost);
    }

    @Test
    @DisplayName("Test for cost at range of 30 - 49")
    void testForCostAtRangeOf30to49(){
        //when
        int cost = testDriller.costRange(40);
        //check
        assertEquals(60000, cost);
    }

    @Test
    @DisplayName("Test for cost at range of 50 - 99")
    void testForCostAtRangeOf50to99(){
        //when
        int costRange = testDriller.costRange(67);
        //check
        assertEquals(87100,costRange);
    }

    @Test
    @DisplayName("Test for cost at range of 100 - 199")
    void testForCostAtRangeOf100to199(){
        //when
        int costRange = testDriller.costRange(153);
        //check
        assertEquals(183600, costRange);
    }

    @Test
    @DisplayName("Test for cost range of 200 - 499")
    void testForCostRangeOf200to499(){
        //when
        int costRange = testDriller.costRange(300);
        //check
        assertEquals(330000, costRange);
    }

    @Test
    @DisplayName("Test for cost range of 500 above")
    void testForCostRangeOf500andAbove(){
        //when
        int costRange = testDriller.costRange(600);
                //check
        assertEquals(600000, costRange);
    }
}
