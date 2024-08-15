/*
A frog is currently at point 0 on the Ox coordinate axis. It jumps according to the following
algorithm: the first jump is a units to the right, the second jump is b units to the left,
the third jump is a units to the right, the fourth jump is b units to the left, and so on.
If the frog has made an even number of jumps (before the current jump), it jumps from its current position x to x + a;
 otherwise, it jumps from its current position x to x - b. Your task is to calculate the frog's position after k jumps.

Hint: Determine the number of jumps the frog makes to the left and right, denoted as t and p, respectively.
The frog's position will be the total distance jumped to the right minus the total distance jumped to the left.

Input Format:
Three numbers on the same line corresponding to a, b, and k.

Constraints:
1 <= a, b, k <= 10^9

Output Format:
The position of the frog after k jumps.

Sample Input 0:
523
 */
import java.util.Scanner;
public class frogJump {
    public static long frogAtKJump(int a, int b, int k){
        int right = 0;
        int left = 0;
        if(k%2==0){//jump right times equal to jump left times
            right = left = k/2;
        } else{ //because jump right first, then jump left, so right jump is higher than left jump 1 time.
            left = k/2;//have to be int.
            right = left+1;
        }
        return 1L*right*a - 1L*left*b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(frogAtKJump(a, b, k));
    }
}
