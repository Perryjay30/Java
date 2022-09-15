package Exercise7_12;

import java.util.Scanner;

public class DuplicateElimination {
    public static void duplicationRemoval(int n) {
//        if(n == 0 || n == 1) {
//            return n;
//        }
        Scanner input = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.println("enter a number between 10 and 100 inclusive");
        for (int k = 0; k < arr.length; k++) {
            arr[k] = input.nextInt();
            if (arr[k] < 10 || arr[k] > 100) {
                throw new IllegalArgumentException("Invalid input, number must be between 10 and 100");
            }

            int[] temp = new int[n];
            int j = 0;

            for (int i = 0; i < n - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    temp[j++] = arr[i];
                }
            }

            temp[j++] = arr[n - 1];
            for (int i = 0; i < j; i++) {
                arr[i] = temp[i];
            }

            for (int i = 0; i < arr.length - 1; i++)
                System.out.print(arr[i] + " ");
//            return j;
        }
    }


    public static void main(String[] args) {
        duplicationRemoval(10);
    }
}

