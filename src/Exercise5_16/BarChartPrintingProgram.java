package Exercise5_16;

import java.util.Scanner;

public class BarChartPrintingProgram {

    public static void main(String[] args) {
        Scanner barchart = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int firstNumber = barchart.nextInt();
        System.out.println("Enter second Number: ");
        int secondNumber =  barchart.nextInt();
        System.out.println("Enter third Number: ");
        int thirdNumber =  barchart.nextInt();
        System.out.println("Enter fourth Number: ");
        int fourthNumber =  barchart.nextInt();
        System.out.println("Enter fifth Number: ");
        int fifthNumber =  barchart.nextInt();

        if(firstNumber >= 1 && firstNumber <= 30) {
            for(int i = 0; i < firstNumber; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        if(secondNumber >= 1 && secondNumber <= 30) {
            for(int i = 0; i < secondNumber; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        if(thirdNumber >= 1 && thirdNumber <= 30) {
            for(int i = 0; i < thirdNumber; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        if(fourthNumber >= 1 && fourthNumber <= 30) {
            for(int j = 0; j < fourthNumber; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        if(fifthNumber > 1 && fifthNumber <= 30) {
            for(int i = 0; i < fifthNumber; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
