package basics;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFile {
    public static void main(String[] args) {
        // File path is passed as parameter
        File file = new File("C:\\Users\\pratu\\OneDrive\\Desktop\\PratikshaGit\\Java\\test.txt");
        // Double backquote is to avoid compiler interpret words like \test as \t (ie. as a escape sequence)
        //try(BufferedReader br = new BufferedReader(new FileReader("filenam.txt"))) {

        //A. using BufferedReader: Large Text Files: Use BufferedReader or Files.lines() for memory efficiency.
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //B. Binary Files: Use FileInputStream.
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\pratu\\OneDrive\\Desktop\\PratikshaGit\\Java\\test.bin");
            fos.write(new byte[]{0x48, 0x65, 0x6C, 0x6C, 0x6F});
            FileInputStream fis = new FileInputStream("C:\\Users\\pratu\\OneDrive\\Desktop\\PratikshaGit\\Java\\test.bin");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
                // Convert byte to character
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //C. Using Stream API (Java 8+)
        try {
            Files.lines(Path.of("C:\\Users\\pratu\\OneDrive\\Desktop\\PratikshaGit\\Java\\test.txt")).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
