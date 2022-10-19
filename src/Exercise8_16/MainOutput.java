package Exercise8_16;

public class MainOutput {
    public static void main(String[] args) {
        RationalNumbers rn1 = new RationalNumbers(1, 2);
        RationalNumbers rn2 = new RationalNumbers(1, 3);

        System.out.printf("%s + %s = %s%n", rn1, rn2, RationalNumbers.add(rn1, rn2));
        System.out.printf("%s - %s = %s%n", rn1, rn2, RationalNumbers.subtract(rn1, rn2));
        System.out.printf("%s * %s = %s%n", rn1, rn2, RationalNumbers.multiply(rn1, rn2));
        System.out.printf("%s / %s = %s%n", rn1, rn2, RationalNumbers.division(rn1, rn2));

        System.out.println();

        System.out.printf("%s + %s = %s%n", rn1, rn2, RationalNumbers.add(rn1, rn2).toFloatFormat(4));
        System.out.printf("%s - %s = %s%n", rn1, rn2, RationalNumbers.subtract(rn1, rn2).toFloatFormat(4));
        System.out.printf("%s * %s = %s%n", rn1, rn2, RationalNumbers.multiply(rn1, rn2).toFloatFormat(4));
        System.out.printf("%s / %s = %s%n", rn1, rn2, RationalNumbers.division(rn1, rn2).toFloatFormat(4));
    }

}
