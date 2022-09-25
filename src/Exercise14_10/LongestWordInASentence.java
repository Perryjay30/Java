package Exercise14_10;

import java.util.Scanner;

public class LongestWordInASentence {
    public static String collectSentence() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        return input.nextLine();
    }

    public static void main(String[] args) {
        String sentence = collectSentence();
        String [] word = sentence.split(" ");
        String longestWord = " ";
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() >= longestWord.length()){
                longestWord = word[i];
            }
        }
        System.out.println("The longest word in the sentence is: " + longestWord);
    }
}
