package Exercise14_4;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str = input.next();
        System.out.println("Enter the second string: ");
        String team = input.next();

        if (str.regionMatches(true, 0, team, 0, 7)) {
            System.out.println("Characters of str and team match with case ignored");
        }
        else {
            System.out.println("Characters of str and team does not match");
        }

    }
}