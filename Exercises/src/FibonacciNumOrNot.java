/* to check whether a number is a Fibonacci num;*/
import java.util.Scanner;
public class FibonacciNumOrNot {
    public static boolean isFibonacciNum(long n){
        if(n==0 || n==1){return true;}
        long f1 = 0, f2 = 1;
        for(int i=2; i<=92; i++){//cause Fibonacci at 92nd position is very huge,
            // Long type can only store from 1st to 92nd position's result. So we just need to check til 92,
            // no need to go further.
            long fi = f1+f2;
            if(n==fi){return true;}
            //change f1 and f2 values accordingly;
            f1=f2;
            f2=fi;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        long t = sc.nextLong();
        System.out.println(isFibonacciNum(t));
    }
}
