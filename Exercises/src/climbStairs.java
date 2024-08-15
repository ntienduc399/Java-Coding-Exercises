/*
Doraemon wants to climb a staircase with n steps. He can move up either 1 or 2 steps at a time.
Doraemon wants the number of moves to be a multiple of an integer m. What is the minimum number of moves
that will allow him to reach the top of the staircase and satisfy his condition?

Hint: Find the minimum number of moves (x = n // 2) needed to reach the top of the staircase and
the maximum number of moves (y = n) required to reach the n steps. The problem reduces to finding
the smallest number >= x and <= y that is divisible by m. You can use the formula (x + m - 1) // m * m
to quickly find the result and then compare it with y.

Input Format:
A single line containing two integers, n and m, separated by a space.

Constraints:
1 <= n, m <= 10^9
Output Format:
Print a single integer — the minimum number of moves that is a multiple of m. If there is no way to climb the staircase satisfying the condition, print -1.
 */
public class climbStairs {
    public static int leastTimes(int n, int m){
        int min = 0, max = n; //1 step or 2 steps, highest times is to climb 1 step n times.
        if(n%2==0){
            min = n/2;
        }else{
            min = n/2+1;
        }
       // find the smallest >= min and divisible by m;
        int res = (min+m-1)/m*m;
        if(res<=max){return res;}
        else{return -1;}
    }
    public static void main(String[] args){
        System.out.println(leastTimes(10,2));
    }
}
