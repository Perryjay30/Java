package FirstPattern;

import java.util.Arrays;

public class PatternD {
    public static void main(String[] args){

        for (int row = 6; row >= 1;){
            for (int space = 6; space > row;){
                System.out.print("  ");
                space--;
            }
            int number = 1;
            for (int num = 1; num <= row;){
                System.out.printf("%d ", number);
                number++;
                num++;
            }
            System.out.println();
            row--;
        }
    }
}
