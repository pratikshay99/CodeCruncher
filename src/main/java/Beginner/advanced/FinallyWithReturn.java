package Beginner.advanced;

/** Output:
        Inside try block
        Finally block executed
        Try block executed
 * */
public class FinallyWithReturn {
    //🚨 Never use return inside finally unless you intentionally want to override all previous return values.
    public static void main(String[] args) {
        System.out.println(testMethod());
    }

    // If the finally block also has a return statement, it overrides any previous return from try or catch
    static String testMethod() {
        try {
            System.out.println("Inside try block");
            return "Try block executed";  // This return is stored, but not executed yet.
        } catch (Exception e) {
            return "Catch block executed";
        } finally {

            System.out.println("Finally block executed");  // Executes before returning the stored value.

            // return "Finally block executed";   //🚨 Overrides previous return.//OP: Finally block executed
            // Fix: Avoid return in finally
            // If you remove the return statement from finally, the original return value from try or catch will be preserved.
        }
    }
}
/*
🚨 Never use return inside finally unless you intentionally want to override all previous return values.
  🚨 If the finally block also has a return statement, it overrides any previous return from try or catch
------------------------------------------------------------------------------------------------
✔ Always executes, regardless of exceptions
✔ Used for cleanup operations like closing resources
✔ Does not execute only if JVM exits (System.exit(0))
✔ Runs even when return is present in try or catch
✔ finally executes before returning the value from try/catch.
✔ If finally has a return, it overrides all previous return values.
✔ Best practice: Avoid using return in finally to prevent confusion.
✅ Even though return is in try, finally still runs before returning.
-------------------------------------------------------------------------
Scenario	                    finally Executed?	Explanation
------------------------------------------------------------------------------
No exception occurs	                     ✅          	Runs after try
Exception occurs & caught	             ✅          	Runs after catch
Exception occurs & not caught	         ✅          	Runs before the program terminates
Return statement in try/catch	         ✅          	Runs after return
System.exit(0) is called	             ❌             JVM shuts down immediately
-------------------------------------------------------------------------------------
🔥Understanding finally with return
🌟 When a method contains a try-catch-finally block with return, the execution follows this order:
    1. try executes → If no exception, moves to return inside try.
    2. Before returning the value, finally executes.
    3. After finally completes, the method returns the value from try or catch.
*/