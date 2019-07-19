package file_handling;

import java.io.FileOutputStream;


public class FileOutputStreamExample {

    private final static String FILE_PATH = "src/main/resources/example.txt";

    public static void main(String[] args) {


        try {
            FileOutputStream outputStream = new FileOutputStream(FILE_PATH);
            outputStream.write(65);
            outputStream.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            FileOutputStream fout = new FileOutputStream(FILE_PATH);
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
