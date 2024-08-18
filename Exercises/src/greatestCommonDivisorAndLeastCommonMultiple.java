import java.util.Scanner;
public class greatestCommonDivisorAndLeastCommonMultiple {
    public static int findGDC(int a, int b){
        while(b!=0){
            int r = a%b;
            a = b;
            b=r;
        }
        return a;
    }
    public static int findLCM(int a, int b){
        return a*b/findGDC(a,b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findGDC(a, b));
        System.out.println(findLCM(a, b));
    }
}
