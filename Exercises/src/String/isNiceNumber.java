package String;

import static java.lang.Math.abs;

public class isNiceNumber {
    public static boolean isNiceNum (int n){
        String s = n +""; //turn n into a string type;
        for(int i=1; i<s.length()-1; i++){
            int pre = s.charAt(i-1) -'0';
            int next = s.charAt(i+1) -'0';
            int current = s.charAt(i)-'0';
            if(abs(current-pre)!=1 || abs(current-next)!=1){
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args){
        System.out.println(isNiceNum(12345));//true;
        System.out.println(isNiceNum(244));//false;
    }
}
