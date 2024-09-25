package String;

import java.util.HashMap;

public class anagram {
    public static int isAnagram(String a, String b){
        if(a.length() != b.length()){return 0;}
        HashMap<Character, Integer> tem = new HashMap<>();
        for(int i=0; i< a.length(); i++){
            if(!tem.containsKey(a.charAt(i))){
                tem.put(a.charAt(i),1);
            }else{
                tem.put(a.charAt(i),tem.get(a.charAt(i))+1);
            }
        }
        for(int j=0; j<b.length(); j++){
            if(!tem.containsKey(b.charAt(j))){return 0;}
            else{
                tem.put(b.charAt(j),tem.get(b.charAt(j))-1);
                if(tem.get(b.charAt(j))==0){
                    tem.remove(b.charAt(j));
                }
            }
        }
        return 1;
    }
    public static void main(String[] args){
        System.out.println(isAnagram("sit", "its"));//1
        System.out.println(isAnagram("sit", "ids"));//0
        System.out.println(isAnagram("bit", "big"));//0
        System.out.println(isAnagram("bit", "bit"));//1
        System.out.println(isAnagram("bog", "boo"));//0

    }
}
