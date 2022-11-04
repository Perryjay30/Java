package CreditCardValidation;

public class InvalidCreditCardLength extends Throwable {
    public InvalidCreditCardLength(String message) {
        super(message);
    }
}
