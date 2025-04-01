package Beginner.Strings;

public class StringEndwith {
    public static void main(String[] args) {
        String s1 = "java by TechnoLamror";
        System.out.println(s1.endsWith("r"));           //true
        System.out.println(s1.endsWith("Lamror"));      //true
        System.out.println(s1.endsWith("lamror"));      //false

    }
}
//string width with specific char