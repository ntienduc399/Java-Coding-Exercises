package String;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class smallestAndLargestFrequency {
    public static void findSmallestAndLargestFrequency(String s){
        TreeMap<Character, Integer> map = new TreeMap<>();
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        char max = ' ';
        char min = ' ';
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Character, Integer> entry: entrySet){
            char key = entry.getKey();
            int freq = entry.getValue();
            if(freq > maxFreq || (freq==maxFreq && key > max)){
                maxFreq = freq;
                max = key;
            }
            if(freq < minFreq || (freq==minFreq && key > min)){
                minFreq = freq;
                min = key;
            }

        }
        System.out.println(max  +" " + maxFreq);
        System.out.println(min  +" " + minFreq );
    }
    public static void main(String[] args){
        findSmallestAndLargestFrequency("qEQtEEuAQcSWfFRfWRnKKeCZeUYlSGrXWvOGqEXsWMxLRtQPxBMtEHdPGbGKvKFiQLxUSuSZtMIjXEhUZtAZdBInYLeHWfWUwCVo");
        //W 6
        //w 1
    }
}
