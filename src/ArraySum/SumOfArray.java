package ArraySum;

public class SumOfArray {
    public static void main(String[] args) {

        int[] numbers = {30, 24, 52, 12, 26, 43, 10};
        int total = 0;
        for (int counter = 0; counter < numbers.length; counter++) {
            total += numbers[counter];
        }

            System.out.printf("Total of numbers element: %d%n", total);
    }
}
