package String;

import java.util.Arrays;
import java.util.Comparator;

public class sortingByLengthOfSubString {
    public static void sortingByLength(String s){
        String[] tem = s.split("\\s+");
        Arrays.sort(tem, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() < o2.length()){
                    return -1;
                } else if( o1.length() == o2.length()){
                    return o2.compareTo(o1);
                }
                return 1;
            }
        });
        for(String x: tem){
            System.out.print(x+" ");
        }
    }
    public static void main (String[] args){
        sortingByLength("28tech dev c ");//c dev 28tech

    }
}
