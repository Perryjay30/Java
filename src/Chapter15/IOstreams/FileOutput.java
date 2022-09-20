package Chapter15.IOstreams;
import java.io.*;

import java.io.PrintWriter;

public class FileOutput {
    public static void main(String[] args) {
        try(java.io.FileOutputStream output = new FileOutputStream("text.txt");
            PrintWriter writer = new PrintWriter(output)) {
            writer.println("We are Africans!!!");
            writer.println("We are Unicorns!!!");

        } catch (IOException exception){
            System.out.println(exception.getLocalizedMessage());
        }
    }
}
