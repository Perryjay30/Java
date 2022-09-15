package Exercise6_26;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
       digits();
    }
    public static int digits(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integers: ");
        int num = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();

        int total = num + num2 + num3 + num4;
        System.out.println(total);

        return total;

    }
}
