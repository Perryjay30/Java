package SecondPattern;

public class PatternA {

    public static void main(String[] args) {

        for (int row = 6; row >= 1;) {
            for(int space = 6; space < row;) {
                System.out.print("  ");
                space--;
            }

            int number = 1;
            for(int num = 1; num <= row;) {
                System.out.printf("%d ", number);
                num++;
                number++;
            }

            System.out.println();
            row--;

        }
    }
}
