import java.io.*;

public class Main {

    public static void main(String[] args) {
        String path;
        File file = new File("1.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (InputStream fileInputStream = new FileInputStream(file)) {
            int scanned;
            do {
                scanned = fileInputStream.read();
                System.out.print((char)scanned);
            } while (scanned != -1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
