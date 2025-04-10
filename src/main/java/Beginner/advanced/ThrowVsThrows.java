package Beginner.advanced;

import java.io.IOException;

public class ThrowVsThrows {
    // This method declares that it might throw an IOException
    public void readFile() throws IOException {
        // Actually throwing an exception
        // You can comment out throw line to test: it's optional at runtime
        //// ❌ Not clean — throws declared but never thrown
        //"Using throws without throw is allowed, but it's not clean code.
        //It adds unnecessary noise unless you plan to throw that exception or override a method that declares it."
        throw new IOException("File not found!");
    }

    public static void main(String[] args) {
        ThrowVsThrows obj = new ThrowVsThrows();
        try {
            obj.readFile();
        } catch (IOException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
