package Exercise7_14;

public class LengthArgumentList {
    public static double average(double ... array) {
     double total = 0.0;
        for(double num : array)
            total += num;

        return total / array.length;
    }

    public static void main(String[] args) {
        double num1 = 40.0;
        double num2 = 80.0;
        double num3 = 35.0;
        double num4 = 79.0;
        double num5 = 82.0;
        double num6 = 63.0;

        System.out.printf(" num1 = %.1f%n num2 = %.1f%n num3 = %.1f%n num4 = %.1f%n num5 = %.1f%n num6 = %.1f%n", num1, num2, num3, num4, num5, num6);
        System.out.printf("Average of num1 and num2 are %.1f%n", average(num1, num2));
        System.out.printf("Average of num1, num2 and num3 are %.1f%n", average(num1, num2, num3));
        System.out.printf("Average of num1, num2, num3 and num4 are %.1f%n", average(num1, num2, num3, num4));
        System.out.printf("Average of num1, num2, num3, num4 and num5 are %.1f%n", average(num1, num2, num3, num4, num5));
        System.out.printf("Average of num1, num2, num3, num4, num5 and num6 are %.1f%n", average(num1, num2, num3, num4, num5, num6));



    }
}
