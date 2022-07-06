package ClassTask;

import java.util.Scanner;

public class LoopTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int score = 0;
        int counter;

        for(counter = 1; counter <= 6; counter++) {
            System.out.println("Enter your score");
            score = input.nextInt();

        switch(score/10) {
            case 9:
                System.out.println("Grade 9");
                break;
            case 6:
                System.out.println("Grade 6");
                break;
            case 5:
                System.out.println("Grade 5");
                break;
            case 4:
                System.out.println("Grade 4");
                break;
            case 3:
                System.out.println("Grade 3");
                break;
            case 2:
                System.out.println("Grade 2");
                break;
            default:
                System.out.println("Invalid option");
        }

        }

    }
}
