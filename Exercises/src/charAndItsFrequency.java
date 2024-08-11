import java.util.Scanner;
public class charAndItsFrequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] d = new int[256];//256 is numbers of ASCII characters
        for(int i=0; i<s.length(); i++){
            d[s.charAt(i)]++;
        }
        for(char c = 0; c<256; c++){
            if(d[c]>0){System.out.println(c +" "+ d[c]);}
        }
        for(int i=0; i<s.length();i++){
            if(d[s.charAt(i)]>0){
                System.out.println(s.charAt(i) +" "+ d[s.charAt(i)]);
                d[s.charAt(i)]=0;//mark it already printed.
            }
        }
    }
}
