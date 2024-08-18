import java.util.Scanner;
public class findGreaterNumThanNInFibonacci {
    public static long greaterNuminFibonacci(long n){
        if(n==1){return 1;}
        long f1 = 0, f2 = 1;
        for(int i=2; i<=92; i++){
            long fn = f1+f2;
            if(fn>=n){return fn;}
            f1=f2;
            f2=fn;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(greaterNuminFibonacci(n));
    }
}
