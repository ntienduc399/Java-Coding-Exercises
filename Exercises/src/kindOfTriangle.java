/*
Given the lengths of three sides a, b, c of a triangle, if the given triangle is equilateral, print 1;
if it is isosceles, print 2; if it is right-angled, print 3; if it is a scalene triangle, print 4.
In the case of an invalid triangle, print 0.
Input Format
A single line containing three numbers
 */
import java.util.Scanner;
public class kindOfTriangle {
    public static int whichTriangle(int a, int b, int c){
        if(a> 0 && b>0 && c>0 && a+ b > c && a+c >b && c+b >a){//check whether its a valid triangle first;
            if(a==b && b==c){return 1;}
            if((a==b)|| (a==c || (c==b)){return 2;}
            if((a*a + b*b == c*c)||(a*a+c*c==b*b) ||(b*b+c*c==a*a)){return 3;}
            return 4;
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println(whichTriangle(a,b,c));
    }
}
