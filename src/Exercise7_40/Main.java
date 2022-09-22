package Exercise7_40;

import java.util.Scanner;


public class Main {
    private static Poll polar = new Poll();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String [] topics = polar.getTopics();
        int numberOfTopics = topics.length;
        System.out.println("Welcome to Unicorns Polar's Poll");
        var response = "yes";
        while(response.equals("yes")) {
            for (int index = 0; index < numberOfTopics; index++) {
                System.out.println("rate " + topics[index]);
                int userRating = sc.nextInt();
                if (userRating < 1 || userRating > 10)
                    throw new InvalidUserRatingException("Please enter a valid rating");
                saveRating(index, userRating);
            }
            System.out.println("Continue?");
            response = sc.next();
        }
        System.out.println();
        polar.displayTabularReport();
    }

    private static void saveRating(int issueNumber, int userRating) {
        int[][] responseDb = polar.responseDb();
        responseDb[issueNumber][userRating-1] = responseDb[issueNumber][userRating-1]+1;
    }
}
