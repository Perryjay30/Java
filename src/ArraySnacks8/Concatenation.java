package ArraySnacks8;

import java.util.Arrays;

public class Concatenation {
    public static void concatenateArray(String [] array1, String [] array2) {
        String [] result = new String[array1.length + array2.length];
        for(int i = 0; i < array1.length; i++)
            result[i] = array1[i];
        for(int i = 0; i < array2.length; i++)
            result[array1.length +i] = array2[i];

//        for(String element : result)
//            System.out.println(element);
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        String [] array1 = {"1", "2", "3"};
        String [] array2 = {"a", "b", "c"};
        concatenateArray(array1, array2);
    }
}
