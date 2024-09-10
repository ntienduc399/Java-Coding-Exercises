package String;

import java.util.Arrays;
import java.util.Comparator;

public class increasingAndDecreasingOrder {
    public static void increasingAndDecreasing(String s){
        Character [] tem = new Character[s.length()];
        for(int i=0; i<s.length(); i++){
            tem[i] = s.charAt(i);
        }
        //increasing order;
        Arrays.sort(tem, Comparator.naturalOrder());
        StringBuilder increasing = new StringBuilder();
        for(Character x : tem){
            increasing.append(x);
        }
        System.out.println(increasing.toString());
        //decreasing order
        StringBuilder decreasing = new StringBuilder();
        Arrays.sort(tem, Comparator.reverseOrder());
        for(Character x : tem){
            decreasing.append(x);
        }
        System.out.println(decreasing.toString());

    }
    public static void main(String[] args){
        increasingAndDecreasing("wFJvCFumWtOt7U"); //7CFFJOUWmttuvw
        // wvuttmWUOJFFC7

    }
}
