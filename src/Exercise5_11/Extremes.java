package Exercise5_11;

import java.util.Scanner;

public class Extremes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maxNum = 0;
        int minNUm = 1_000_000;
        int sum = 0;


        int i = 0;
        while(i < 5){
            System.out.println("Enter an Integer: ");
            int number = sc.nextInt();
            if(number > maxNum) {
                maxNum = number;
            }
            if(number < minNUm) {
                minNUm = number;
            }
            i++;
            sum = maxNum + minNUm;
        }
        System.out.printf("The maximum number is %d%n", maxNum);
        System.out.printf(" The minimum number is %d%n", minNUm);
        System.out.printf("The sum of the maximum and minimum is %d",(maxNum + minNUm));
    }

}
