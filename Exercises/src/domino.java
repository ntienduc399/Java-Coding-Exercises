/*
You are given a rectangular board with dimensions M × N unit squares.
Additionally, you have an unlimited number of standard domino pieces, each of size 2 × 1.
You are allowed to rotate the domino pieces. Your task is to place as many dominoes as possible on
the board while satisfying the following conditions:
Each domino fully covers two unit squares.
No two dominoes overlap.
Each domino lies entirely within the board. It is allowed to touch the edges of the board.
Find the maximum number of dominoes that can be placed on the board under these conditions.

Hint: Calculate how many dominoes can be placed in each column (placed vertically)
and then multiply by the number of columns to find the total number of dominoes.
If the number of rows of the rectangle is even, the number of dominoes in one column will be M / 2.
If the number of rows is odd, first calculate the number of dominoes for a rectangle of size (M - 1) * N, then consider the last row (place them horizontally).
Input Format:
Two positive integers M and N.

Constraints:
1 <= M, N <= 10^9
 */
import java.util.Scanner;
public class domino {
    public long numberOfDomini(int m, int n){
        if(n%2==0){
            return (1L*n/2*m);
        }else{
            return (1L*(n-1)/2 *m)+m/2;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(),  n = sc.nextInt() ;
        domino t = new domino();
        System.out.println(t.numberOfDomini(m, n));

    }
}
