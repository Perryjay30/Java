package Exercise5_24;

public class DiamondPrintingProgram {
    public static void main(String[] args) {
        for(int line = 1; line <= 7; line++) {
            for(int space = 1; space <= 7 - line; space++) {
                System.out.print(" ");
            }
            for(int counter = 1; counter <= line * 2 - 1; counter++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int line = 7 - 1; line > 0; line--) {
            for(int space = 1; space <= 7 - line; space++) {
                System.out.print(" ");
            }
            for(int counter = 1; counter <= line * 2 - 1; counter++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
