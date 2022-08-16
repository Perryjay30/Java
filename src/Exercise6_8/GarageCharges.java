package Exercise6_8;

import java.util.Scanner;

public class GarageCharges {

    public static void main(String[] args) {
        int customer = 1;
        int hoursParked = 0;
        float parkingCharges = 0;
        float currentCharges = 0;

        Scanner input = new Scanner(System.in);
        for(int i = 0; i <= 4; i++) {
            System.out.printf("Enter number of hours parked for %d%n", customer);
            hoursParked = input.nextInt();
            System.out.printf("Enter yesterday's parking charges for %d%n", customer);
            parkingCharges = input.nextFloat();
            System.out.printf("Enter current charges of %d%n", customer);
            currentCharges = input.nextFloat();

            calculateCharges(3);
            customer++;
        }
    }

    public static void calculateCharges ( int hoursParked){
        double charges = 2.00;
        charges += (hoursParked - 3) * 0.50;
        if (charges > 10.00) {
            charges = 10.00;
            System.out.println("Total charge is " + charges);
        }
        System.out.println("Total charge is " + charges);
    }
}
