package Beginner.basics;

public class FloydsTriangle {
    public static void main(String[] args) {
        System.out.println("Number of rows you want is n=5");
        int n = 5;
        int c = 1;
        //char c = 'A'; for alphabet---> c++
        for (int i = 1; i < n; i++) {       //row
            for (int j = 1; j <= i; j++) {         //column
                System.out.print(c++);
            }
            System.out.println();
        }
    }
}
/*
    1
    2 3
    4 5 6
    7 8 9 10
*/