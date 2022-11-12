package InterviewQuestionsPractice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EndOfArrayElement {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5};
        elementRotation2(nums);
//        endElement();
    }

    private static void endElement() {
        System.out.println("Enter the length of the array: ");
        int number = input.nextInt();
        int [] arr = new int[number+1];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < number; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Add an element to the end of the array: ");
        arr[number] = input.nextInt();
        System.out.println("Array after inserting " + arr[number]);
        for (int i = 0; i < number+1; i++)
            System.out.print(" " + arr[i]);

    }

    private static void elementRotation(int [] nums) {
        System.out.println(Arrays.toString(nums));
        System.out.println("Enter the number of left rotation: ");
        int putNumber = input.nextInt();
        for (int j = 0; j < putNumber; j++) {
            int first = nums[0];
            for (int i = 0; i < nums.length-1; i++) {
                nums[i] = nums[i+1];
            }

            nums[nums.length-1] =  first;
        }

        System.out.println("After left rotation: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
    }

    //Another method
    private static void elementRotation2(int [] nums) {
        List<Integer> num1 = new ArrayList<>();
        for (int number : nums) {
            num1.add(number);
        }
        System.out.println(num1);

        num1.remove(0);
        num1.remove(0);
        num1.add(3, 1);
        num1.add(4, 2);
        System.out.println("After left rotation: ");
        System.out.println(num1);
    }

}
