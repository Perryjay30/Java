package InitArray;

import java.io.OptionalDataException;

public class InitArray {

    public static void main(String[] args) {

        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

        System.out.println("Values in array1 by row are");
        outputArray(array1);

        System.out.printf("%nValues in array2 by row are%n");
        outputArray(array2);
    }
    private static void outputArray(int[][] array1) {
        for (int row = 0; row < array1.length; row++) {
           for (int column = 0; column < array1[row].length; column++) {
               System.out.printf("%d  ", array1[row] [column]);
           }
            System.out.println();
        }
    }
}
