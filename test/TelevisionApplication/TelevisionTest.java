package TelevisionApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {

    Television sony;
    @BeforeEach
    void initialSetUp() {
        sony = new Television();
    }

    @Test
    void TestThatTelevisionCanBeSwitchedOn() {
        assertFalse(sony.switchOn());

        sony.turnOn();
        assertTrue(sony.switchOn());
    }

    @Test
    void testThatTelevisionCanBeSwitchedOff() {
        sony.turnOn();
        assertTrue(sony.switchOn());

        sony.turnOff();
        assertFalse(sony.switchOn());
    }

    @Test
    void testThatTelevisionCanIncreaseVolume() throws Exception {
        sony.turnOn();

        sony.increaseVolume();
        assertEquals(1, sony.getVolume());
    }

    @Test
    void testThatTelevisionVolumeCantBeIncreasedWhenSwitchedOff() throws Exception {
        sony.turnOff();
        assertFalse(sony.switchOn());

        sony.increaseVolume();
        assertEquals(0, sony.getVolume());
    }

    @Test
    void testThatTelevisionVolumeCanIncreaseMoreThanOnce() throws Exception {
        sony.turnOn();
        sony.increaseVolume();
        assertEquals(1, sony.getVolume());

        for (int i = 1; i < 30; i++) {
            sony.increaseVolume();
        }
        assertEquals(30, sony.getVolume());
    }

    @Test
    void testThatTelevisionVolumeCanBeDecreased() throws Exception {
        sony.turnOn();
        for (int i = 0; i < 10; i++) {
          sony.increaseVolume();
        }
        assertEquals(10, sony.getVolume());

        sony.decreaseVolume();
        sony.decreaseVolume();
        assertEquals(8, sony.getVolume());
    }

    @Test
    void testThatTelevisionVolumeCantBeDecreasedWhenSwitchedOff() throws Exception {
        sony.turnOff();
        sony.increaseVolume();
        assertEquals(0, sony.getVolume());

        sony.decreaseVolume();
        assertEquals(0, sony.getVolume());
    }

    @Test
    void testThatTelevisionVolumeCantBeIncreasedAbove100() throws Exception {
        sony.turnOn();
        for (int i = 0; i < 101; i++) {
            sony.increaseVolume();
        }
        assertEquals(100, sony.getVolume());
        System.out.println("Sorry, Volume cant exceed 100");
    }

    @Test
    void testThatTelevisionVolumeCantBeDecreasedBelow0() throws Exception {
        sony.turnOn();
        for (int i = 0; i < 100; i++) {
            sony.increaseVolume();
        }
        assertEquals(100, sony.getVolume());

        for (int i = 100; i > 0; i--) {
            sony.decreaseVolume();
        }
        assertEquals(0, sony.getVolume());
        sony.decreaseVolume();
        assertEquals(0, sony.getVolume());
        System.out.println("Sorry, Volume cant go below 0");
    }

    @Test
    void testThatTelevisionCanChangeChannelForward() {
        sony.turnOn();

        sony.changeChannelForward();
        sony.changeChannelForward();
        sony.changeChannelForward();
        assertEquals(3, sony.getChannel());
    }

    @Test
    void testThatTelevisionCantChangeChannelWhenSwitchedOn() {
        sony.turnOff();

        sony.changeChannelForward();
        sony.changeChannelForward();
        sony.changeChannelForward();
        assertEquals(0, sony.getChannel());
    }

    @Test
    void testThatTelevisionCanChangeChannelBackward() {
        sony.turnOn();
        for (int i = 0; i < 5; i++) {
            sony.changeChannelForward();
        }
        assertEquals(5, sony.getChannel());

        sony.changeChannelBackward();
        sony.changeChannelBackward();
        assertEquals(3, sony.getChannel());
    }
}