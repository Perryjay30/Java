package Exercise7_21;

import Exercise7_21b.PenPosition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TurtleTest {

        private Turtle ijapa;

        @BeforeEach
        public void setUp(){
            ijapa = new Turtle();
        }

        @Test
        public void turtleHasPen(){
            assertNotNull(ijapa);
            assertEquals(0, ijapa.getTurtlePen());
            assertNotNull(ijapa.getTurtlePen());
        }

        @Test
        public void turtlePenIsUp(){
            turtleHasPen();
            assertNotNull(ijapa.getTurtlePen().getPosition());
            assertEquals(PenPosition.UP, ijapa.getTurtlePen().getPosition());
        }

        @Test
        public void moveForward(){
            turtlePenIsUp();
            ijapa.moveForward(9);
            assertEquals(0, ijapa.getyCoordinate());
            assertEquals(8, ijapa.getxCoordinate());
        }
    }

