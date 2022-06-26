package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

   private Calculator perry;

   @BeforeEach
   public void initialSetUp() {
     perry = new Calculator();

   }


   @Test
   public void test_addTwoNumbers() {
      int result = perry.addTwoNumbers(4, 2);
      Assertions.assertEquals(result, 6);
   }

   @Test
   public void test_subtractTwoNumbers() {
      int result = perry.subtractTwoNumbers(4, 2);
      Assertions.assertEquals(result, 2);
   }

   @Test
   public void test_divideTwoNumbers() {
      int result = perry.divideTwoNumbers(4, 2);
      Assertions.assertEquals(result, 2);
   }

   @Test
   public void test_multiplyTwoNumbers() {
      int result = perry.multiplyTwoNumbers(4, 2);
      Assertions.assertEquals(result, 8);
   }
   @Test
   public void test_test(){}
}