package Beginner;
/**-for loop instead of while: Idiomatic for a fixed-bound iteration; increment can't be "forgotten"
 -String[] args instead of String args[]: rather than c style	Modern Java array declaration syntax
 -Renamed sb, lg, sm → lowerCase, upperCase, digits, specialChars	Self-documenting; no ambiguity about what each builder holds
 -XXX Everything crammed in main,
 -Manual range checks vs Character.isLowerCase/isUpperCase/isDigit — using the manual ch >= 'a' && ch <= 'z' is fine for a beginner but at 4 YOE, interviewers expect you to know the standard library.
 -System.out.printf with %n	Cleaner than + concatenation; %n is platform-independent newline (vs hardcoded \n)
 */
public class SeparationFromString {
    public static void main(String[] args) {
        String input = "112abcdABC@#@";
        classifyCharacters(input);
    }

    private static void classifyCharacters(String s) {
        StringBuilder lowerCase = new StringBuilder();
        StringBuilder upperCase = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLowerCase(ch)) {
                lowerCase.append(ch);
            } else if (Character.isUpperCase(ch)) {
                upperCase.append(ch);
            } else if (Character.isDigit(ch)) {
                digits.append(ch);
            } else {
                specialChars.append(ch);
            }
        }

        printResult(lowerCase, upperCase, digits, specialChars);
    }

    private static void printResult(StringBuilder lowerCase, StringBuilder upperCase,
                                    StringBuilder digits, StringBuilder specialChars) {
        System.out.printf(
                "Small: %s%nLarge: %s%nNumbers: %s%nSpecial characters: %s%n",
                lowerCase, upperCase, digits, specialChars
        );
    }

/** Approcah : Junior level **

   public static void main(String args[]){
       String s="112abcdABC@#@";
       int i=0;
       StringBuilder sb = new StringBuilder();
       StringBuilder lg= new StringBuilder();
       StringBuilder num = new StringBuilder();
       StringBuilder spl = new StringBuilder();

       while(i < s.length()){
           char ch= s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                sb.append(ch);
            }else if(ch >='A' && ch<='Z'){
                lg.append(ch);
            }else if(ch >='0' && ch<='9'){
                num.append(ch);
            }else{
                spl.append(ch);
            }
            i++;
       }
       System.out.println("Small: "+sb +"\nLarge: "+ lg+"\nNumbers: "+num+"\nSpecial characters: "+spl);
    }
 */

/** aproach basic junior level
    public static void main(String args[]){
        String s="12abcdABC@#@";
        int l=s.length()-1, i=0;
        //int[] small,large,numbers,spl;
        StringBuilder sm = new StringBuilder();
        StringBuilder large = new StringBuilder();
        StringBuilder num = new StringBuilder();
        StringBuilder spl = new StringBuilder();
        while(i<=l){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                sm.append(s.charAt(i));
            }else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                large.append(s.charAt(i));
            }else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                num.append(s.charAt(i));
            }else{
                spl.append(s.charAt(i));
            }
            i++;
        }
    System.out.println("Small: "+sm +"\nLarge: "+ large+"\nNumbers: "+num+"\nSpecial characters: "+spl);


    }
    **/
}

