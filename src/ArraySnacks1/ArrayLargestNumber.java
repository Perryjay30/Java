package ArraySnacks1;

import java.util.Arrays;

public class ArrayLargestNumber {

    public boolean isNotEmpty() {
        return true;
    }
    public int largestNumberInArray(int [] array) {
        int largestNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (largestNumber < array[i])
                largestNumber = array[i];
        }

      return largestNumber;
    }

}
