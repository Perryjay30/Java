package Exercise6_10;

public class RoundingNumberMethods {

    public static void roundNumbersToInteger() {
        double number = Math.floor(56.9 + 0.5);
        System.out.println("Original number for is 56.9, rounded number is:" + number);
    }

    public static void roundNumberToTenths() {
        double number = Math.floor(12.8 * 10 + 0.5);
        System.out.println("Original number is 12.8, rounded number is:" + number);
    }

    public static void roundNumberToHundredths() {
        double number = Math.floor(45.5 * 100 + 0.5);
        System.out.println("Original number is 45.5,rounded number is:" + number);
    }

    public static void roundNumberToThousandths() {
        double number = Math.floor(89.3 * 1000 + 0.5);
        System.out.println("Original number is 89.3, rounded number is:" + number);
    }

    public static void main(String[] args) {
        roundNumbersToInteger();
        roundNumberToTenths();
        roundNumberToHundredths();
        roundNumberToThousandths();
    }
}
