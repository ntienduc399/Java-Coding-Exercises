/*
Discussions
Calculate the sum of the function S(n)=1+2+3+4+⋯+n using recursion. If you are not familiar,
S(n) can be quickly calculated using the formula S(n) = n*(n+1)/2
Input Format
A positive integer n
Constraints
0≤n≤1000; Note that you must use recursion in your code.
Output Format
Sample Input 0
773
Sample Output 0
299151
 */
import java.util.Scanner;
public class recursiveSum {
    public static long findSum(int n){
        if(n==0){return 0;}//since constrain start at 0;
        else{return 1L*n + findSum(n-1);}
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println(findSum(t));
    }
}
