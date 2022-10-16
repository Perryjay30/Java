package Exercise8_11;

public class ComplexNumbers {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumbers(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumbers() {}


    public static void main(String[] args) {
        ComplexNumbers cp1 = new ComplexNumbers(9.0, 13.2);
        ComplexNumbers cp2 = new ComplexNumbers(15.7, 12.9);

        System.out.println(addComplexNumbers(cp1, cp2));
        System.out.println(subtractComplexNumbers(cp1, cp2));
    }


    public static ComplexNumbers addComplexNumbers(ComplexNumbers cp1, ComplexNumbers cp2) {
        return new ComplexNumbers(cp1.realPart + cp2.realPart, cp1.imaginaryPart + cp2.imaginaryPart);
//        ComplexNumbers complexNumbers = new ComplexNumbers();
//        complexNumbers.realPart = cp1.realPart + cp2.realPart;
//        complexNumbers.imaginaryPart = cp1.imaginaryPart + cp2.imaginaryPart;
//        return complexNumbers;
    }

    public static ComplexNumbers subtractComplexNumbers(ComplexNumbers cp1, ComplexNumbers cp2) {
        return new ComplexNumbers(cp1.realPart - cp2.realPart, cp1.imaginaryPart - cp2.imaginaryPart);
//        ComplexNumbers complexNumbers = new ComplexNumbers();
//        complexNumbers.realPart = cp1.realPart - cp2.realPart;
//        complexNumbers.imaginaryPart = cp1.imaginaryPart - cp2.imaginaryPart;
//        return complexNumbers;
    }

    public String toString() {
       return String.format("%.2f, %.2f", realPart, imaginaryPart);
    }
}
