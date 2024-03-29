package Chapter16Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms1 {
    public static void main(String[] args) {
        String [] colors = {"red", "white", "blue", "black"};
        List<String> list1 = Arrays.asList(colors);
        ArrayList<String> list2 = new ArrayList<>();

        list2.add("yellow");
        list2.add("red");
        list2.add("green");

        System.out.println("Before addAll, list2 contains: ");
        for (String s : list2) {
            System.out.printf("%s ", s);
        }

        Collections.addAll(list2, colors);
        System.out.printf("After addAll, list2 contains: ");

        for (String s : list2) {
            System.out.printf("%s", s);
        }

        int frequency = Collections.frequency(list2, "red");
        System.out.printf("Frequency of red in list2: %d%n", frequency);

        boolean disjoint = Collections.disjoint(list1, list2);
        System.out.printf("list1 and list2 %s elements in common%n", (disjoint ? "do not have" : "have"));

    }
}
