package file_handling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {

        String filePath = "example.txt";

        try {
            FileInputStream inputStream = new FileInputStream(filePath);
            int i = inputStream.read();
            System.out.println((char) i);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream inputStream2 = new FileInputStream(filePath);
            int i = 0;
            while ((i = inputStream2.read()) != -1) {

                System.out.print((char) i);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
