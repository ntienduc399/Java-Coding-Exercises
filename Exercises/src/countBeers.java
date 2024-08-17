/*
28techland is a land where residents love drinking beer, so to increase the number of beers sold,
the beer shops here have introduced the following promotion: For every 3 empty beer bottles,
you can exchange them for one new beer bottle. Knowing that in 28techland, each beer bottle costs 28 cents,
your task is to determine the maximum number of beer bottles you can buy with a given amount of N cents,
including the bottles obtained by exchanging empty bottles.
Input Format:
A single line containing N, the initial number of cents.
Constraints:
1≤N≤10^6
Output Format:
Print the maximum number of beer bottles you can buy.
Sample Input 0:
138
Sample Output 0:
5
 */
import java.util.Scanner;

public class countBeers {
    public static int beersCounted(int n){
        int re = 0;//138
        int coupon = 0;
        if(n>28){
            re = n/28;
            int times = re;
            while( times>=3){
                coupon++;
                times += 1;//update numbers of beers;
                times -=3;
            }
        }
        return re + coupon;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(beersCounted(n));
    }
}
