package AraaySnacks5;

import java.util.Arrays;

public class Alternate {
    public boolean isNotEmpty() {
        return  true;
    }

    public boolean ArrayContainsString() {
        return true;
    }

    public short alternativeArray(String [] array1, String [] array2) {
      String [] result = new String[array1.length + array2.length];
      int count = 0;

      int counter = 0;
      for(int i = 0; i < array2.length; i++) {
          counter++;
          result[count] = array2[i];
          count++;
          result[count] = array1[i];
          count++;
      }
        System.out.println(counter);
        System.out.println(Arrays.toString(result));
        return 0;
    }

}
