package Beginner.advanced;

public class SimpleExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
            /**Output: without try-catch
             Exception in thread "main" java.lang.ArithmeticException: / by zero
             at Beginner.advanced.SimpleExceptionHandling.main(SimpleExceptionHandling.java:5)
             */
        } catch (ArithmeticException e) {
            /**Output:with-try-catch:->
             Cannot divide by zero! */
            System.out.println("Cannot divide by zero!");
        }
    }
}
/**
 * 🔹 Key Concepts:
     * -Exception: An event that disrupts the program flow (e.g., NullPointerException, IOException).
     * -Checked Exceptions: Checked at compile-time (e.g., IOException, SQLException).
     * -Unchecked Exceptions: Occur at runtime (e.g., NullPointerException, ArithmeticException).
     * -try-catch: Wraps risky code in try, handles with catch.
     * -finally: Block that always executes (even if exception is not caught).
     * -throw: Manually throw an exception.
     * -throws: Declares exception that a method might throw.
 */