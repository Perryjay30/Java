package ArraySnack3;

public class ReversedArray {
    public boolean arrayIsFull() {
        return true;
    }
    public short arrayReversal(int[] arrayC) {
        for (int i = 0; i < arrayC.length; i++) {
            for (int j = i + 1; j < arrayC.length; j++) {
                int tempValue = 0;
                if (arrayC[i] < arrayC[j]) {
                    tempValue = arrayC[i];
                    arrayC[i] = arrayC[j];
                    arrayC[j] = tempValue;
                }
            }
        }
        for(int num : arrayC)
            System.out.print(num + " ");
        return 0;
    }
}
