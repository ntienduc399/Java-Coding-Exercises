package String;

import java.util.Scanner;

public class reverseUpperLower {
    public static void reversed(String s){
        for(int i= s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }

    public static void upperS(String s){
        System.out.println(s.toUpperCase());
    }
    public static void lowerS(String s){
        System.out.println(s.toLowerCase());
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        reversed(s);
        upperS(s);
        lowerS(s);
    }
}
