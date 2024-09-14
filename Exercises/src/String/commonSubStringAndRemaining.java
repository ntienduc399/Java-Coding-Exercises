package String;

import java.util.*;

public class commonSubStringAndRemaining {
    public static void printCommonSubStringAndRemaining(String s1, String s2){
        HashSet<Character> tem = new HashSet<>();
        StringBuilder s1B = new StringBuilder(s1);
        StringBuilder s2B = new StringBuilder(s2);
        for(int i=0; i<s1B.length();i++){
            tem.add(s1B.charAt(i));
        }
        for(int j=0; j<s2B.length();j++){
            if(tem.contains(s2B.charAt(j))){
                System.out.print(s2B.charAt(j) );
                tem.remove(s2B.charAt(j));
            }else{
                tem.add(s2B.charAt(j));
            }
        }
        System.out.println();
        //convert to List in order to use get() method to retrieve each element.
        //HashSet does not index elements within it so can not use get(), have to convert to List or ArrayList
        List<Character> temCopy = new ArrayList<>(tem);
        Character[] res = new Character[tem.size()];
        for(int i=0; i<tem.size();i++){
            res[i] = temCopy.get(i);
        }
        Arrays.sort(res, new Comparator<Character>(){
            @Override
                    public int compare(Character o1, Character o2){
                if(o1 < o2){return -1;}
                return 1;

            }
        });
        for(Character x: res){
            System.out.print(x);
        }
    }
    public static void main(String[] args){
        printCommonSubStringAndRemaining("nTOhOGvRBk", "bUJtZSoONh");
        //Oh
        //BGJNORSTUZbhknotv
    }
}
