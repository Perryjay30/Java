package Exercise8_16;

import Exercise6_27.GreatestCommonDivisor;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RationalNumbers {
    private final int numerator;
    private final int denominator;

    public RationalNumbers(int numerator, int denominator) {
        int gcd = GreatestCommonDivisor.gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator/ gcd;
    }

    public RationalNumbers() {
    this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }


    public static RationalNumbers add(RationalNumbers rn1, RationalNumbers rn2) {
        return new RationalNumbers((rn2.denominator * rn1.numerator) + (rn1.denominator * rn2.numerator), rn1.denominator * rn2.denominator);
    }

    public static RationalNumbers subtract(RationalNumbers rn1, RationalNumbers rn2) {
        return new RationalNumbers((rn2.denominator * rn1.numerator) - (rn1.denominator * rn2.numerator), rn1.denominator * rn2.denominator);
    }

    public static RationalNumbers multiply(RationalNumbers rn1, RationalNumbers rn2) {
        return new RationalNumbers(rn1.numerator * rn2.numerator, rn1.denominator * rn2.denominator);
    }

    public static RationalNumbers division(RationalNumbers rn1, RationalNumbers rn2) {
        return new RationalNumbers(rn1.denominator * rn2.numerator, rn1.numerator * rn2.denominator);
    }

    public String toString() {
        return String.format("%d / %d", numerator, denominator);
    }

    public String toFloatFormat(int scale) {
        float a = (float) getNumerator() / getDenominator();
        String floatAnswer = String.valueOf(a);
        BigDecimal bd = new BigDecimal(floatAnswer);
        return String.valueOf(bd.setScale(scale, RoundingMode.HALF_DOWN));
    }
}
