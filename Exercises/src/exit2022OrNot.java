/*
Enter a sequence of numbers with no more than 10,000 integers.
Determine whether the number 2022 appears in the input sequence.
Input Format:
The first line contains the number of integers to be entered:
𝑁
The second line contains
N integers separated by spaces.
Constraints:
1≤N≤10,000;
Output Format:
return "true" if the number 2022 is present in the input; otherwise, print "false."
Sample Input 0:
269 2020 2021 2022
Sample Output 0:
true
 */
import java.util.Scanner;
public class exit2022OrNot {
    public static boolean find2022(int a, int b){
        for(int i=0; i<a-1; i++){
            if(b==2022){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(find2022(a, b));
    }
}
