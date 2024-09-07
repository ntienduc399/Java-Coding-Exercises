package String;

import java.util.Scanner;

public class insertIntoString {
    public static String inserted(String s, int t){
        StringBuilder tem = new StringBuilder(s);
        String a = "28tech";
        tem.insert(t, a);
        return tem.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(inserted(sc.nextLine(), sc.nextInt()));//ClhiSYBOSg28tech5Re
    }
}
