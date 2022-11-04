package CreditCardValidation;

public class InvalidCreditCardException extends Throwable {
    public InvalidCreditCardException(String message) {
        super(message);
    }
}
