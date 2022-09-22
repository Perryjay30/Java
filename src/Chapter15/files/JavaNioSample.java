package Chapter15.files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaNioSample {
    public static void main(String[] args) throws IOException {
        //java.nio classes Paths and files
        //and interfaces Path and DirectoryStream
        Path path = Paths.get("C:\\Users\\user\\Desktop");
        System.out.println("is a directory-> "+ Files.isDirectory(path));
        System.out.println("is a directory-> "+ Files.isHidden(path));

        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

        for (Path path1 : directoryStream) {
          if(!Files.isDirectory(path1));
          BufferedWriter writer = Files.newBufferedWriter(path1);
          writer.write("Hello World");
          writer.close();
        }
    }
}
