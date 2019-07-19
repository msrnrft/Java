package file_handling;

import java.io.FileOutputStream;


public class FileOutputStreamExample {

    public static void main(String[] args) {

        String filePath = "src/main/resources/example.txt";
        try {
            FileOutputStream outputStream = new FileOutputStream(filePath);
            outputStream.write(65);
            outputStream.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            FileOutputStream fout = new FileOutputStream(filePath);
            String s = "Welcome to javaTpoint.";
            byte[] b = s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
