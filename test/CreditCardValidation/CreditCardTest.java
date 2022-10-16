package CreditCardValidation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {
    CreditCard masterCard;
    CreditCard visaCard;
    CreditCard americaExpressCard;
    CreditCard discoveryCard;

    @BeforeEach
    void alwaysStartWithThis() {
        masterCard = new CreditCard();
        visaCard = new CreditCard();
        americaExpressCard = new CreditCard();
        discoveryCard = new CreditCard();
    }

    @Test
    void testThatThereIsACreditCard() {
        assertNotNull(masterCard);
        assertNotNull(visaCard);
        assertNotNull(americaExpressCard);
        assertNotNull(discoveryCard);
    }


    @Test
    void testThatCreditCardNumberLengthIsValid() throws InvalidCreditCardLength {
        boolean lengthIsValid = CreditCard.isValidLength("435897605443283");
       assertTrue(lengthIsValid);
    }

    @Test
    void testThatVisaCardNumberIsValid() throws InvalidCreditCardException {
        boolean numberIsValid = CreditCard.isValidNumberForVisaCard("435897605443283");
        assertTrue(numberIsValid);
    }

    @Test
    void testThatMasterCardNumberIsValid() throws InvalidCreditCardException {
        boolean numberIsValid = CreditCard.isValidNumberForMasterCard("543769802443283");
        assertTrue(numberIsValid);
    }

    @Test
    void testThatDiscoveryCardNumberIsValid() throws InvalidCreditCardException {
        boolean numberIsValid = CreditCard.isValidNumberForDiscoveryCard("615643209244328");
        assertTrue(numberIsValid);
    }

    @Test
    void testThatAmericaExpressCardNumberIsValid() throws InvalidCreditCardException {
        boolean numberIsValid = CreditCard.isValidNumberForAmericanExpressCard("374784980202681");
        assertTrue(numberIsValid);
    }



    @Test
    void testThatCreditCardNumberThrowsAnExceptionForInvalidNumber() {
       assertThrows(InvalidCreditCardException.class, () -> CreditCard.isValidNumberForAmericanExpressCard("135897605443283"));
       assertThrows(InvalidCreditCardException.class, () -> CreditCard.isValidNumberForDiscoveryCard("40927760540122458"));
       assertThrows(InvalidCreditCardException.class, () -> CreditCard.isValidNumberForMasterCard("615643209765400"));
       assertThrows(InvalidCreditCardException.class, () -> CreditCard.isValidNumberForVisaCard("374784980202681"));

    }

    @Test
    void testTheSumOfDigitsOfCardNumberSelectedFromTheRight() {
        long sumOfDigits = CreditCard.sumOfDigitsFromTheRight("3785936674281594");
        assertEquals(45, sumOfDigits);
    }

    @Test
    void testTheSumOfDigitsOfCardNumberSelectedFromTheLeft() {
        long sumOfDigits = CreditCard.sumOfOddDigitsFromTheLeft("3785936674281594");
        assertEquals(39, sumOfDigits);
    }

    @Test
    void testThatTheSumOfDigitsOfCardNumberSelectedFromTheRightAndRight() {
        long allSum = CreditCard.add("3785936674281594");
        assertEquals(84, allSum);
    }

    @Test
    void testThatCreditCardIsValid() throws InvalidCreditCardException, InvalidCreditCardLength {
        boolean validate = CreditCard.isValidCreditCard("3785936674081594");
        assertTrue(validate);
    }

    @Test
    void testThatCreditCardThrowsAnExceptionWhenCreditCardIsInvalid() {
        assertThrows(InvalidCreditCardException.class, () -> CreditCard.isValidCreditCard("3785936674281594"));
    }
}