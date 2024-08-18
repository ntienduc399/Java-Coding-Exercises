import java.util.Scanner;
public class tPrime {
    public static boolean isPrime(long a){
        if(a<=1){return false;}
        for(int i=2; i<=Math.sqrt(a);i++){
            if(a%2==0){return false;}
        }
        return true;
    }
    public static void printTPrimes(long n){
        for(int i=2; i<=Math.sqrt(n);i++){
            if(isPrime(i)){System.out.print((long)i*i+" ");}
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long b = sc.nextLong();
        printTPrimes(b);
    }
}
