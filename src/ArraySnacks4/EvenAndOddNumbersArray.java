package ArraySnacks4;

public class EvenAndOddNumbersArray {
    public boolean arrayIsEmpty() {
        return false;
    }
    public short evenArray(int [] evens) {
       for(int i = 0; i < evens.length; i++) {
           if(evens[i] % 2 == 0)
               System.out.print(evens[i] + " ");
       }
        System.out.println();
        return 0;
    }

    public short oddArray(int [] odd) {
        for(int j = 0; j < odd.length; j++) {
            if(odd[j] % 2 == 1)
                System.out.println(odd[j] + " ");
        }
        return 0;
    }
}
