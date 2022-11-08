package Exercise16_7;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class SortingSentence {
    public static void main(String[] args) {
        createSet();
    }

    private static void createSet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        String setSentence = sentence.toLowerCase();

        String [] tokens = setSentence.split(" ");

        TreeSet<String> treeSentence = new TreeSet<>(Arrays.asList(tokens));
        for (String token : treeSentence) {
            System.out.println(token);
        }


    }
}
