package Exercise6_9;

public class RoundedNumber {

    public static void main(String[] args) {

        double num = Math.floor(93.7 + 0.5);
        double num2 = Math.floor(86.7 + 0.5);
        double num3 = Math.floor(77.6 + 0.5);

        System.out.printf("num rounded number is: %.2f%n original number is 93.7", num);
        System.out.printf("%n num2 rounded number is: %.2f%n original number is 86.7", num2);
        System.out.printf("%n num3 rounded number is: %.2f%n original number is 77.6", num3);
        }
    }
