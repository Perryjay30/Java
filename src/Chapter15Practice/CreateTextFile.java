package Chapter15Practice;

import java.io.FileNotFoundException;
import java.util.*;

public class CreateTextFile {
    public static void main(String[] args) throws FileNotFoundException {
        try (Formatter output = new Formatter("Clients details.txt")) {
            Scanner input = new Scanner(System.in);
            System.out.printf("%s%n%s%n? ", "Enter account number, first name, lastname and account balance.", "Enter end-of-file indicator to end input.");
            while (input.hasNext()) {
                try {
                    output.format("%d %s %s %.2f%n", input.nextInt(),input.nextInt(), input.nextInt(), input.nextDouble());
                }
                catch (NoSuchElementException elementException) {
                    System.err.println("Invalid input. Please try again.");
                    input.nextLine();
                }

                System.out.print("?");
            }
        }
        catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
            e.printStackTrace();
        }
    }
}




