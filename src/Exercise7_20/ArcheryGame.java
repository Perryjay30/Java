package Exercise7_20;

import java.util.Random;

public class ArcheryGame {
    private static final Random random = new Random();
    public static void main(String[] args) {
        highestScore();
    }

    public static int [][] gamePointsCalculation(){
        int [][] gamePoints = new int[4][4];
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                gamePoints[i][j] = random.nextInt(10);
                sum += gamePoints[i][j];
                if(j == 3){
                    sum -= gamePoints[i][j];
                    gamePoints[i][j] = sum;
                }
            }
            sum = 0;

        }
        return gamePoints;
    }



    public static  void highestScore(){
        int [][] highestScore = gamePointsCalculation();
        int maxScore = 0;
        System.out.println("\t\t Chance1 \t\t\tChance2\t\t\t  Chance3\t\t\t\tTotal");
        for (int i = 0; i < 4; i++) {
            System.out.print("Player " + (i + 1));
            for (int j = 0; j < 4; j++) {
                System.out.printf("    %-15d", highestScore[i][j]);
            }
            System.out.println();

        }
        maxScore = getMaxScore(highestScore, maxScore);
        System.out.println("The Maximum score is: " + maxScore);

    }

    private static int getMaxScore(int[][] highestScore, int maxScore) {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 3; j < 4; j++) {
                if(highestScore[i][j] > maxScore){
                    maxScore = highestScore[i][j];
                    count = i;
                }
            }

        }
        System.out.println("player" + " " +(count + 1) + " " + "Wins");
        return maxScore;
    }


//    public void outputScores() {
//        System.out.printf("The scores are: %n%n");
//        System.out.print("          ");
//
//        for (int chance = 0; chance < gamePoints[0].length; chance++) {
//            System.out.printf("Chance%d ", chance + 1);
//        }
//
//        System.out.println("   Total");
//        for (int player = 0; player < scores.length; player++) {
//            System.out.printf("Player %2d", player + 1);
//
//            for (int chance : scores[player]) {
//                System.out.printf("%8d", chance);
//            }
//
//            double total = getSumOfScores(scores[player]);
//            System.out.printf("%9.2f%n", total);
//        }
//    }

}
