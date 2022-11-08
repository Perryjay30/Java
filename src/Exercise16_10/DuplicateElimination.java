package Exercise16_10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElimination {
    public static void main(String[] args) {
        removingDuplicates();
    }

    private static void removingDuplicates() {
        String [] firstNames = {"Chris", "Ariana", "Daniella", "Tony", "Chris", "Ariana"};
        Set<String> firstNameSet = new HashSet<>(Arrays.asList(firstNames));
        for (String names : firstNameSet) {
            System.out.println(names);
        }

        String [] naming = firstNameSet.toArray(new String[0]);
        System.out.println("Elements at index 2: " + naming[2]);


    }
}
