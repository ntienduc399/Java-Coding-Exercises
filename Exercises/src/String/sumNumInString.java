package String;

import java.util.Scanner;

public class sumNumInString {
    public static int sumNum (String s){
        int sum = 0;
        for(int i=0; i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                sum += s.charAt(i)-'0'; //turn char into int type;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(sumNum(s));
    }

}
