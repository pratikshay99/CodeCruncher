package dsa;

import java.util.HashMap;
//1. store value in string
// 2. hashmap store key-distinct character,  value-count
//3. print hashmap value
public class Hash {
    public static void main(String[] args) {
        String abc="abacddeiu";
        HashMap<Character, Integer> str = new HashMap<>();
         for(int i=0; i<abc.length(); i++){
             str.put(abc.charAt(i), str.getOrDefault(abc.charAt(i),0)+1);
//             if(str.containsKey(abc.charAt(i))){
//                 str.put(abc.charAt(i),(str.get(abc.charAt(i))+1));
//             }else{
//                 str.put(abc.charAt(i),1);
//             }

         }
        System.out.println(str);
    }
}
