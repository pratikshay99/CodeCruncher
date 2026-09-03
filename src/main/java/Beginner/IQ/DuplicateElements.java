package Beginner.IQ;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1,5};
//1. using hashset
        Set<Integer> seen= new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();

        for(int num: arr){
            if(!seen.add(num)){
                duplicate.add(num);
                //System.out.println(num); //either store in duplicates or directly print dup element
            }
        }
        System.out.println(duplicate);

//2. using stream
        //Set<Integer> dup=
    }
}
