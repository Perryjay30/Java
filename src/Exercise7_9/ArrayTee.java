package Exercise7_9;

import java.util.Scanner;

public class ArrayTee {
    public static void main(String[] args) {
//        int[][] tee = new int[2][3];
        int[][] tee = {{4, 8, 6}, {9, 3}};
//        Write access expressions for all the elements in row 1 of t.
        for (int row = 1; row < tee.length; row++) {
            for (int column = 0; column < tee[row].length; column++) {
                System.out.printf("%d%s", tee[row][column], " ");
            }
        }
        System.out.println(" ");

//        Write access expressions for all the elements in column 2 of t.
        for (int column = 2; column < tee.length; column++) {
            for (int row = 0; row < tee.length; row++) {
                System.out.printf("%d%s%n", tee[row][column], " ");
            }
        }
//        Write a single statement that sets the element of t in row 0 and column 1 to zero.
        tee[0][1] = 0;
//        Write individual statements to initialize each element of t to zero.
        tee[0][0] = 0;
        tee[0][1] = 0;
        tee[0][2] = 0;
        tee[1][0] = 0;
        tee[1][1] = 0;
//        Write a nested for statement that initializes each element of t to zero.
        for (int row = 0; row < tee.length; row++) {
            for (int column = 0; column < tee.length; column++) {
                tee[row][column] = 0;
            }
        }
//        Write a nested for statement that inputs the values for the elements of t from the user.
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < tee.length; i++) {
            int element = input.nextInt();
            for (int row = 0; row < tee.length; row++) {
                for (int column = 0; column < tee[row].length; column++) {
                    tee[row][column] = element;
                }
            }
        }

//        Write a series of statements that determines and displays the smallest value in t.
        int smallest = tee[0][0];
        for (int row = 0; row < tee.length; row++) {
            for (int column = 0; column < tee[row].length; column++) {
                if (smallest > tee[row][column])
                    smallest = tee[row][column];
            }

        }
        System.out.printf("The smallest value is: %s%d%n ", smallest);

//        Write a single printf statement that displays the elements of the first row of t.
        System.out.printf("%d%s%d%s%d%n", tee[0][0], " ", tee[0][1], " ", tee[0][2]);
//        Write a statement that totals the elements of the third column of t. Do not use iteration.
        System.out.printf("%d%n", tee[0][2] + tee[1][2]);

//        Write a series of statements that displays the contents of t in tabular format. List the
//        column indices as headings across the top, and list the row indices at the left of each row.
        System.out.println("       column[0]   column[1]   column[2]");
        System.out.print("row[0]");
        for (int row = 0; row < tee.length - 1; row++) {
            for (int column = 0; column < tee[row].length; column++) {
                System.out.print("     " + tee[row][column] + "      ");

            }
        }
        System.out.println(" ");
        System.out.print("row[1]");

        for (int row = 0; row < tee.length; row++) {
            for (int column = 0; column < tee[row].length; column++) {
                System.out.print("   " + tee[row][column] + "      ");
            }
        }
    }
}
