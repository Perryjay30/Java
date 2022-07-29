package Exercise5_17;

import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        String studentName = "";

        for(int gradeCounter = 1; gradeCounter <= 5; gradeCounter++) {
            System.out.println("Enter student name: ");
            studentName = sc.next();
            System.out.println("Enter student grade: ");
            int grades = sc.nextInt();
            switch (grades / 10) {
                case 9 -> aCount++;
                case 8 -> bCount++;
                case 7 -> cCount++;
                case 6 -> dCount++;
                default -> System.out.println("No grades were entered");
            }
        }
        System.out.println("Number of grades for the five students: ");
        System.out.println("'A' = " + aCount);
        System.out.println("'B' = " + bCount);
        System.out.println("'C' = " + cCount);
        System.out.println("'D' = " + dCount);
    }
}
