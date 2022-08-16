package ClassTaskOnArray;

import java.util.Arrays;

public class ArrayTask {
    public static void main(String[] args) {
        int[] array = {60, 30, 90, 20, 50, 80, 70};
        ArrayTask.sort(array);

    }

    public static void sort(int[] array) {
        for (int num = 0; num < array.length; num++) {
            for (int number = num + 1; number < array.length; number++) {
                int tempValue = 0;
                if (array[num] > array[number]) {
                    tempValue = array[num];
                    array[num] = array[number];
                    array[number] = tempValue;
                }
            }
        }
        System.out.println(Arrays.toString(array));
//        for(int i : array) {
//            System.out.print(i + " ");
//        }
    }
}
