package Exercise6_16;

import java.util.Scanner;

public class Multiples {
    Scanner input = new Scanner(System.in);
    public static boolean isMultiple(int num, int num2) {
       if(num2 % num == 0) {
           return true;
       } else {
           return false;
       }
    }

    public static void main(String[] args) {
        System.out.println(isMultiple(8,16));
        System.out.println(isMultiple(7,49));
        System.out.println(isMultiple(12,159));
        System.out.println(isMultiple(210,536));
        System.out.println(isMultiple(6,240));
    }
}
