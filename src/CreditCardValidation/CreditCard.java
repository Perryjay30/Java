package CreditCardValidation;

public class CreditCard {
    public static boolean isValidLength(String digits) throws InvalidCreditCardLength {
        if (digits.length() >= 13 && digits.length() <= 16) {
            return true;
        }
        throw new InvalidCreditCardLength("Credit card number must be between 13 and 16");
    }


    public static boolean isValidNumberForMasterCard(String digits) throws InvalidCreditCardException {
        for (int i = 0; i < digits.length(); i++) {
           if(digits.startsWith("5")) return true;
           else
               throw new InvalidCreditCardException(" Credit card number is invalid");
        }
        return false;
    }

    public static boolean isValidNumberForAmericanExpressCard(String digits) throws InvalidCreditCardException {
        for (int i = 0; i < digits.length(); i++) {
            if(digits.startsWith("37")) return true;
            else
                throw new InvalidCreditCardException(" Credit card number is invalid");
        }
        return false;
    }

    public static boolean isValidNumberForDiscoveryCard(String digits) throws InvalidCreditCardException {
        for (int i = 0; i < digits.length(); i++) {
            if(digits.startsWith("6")) return true;
            else
                throw new InvalidCreditCardException(" Credit card number is invalid");
        }
        return false;
    }

    public static boolean isValidNumberForVisaCard(String digits) throws InvalidCreditCardException {
        for (int i = 0; i < digits.length(); i++) {
            if (digits.startsWith("4")) return true;
            else
                throw new InvalidCreditCardException(" Credit card number is invalid");

        }
        return false;
    }



    public static long sumOfDigitsFromTheRight(String cardNumber) {
      long sum = 0;
      String value = "";
        for (int i = cardNumber.length()-2; i >= 0; i-=2) {
            value = String.valueOf(cardNumber.charAt(i));
            long answer = Long.parseLong(value) * 2;
            sum += getAnswer(answer);
        }
        return sum;
    }

    private static long getAnswer(long number) {
        if (number < 9) return number;
        return addDoubleDigits(number);
    }

    public static long addDoubleDigits(long number) {
        long divide = number / 10;
        long remainder = number % 10;
        return divide + remainder;
    }

    public static long sumOfOddDigitsFromTheLeft(String cardNumber) {
        long sum = 0;
        String value = "";
        for (int i = cardNumber.length() - 1; i >= 0; i -= 2) {
           value = String.valueOf(cardNumber.charAt(i));
            long answer = Long.parseLong(value) * 2;
            sum += getAnswer(answer);
        }
        return sum;
    }

    public static long add (String cardNumber) {
        return sumOfOddDigitsFromTheLeft(cardNumber) + sumOfDigitsFromTheRight(cardNumber);
    }

    public static boolean isValidCreditCard(String cardNumber) throws InvalidCreditCardException, InvalidCreditCardLength {
        if ((!isValidLength(cardNumber)) && (add(cardNumber) % 10 == 0)) return true;
        else
            throw new InvalidCreditCardException("Credit card is invalid");
    }
}

