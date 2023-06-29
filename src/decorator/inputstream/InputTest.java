package decorator.inputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

    public static void main(String[] args) {
        int character;
        try {

            InputStream inputStream = new BufferedInputStream(
                    new FileInputStream("./src/decorate/inputstream/resources/test.txt"));
            inputStream.mark(0);
            while ((character = inputStream.read()) >= 0) {
                System.out.print((char) character);
            }
            inputStream.reset();
            System.out.println();

            inputStream = new LowerCaseInputStream(inputStream);
            while ((character = inputStream.read()) >= 0) {
                System.out.print((char) character);
            }
            inputStream.reset();
            System.out.println();

            inputStream = new UpperCaseInputStream(inputStream);
            while ((character = inputStream.read()) >= 0) {
                System.out.print((char) character);
            }

            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
