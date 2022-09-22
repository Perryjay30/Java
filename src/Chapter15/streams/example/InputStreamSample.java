package Chapter15.streams.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamSample {
    public static void main(String[] args) {
       try(var bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
           String line = bufferedReader.readLine();
           int number = Integer.decode(line);
           System.out.println("my number is:: " + number);
       }catch (IOException | NumberFormatException exception) {
           System.err.println(exception.getMessage());
       }
    }
}
