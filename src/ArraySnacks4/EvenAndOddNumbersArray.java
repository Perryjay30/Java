package ArraySnacks4;

public class EvenAndOddNumbersArray {

    public static void main(String[] args) {
        int [] evens = {432, 656, 42, 21, 901, 876, 57, 22, 78, 63, 12, 50};
        int [] odd = {432, 656, 42, 21, 901, 876, 57, 22, 78, 63, 12, 50};
        EvenAndOddNumbersArray.evenArray(evens);
        EvenAndOddNumbersArray.oddArray(odd);
    }
    public static void evenArray(int [] evens) {
       for(int i = 0; i < evens.length; i++) {
           if(evens[i] % 2 == 0)
               System.out.print(evens[i] + " ");
       }
        System.out.println();
    }

    public static void oddArray(int [] odd) {
        for(int j = 0; j < odd.length; j++) {
            if(odd[j] % 2 == 1)
                System.out.println(odd[j] + " ");
        }
    }
}
