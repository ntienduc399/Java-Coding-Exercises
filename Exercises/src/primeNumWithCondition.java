/*
For this task, you must implement a method that outputs the prime factors of a number,
taking into account the number of times each prime factor divides the given number.
Requirements:
Write a method named divisiblePrime that:
Takes an integer n as input.
Prints all the prime factors of n in ascending order. If a prime factor divides n multiple times,
it should be printed each time it divides n
 */
import java.util.Scanner;
public class primeNumWithCondition {
    public static void divisiblePrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                while(n%i==0){
                    System.out.print(i+" ");
                    n /= i;
                }
            }
        }
        if(n!=1){System.out.print(n);}
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        divisiblePrime(t);
    }
}
