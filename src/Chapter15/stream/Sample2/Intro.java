package Chapter15.stream.Sample2;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {
        DataInputStream dataInputStream = new DataInputStream(System.in);

        try{
            byte [] bytes = new byte[10];
            dataInputStream.readNBytes(bytes, 0, 8);
            System.out.println("byte array representation of input :: " + Arrays.toString(bytes));
            System.out.print("actual string rep:: ");
            for (byte b : bytes){
                System.out.print((char) b);

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
