package String;

public class pangram {
    public static boolean isPangram(String s){
        int[] tem = new int[256];
        for(int i=0; i<s.length();i++){
            char t =  Character.toLowerCase(s.charAt(i));
            tem[t]++;
        }
        for(int i=97; i<=122;i++){//in ASCII table, a is at 97th, z position at 122nd
            if(tem[i]==0){return false;}
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPangram("abcdefghijklmnopqrstuvwxyz"));//true
    }
}
/*
public static boolean isPangram(String s) {
    // Array to store counts of characters 'a' to 'z'
    int[] tem = new int[26]; // Only need 26 for 'a' to 'z'

    // Iterate over the string and update the count of each character
    for (int i = 0; i < s.length(); i++) {
        char t = Character.toLowerCase(s.charAt(i)); // Get lowercase character
        if (t >= 'a' && t <= 'z') { // Only count alphabet characters
            tem[t - 'a']++; // Increment the count for the corresponding character
        }
    }

    // Check if all letters 'a' to 'z' are present
    for (int count : tem) {
        if (count == 0) {
            return false; // If any letter is missing, it's not a pangram
        }
    }

    return true; // All letters are present
}

 */