package JavaIOPlay;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class test {
    public static void main(String[] args) throws IOException {
        int c;
        try {
            InputStream in = new LowercaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("src/JavaIOPlay/test.txt")
                    )
            );
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
