package ArraySnacks2;

public class SumOfArray {

    public int arrayTotals(int [] array) {
        int total = 0;
      for(int i = 0; i < array.length; i++)
          total += array[i];

      return total;
    }

    public boolean isEmpty() {
        return false;
    }
}
