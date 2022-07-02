package Function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    @Test
    public void addNumberTest(){
        Kata kata = new Kata();
        int result = kata.addNumber(5,4);
        assertEquals(9, result);
    }

    @Test
    public void addThreeNumbersTest(){
        Kata kata = new Kata();
        int result = kata.addThreeNumbers(8, 9, 5);
        assertEquals(22, result);
    }
}
