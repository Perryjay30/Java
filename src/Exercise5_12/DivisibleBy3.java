package Exercise5_12;

import java.util.Scanner;

public class DivisibleBy3 {

    public static void main(String[] args) {
        int sum = 0;
        for(int counter = 3; counter <=30; counter+=3) {
            System.out.println(counter);
            sum += counter;
        }
        System.out.println("The sum is: " + sum);
    }
}
