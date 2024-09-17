package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class letterExistedInEitherStrings {
    public static void whichLetterExistedInEitherStrings(String s1, String s2){
        ArrayList<Character> temS1 = new ArrayList<>();
        ArrayList<Character> temS2 = new ArrayList<>();
        ArrayList<Character> temS3 = new ArrayList<>();
        for(int i=0; i<s1.length(); i++){
            if(!temS1.contains(s1.charAt(i))){
                temS1.add(s1.charAt(i));
            }
        }
        for(int j=0; j<s2.length();j++){
            if(!temS1.contains(s2.charAt(j))){
                temS2.add(s2.charAt(j));//only existed s2 not in s1
            }
            if(!temS3.contains(s2.charAt(j))){
                temS3.add(s2.charAt(j));
            }
        }
        temS2.sort( Comparator.naturalOrder());
        // Remove characters from temS1 that also exist in temS3
        Iterator<Character> iterator = temS1.iterator();
        while (iterator.hasNext()) {
            if (temS3.contains(iterator.next())) {
                iterator.remove();
            }
        }
        /*for(int z=0; z<temS1.size();z++){ //only existed s1 not in s2
            if(temS3.contains(temS1.get(z)));{
                temS1.remove(temS1.get(z));
            }
            You're modifying temS1 while iterating through it, which can lead to unexpected behavior
            because removing elements from a list while iterating can cause index shifting and skipping elements.
            better use iterator();

        }*/
        temS1.sort( Comparator.naturalOrder());
        System.out.println(temS1.toString());
        System.out.println(temS2.toString());

    }
    public static void main(String[] args){
        whichLetterExistedInEitherStrings("fAOxTUeAIs", "aVUkULeRYw");
        //AIOTfsx
        // LRVYakw

    }


}
