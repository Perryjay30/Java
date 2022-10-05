package Exercise6_29;

import java.util.Random;
import java.util.Scanner;

public class CoinTossing {

    private enum CoinFace {HEADS, TAILS}

    public static CoinFace flip() {
        Random rand = new Random();
        return CoinFace.values()[rand.nextInt(CoinFace.values().length)];
    }

    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number to toss coin or press -1 to cancel");
        int userInput = input.nextInt();

        while (userInput != -1) {
            flip();
            if(flip() == CoinFace.HEADS)
                heads++;
            else {
                tails++;
            }
            System.out.println("Enter any number to toss coin or press -1 to cancel");
            userInput = input.nextInt();
        }
        System.out.printf("%s%n%s%n", "Heads shows up", heads, "times");
        System.out.printf("%s%n%s%n", "Tails shows up", tails, "times");
    }

}
