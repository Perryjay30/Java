package Chapter4;

import java.util.Scanner;

public class Mileage {

    public static void main(String[] args) {
      int trips = 1;
      int totalMilePerGallon = 0;
      Scanner perry = new Scanner(System.in);
        System.out.printf("Enter mile for trip %d:", trips);
        int mile = perry.nextInt();

        while(mile != -1) {
            System.out.printf("Enter gallon for trip %d:", trips);
            int gallon = perry.nextInt();
            float milesPerGallon = (float) mile / gallon;
            System.out.printf("Miles per gallon is %.2f:", milesPerGallon);
            totalMilePerGallon += milesPerGallon;
            trips++;
            System.out.printf("\nEnter mile for trip %d:", trips);
            mile = perry.nextInt();
        }
        System.out.printf("Mile combined and gallon combined for all trips is %d ", totalMilePerGallon);
    }
}
