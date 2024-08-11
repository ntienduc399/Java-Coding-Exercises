import java.util.Scanner;
public class countSpecialChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a=0, b = 0, c=0;
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                b++;
            }
            else if(Character.isLetter(s.charAt(i))){
                a++;
            } else{c++;}
        }
        System.out.println(a +" " + b +" " + c);
    }

}
