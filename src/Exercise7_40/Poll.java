package Exercise7_40;

import java.util.Arrays;

public class Poll {
    private String [] topics = {"financial issues", "Psychological issues", "Gender issues", "Hunger issues", "Breakfast issues"};

    private int [][] responses = new int[5][10];
    private double averageRating;

     public void calculateAverage(int... polarNumbers) {
         int totalOfRatings = 0;
         for(int polarNumber : polarNumbers) {
             totalOfRatings+=polarNumber;
         }
         averageRating = totalOfRatings / polarNumbers.length;
     }

     public int getHighestPoint(int [] polarNumbers) {
         int highestNumber = polarNumbers[0];
         for(int i = 0; i < polarNumbers.length; i++)
             if(polarNumbers[i] > highestNumber) {
                 highestNumber = polarNumbers[i];
             }
         return highestNumber;
     }

    public int getLowestPoint(int[] polarNumbers) {
         int lowestNumber = polarNumbers[0];
         for(int i = 0; i < polarNumbers.length; i++)
             if(polarNumbers[i] < lowestNumber) {
                 lowestNumber = polarNumbers[i];
             }
         return lowestNumber;
    }

    public String[] getTopics() {
        return topics;
    }

    public void setTopics(String[] topics) {
        this.topics = topics;
    }

    public int[][] getResponses() {
        return responses;
    }

    public void setResponses(int[][] responses) {
        this.responses = responses;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public void displayTabularReport() {
         String header = String.format("\t\t\t\t\t\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(header);
//        for (String topics : getTopics()) {
//            System.out.println(topics);
//        }
         for(int index = 0; index < responseDb().length; index++) {
             for(int secondIndex = 0; secondIndex < responseDb()[index].length; secondIndex++);
             System.out.printf("%s\t", getTopics()[index]);
             System.out.println(Arrays.toString(responseDb()[index]));
//             System.out.println();
//             for(int secondIndex = 0; secondIndex < getResponses()[index].length; secondIndex++);
             System.out.println();

         }
    }

    int[][] responseDb() {
         return responses;
    }

}
