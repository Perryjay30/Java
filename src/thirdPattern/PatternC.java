package thirdPattern;

public class PatternC {

    public static void main(String[] args) {

        for (int row = 1; row <= 6; row++) {
            int number = 1;
            for (int counter = 1; counter <= row; counter++) {
                System.out.printf("%d ", number);
                number++;
            }

            System.out.println();

        }
    }
}
