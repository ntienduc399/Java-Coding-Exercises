import java.util.Scanner;
public class recursiveExponent {
    public static int mod = 1000000007;
    public static long calculateExponent (int a , int b){
        if(b==0){return 1;}
        long X = calculateExponent(a, b/2);
        if(b%2!=0){return (((X%mod)*(X%mod)%mod) * (a%mod))%mod;}
        return (X%mod)*(X%mod)%mod;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(calculateExponent(a,b));
    }
}
