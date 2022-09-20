package Chapter15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSample {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("C:\\Users\\user\\Desktop/text.txt")) {
            fileWriter.write("Just do it");
        }catch(IOException exception){
            exception.printStackTrace();
        }
    }
}
