package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class sortNumInS {
    public static void sortNum(int n){
        String s = n+"";
        int[] tem = new int[s.length()];
        int start = 0;
        while(n!=0){
            tem[start] = (n%10);
            n /=10;
            start++;
        }
        Arrays.sort(tem);
        String t ="";
        for(int x: tem){
            if(x!=0){
                t += x;
            }
        }
        System.out.println(t);
    }
    public static void main(String[] args){
        sortNum(999968677);//667789999
        sortNum(10);//1
    }
}
