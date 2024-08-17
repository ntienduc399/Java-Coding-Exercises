/*
Write a Java program that reads two long integers, a and b, representing a range
[a,b]. The program should find and print all perfect square numbers within this range.
A perfect square is an integer that is the square of another integer. For example,
16 is a perfect square because it is the square of 4 (4^2)
 */
import java.util.Scanner;
public class squareNumberInaRange {
    public static boolean isSquareNum(long n){
        int a = (int)Math.sqrt(n);
        return (long)a*a==n;
    }
    public static void findAllSquareNums(long a, long b){
        int L = (int)Math.sqrt(a);
        int R = (int) Math.sqrt(b);
        if(!isSquareNum(L)){L++;}
        for(int i=L; i<= R; i++){
                System.out.print((long)i*i+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        findAllSquareNums(a, b);
    }

}
