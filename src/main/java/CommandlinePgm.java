/* package Beginner.basics
#Placing this class in a package or adding an import statement here will cause an error when running through the command prompt/terminal.
        Error: Could not find or load main class CommandlinePgm
        Caused by: java.lang.NoClassDefFoundError: Beginner.basics/CommandlinePgm (wrong name: CommandlinePgm)

 */
import java.util.Arrays;

public class CommandlinePgm {
    public static void main(String[] args) {

//        java CommandlinePgm 20
        System.out.println("Params: " + args);                   //# O/p -> Params: [Ljava.lang.String;@36baf30c... bcz args is an array
        System.out.println("Params: " + Arrays.toString(args)); //# O/p -> Params: [20]
        System.out.println(args[0]);                            // op -> 20

        //System.out.println("Sum Params: "+ (args[0]+args[1])); //java CommandlinePgm 20 -> java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
    }
}
