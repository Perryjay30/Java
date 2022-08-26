package ArraySnacks6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTesterTest {
    PalindromeTester testing;

    @BeforeEach
    void alwaysStartWIthThis() {
        testing = new PalindromeTester();
    }

    @Test
    void testThatPalindromeTesterIsString() {
        String str = "hannah";
        assertTrue(testing.isString());
    }

    @Test
    void testThatStringIsPalindrome() {
        String str = "hannah";
        assertTrue(testing.isString());

        str = "madam";
        assertTrue(testing.isPalindrome(str));
        System.out.println("String is a Palindrome");
    }

    @Test
    void testThatStringIsNotPalindrome() {
        String str = "hannah";
        assertTrue(testing.isString());

        str = "school";
        assertFalse(testing.isPalindrome(str));
        System.out.println("String is not a Palindrome");
    }

}