package file_handling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {

    final private static String FILE_PATH = "src/main/resources/example.txt";

    public static void main(String[] args) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            String s = "Welcome to javaTpoint.";
            byte[] b = s.getBytes();
            bufferedOutputStream.write(b);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            System.out.println("success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
