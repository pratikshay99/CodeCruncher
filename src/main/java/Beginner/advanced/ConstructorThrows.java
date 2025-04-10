package Beginner.advanced;

import java.io.IOException;

class FileHandler {
    public FileHandler() throws IOException {
        // Simulate a checked exception
        throw new IOException("Failed to initialize file handler");
    }
}

public class ConstructorThrows {
    public static void main(String[] args) {
        try {
            FileHandler fh = new FileHandler();
        } catch (IOException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
/*
If a constructor declares a checked exception, you must handle it (try-catch or throws) when creating the object.
 */