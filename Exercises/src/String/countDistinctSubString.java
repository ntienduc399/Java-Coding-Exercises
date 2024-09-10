package String;

import java.util.HashSet;

public class countDistinctSubString {
    public static int countDistinct(String s){
        HashSet<String> tem = new HashSet<>();
        String[] re= s.split("\\s+");
        for(int i=0; i<re.length; i++){
            tem.add(re[i].toLowerCase());
        }
        return tem.size();
    }
    public static void main(String[] args){
        System.out.println(countDistinct("28tech 28TECH 28tECH dev"));
    }
}
