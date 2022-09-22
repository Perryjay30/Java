package Chapter15.IOstreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamSample {
    public static void main(String[] args) {
        String [] cars = {"Honda","Toyota", "Peugeot","Volvo"};
        try(FileOutputStream fos = new FileOutputStream("cars.txt");
            PrintStream printStream = new PrintStream(fos)) {
           System.setOut(printStream);
           for(String car : cars) {
               System.out.println(car);
           }
            System.out.println("Unicorns");
        }catch(IOException exception) {
            exception.printStackTrace();
        }
    }
}
