package Exercise14_7;

import java.util.Scanner;

public class PigLatinWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word and press enter: ");
        String sample = input.nextLine();

        String [] tokens = sample.split("");
        System.out.printf("Number of elements: %d%nThe tokens are:%n", tokens.length);

        for (String token : tokens) {
            System.out.print(printLatinWord(token));
        }
    }

    public static String printLatinWord(String word) {
      StringBuilder latinWord = new StringBuilder();
      latinWord.ensureCapacity(100);

//      char[] wordArray = word.toCharArray();
//        for (int i = 1; i < wordArray.length; i++) {
//            latinWord.append(wordArray[i]);
//        }
//        latinWord.append(wordArray[0]).append("ay");

        latinWord.append(word.substring(1)).append(word.charAt(0)).append("ay");
        return latinWord.toString();

    }
}

