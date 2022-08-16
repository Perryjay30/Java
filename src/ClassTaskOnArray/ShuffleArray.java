package ClassTaskOnArray;

import java.util.Random;

public class ShuffleArray {
//    public static void shuffle(int[] perry) {
//        int sim = perry.length;
//        Random random = new Random();
//        random.nextInt();
//        for (int i = 0; i < sim; i++) {
////            int change = i + (int)(Math.random() * (sim - i));
//            int change = i + random.nextInt(sim - i);
//            swap(perry, i, change);
//        }
//        for (int i : perry) {
//            System.out.println(i);
//        }
        public static void shuffle(int[] perry) {
            int sim = perry.length;
            for (int i = 0; i < sim; i++) {
           int change = i + (int)(Math.random() * (sim - i));

                int tempValue = perry[change];
                perry[change] = perry[i];
                perry[i] = tempValue;

        }

    }

//    private static void swap(int[] perry, int i, int change) {
//        int tempValue = perry[i];
//        perry[i] = perry[change];
//        perry[change] = tempValue;
//    }

    public static void main(String[] args) {
        int[] perry = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        shuffle(perry);
        for (int i : perry) {
            System.out.println(i);
        }
    }
}


