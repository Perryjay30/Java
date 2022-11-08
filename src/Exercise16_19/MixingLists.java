package Exercise16_19;

import java.util.LinkedList;
import java.util.List;

public class MixingLists {
    public static void main(String[] args) {
        int [] numbers = {5, 4, 7, 8, 3};
        List<Integer> numList = new LinkedList<>();
        for (int num : numbers) {
            numList.add(num);
        }

        int [] number2 = {1, 2, 9, 6, 4, 3};
        List<Integer> numList2 = new LinkedList<>();
        for (int num : number2) {
            numList2.add(num);
        }

        numList.addAll(numList2);
        numList2 = null;
        printList(numList);
    }

    private static void printList(List<Integer> numList) {
        for (int nums : numList) {
            System.out.println(nums);
        }
    }


}
