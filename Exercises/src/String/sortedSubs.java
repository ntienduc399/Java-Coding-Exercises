package String;

import java.util.Arrays;
import java.util.Comparator;

public class sortedSubs {
    public static void sorted(String s){
        String[] tem = s.split("\\s+");
        /*Arrays.sort(tem, Comparator.naturalOrder());
        for(String x: tem){
            System.out.print(x+" ");
        }
        System.out.println();
        Arrays.sort(tem, Comparator.reverseOrder());
        for(String x: tem){
            System.out.print(x+" ");
        }
        System.out.println();*/
        Arrays.sort(tem, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for(String x: tem){
            System.out.print(x+" ");
        }
        System.out.println();
        Arrays.sort(tem, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        for(String x: tem){
            System.out.print(x+" ");
        }


    }
    public static void main(String[] args){
        sorted("8WNH8   ajw zzu ymlr krXih   Ts0K4 5Zd mcx9 ");
        //5Zd 8WNH8 Ts0K4 ajw krXih mcx9 ymlr zzu
        //zzu ymlr mcx9 krXih ajw Ts0K4 8WNH8 5Zd
    }
}
