package BasicTask;

public class Factorials {
    public int factorsInaNumber(int num) {
        if(num < 0) {
            throw new ArithmeticException("Number must be greater than 0");
        }
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }
        return count;
    }


        public boolean isPrime(int number){
        boolean validation = false;

        if (factorsInaNumber(number) == 2) {
            validation = true;
        }
        return validation;
    }

    public int maxArray(int[] array) {
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (maxNum < array[i])
                maxNum = array[i];
        }
        return maxNum;
    }

    public int minArray(int[] array) {
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (minNum < array[i])
                minNum = array[i];
        }
        return minNum;
    }

    public int arraySumMax(int[] array) {
        int [] semicolon = new int[array.length];
        int total = 0;
        for(int i = 0; i < array.length; i++) {
            total += array[i];
        }

        for(int i = 0; i < array.length; i++) {
            semicolon[i] = total - array[i];
        }
        return maxArray(semicolon);
    }

    public int arraySumMin(int[] array) {
        int [] semicolon = new int[array.length];
        int total = 0;
        for(int i = 0; i < array.length; i++) {
            total += array[i];
        }

        for(int i = 0; i < array.length; i++) {
            semicolon[i] = total - array[i];
        }
        return minArray(semicolon);
    }
}
