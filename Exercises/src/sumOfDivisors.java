/*
Calculate the sum of divisors of a positive integer when a divisor is found, say 1,
the corresponding divisor is 60; 2 => 30, 3 => 20, 4 => 15, 5 => 12, 6 => 10.
Note that if n is a perfect square, the pair i and n/i will be the same, and in this case,
it should only be counted once.
Input Format:
A positive integer N
Constraints:
1≤N≤10
Output Format:
The sum of the divisors of N
 */
import java.util.Scanner;
public class sumOfDivisors {
    public int sum(int n){
        //find all numbers divisible by n
        int res = 0;
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                res += i;
                if(i!=n/i && n%(n/i)==0){
                    res += n/i;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumOfDivisors d = new sumOfDivisors();
        System.out.println(d.sum(n));
    }
}
