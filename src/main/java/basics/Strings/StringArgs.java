package basics.Strings;

/*This will only run through the IDE's configuration tab if the package is initialized. If we comment out the package basics, it will run through the command prompt (cmd) and not from the IDE. If the package basics are not commented out, it will only run through the IDE.
*/
public class StringArgs {
    public static void main(String[] args) {
        System.out.println(args[0] + args[1]);
        /*Output of above: If program Arguments->
          1 1 -> 11
          H p-> Hp
          Y 4 p-> Y4
         */
    }
}