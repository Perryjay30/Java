package SecondPattern;

public class PatternA {

    public static void main(String[] args) {

        for (int row = 1; row >= 1;) {
            for (int space = 1; space > row; ) {
                System.out.print("  ");
                space++;
            }
            int number = 1;
            for (int num = 1; num >= row; ) {
                System.out.printf("%d ", number);
                number++;
                num++;
            }
            System.out.println();
            row++;
        }
    }
}
