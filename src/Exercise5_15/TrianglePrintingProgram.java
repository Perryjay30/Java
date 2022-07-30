package Exercise5_15;

public class TrianglePrintingProgram {
    public static void firstTriangle() {
        for(int line = 1; line <= 10; line++) {
            for(int asterick = 1; asterick <= line; asterick++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void secondTriangle() {
        for(int line = 1; line <= 10; line++) {
            for(int asterick = 10; asterick >= line; asterick--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void thirdTriangle() {
            for (int line = 1; line <= 10; line++) {
                for(int space = 1; space < line; space++) {
                    System.out.print(" ");
                }
                for (int asterick = 10; asterick >= line; asterick--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    public static void forthTriangle() {
        for(int line = 1; line <= 10; line++) {
            for(int space = 10; space > line; space--) {
                System.out.print(" ");
            }
            for(int asterick = 1; asterick <= line; asterick++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//       firstTriangle();
//        secondTriangle();
//            thirdTriangle();
                forthTriangle();
    }
}
