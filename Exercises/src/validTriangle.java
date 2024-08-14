/*
Given the lengths of three sides a,b,c of a triangle, check whether they can form a valid triangle.
Hint: A valid triangle is one where all three sides are positive,
and the sum of any two sides is always greater than the remaining side.
There are 6 conditions that need to be satisfied using the && operator.
 */
import java.util.Scanner;
public class validTriangle {
    public static boolean isTriangle(int a, int b, int c){
        if(a>0 && b>0 && c>0 && a+b >c && a+c >b && b+c >a){
            return true;
        }
        return false;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println(isTriangle(a, b, c));
    }
}
