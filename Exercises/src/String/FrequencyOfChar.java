package String;

import java.util.Arrays;
import java.util.Comparator;

public class FrequencyOfChar {
    public static void findFrequency(String s){
        int[] tem = new int[256];
        Character[] copy = new Character[s.length()];
        for(int i=0; i<s.length();i++){
            tem[s.charAt(i)]++;
            copy[i] = s.charAt(i);
        }

        Arrays.sort(copy, Comparator.naturalOrder());
        for(int i=0; i<copy.length; i++){
            if(tem[copy[i]]!=0){
                System.out.println(copy[i] +" " + tem[copy[i]] );
                tem[copy[i]]=0;//reset its frequency not to print again;
            }
        }
        System.out.println();

    }
    public static void main(String[] args){
        findFrequency("abcdabcdA");//
        /* A 1
        a 2
        b 2
        c 2
        d 2*/

    }
}
