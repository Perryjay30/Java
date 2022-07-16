package PerryTheProgrammer8;

import java.util.Scanner;

public class HighestScore {
    public static void main(String[] args) {
        int student = 1;
        String name = "";
        Scanner input = new Scanner(System.in);
        int highestScore = 0;
        System.out.print("Enter number of students in your class: ");
        int numberOfStudents = input.nextInt();

        while (student <= numberOfStudents) {
            System.out.print("Enter student's name: ");
            String studentName = input.next();
            System.out.print("Enter the score of student: ");
            int studentScore = input.nextInt();
            if (studentScore > highestScore) {
                highestScore = studentScore;
                name = studentName;
            }
            student++;
        }
        System.out.printf("The name of the student with the highest score is %s and the score is %d", name, highestScore);
    }
}
