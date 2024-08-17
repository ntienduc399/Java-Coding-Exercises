/*
Given the equation: a*x^2 + b*x + c = 0
Solve the quadratic equation.
If the equation has no solution, print "NO SOLUTION".
If the equation has infinitely many solutions, print "INFINITE SOLUTIONS".
If the equation has one solution or a double root, print that unique solution. If there are two solutions, print the smaller solution first. The solutions should be printed with two decimal places.
Note: Handle separately the cases when
Input Format:
A single line containing three numbers
Constraints:
−100≤a,b,c≤100
 */

import java.util.Scanner;
public class equation {
    public void findX(int a, int b, int c){
        if(a==0){
            if(b==0 && c==0){
                System.out.println("Vo So Nghiem");
            }
            else if(b==0 && c!=0){System.out.println("Vo nghiem");}
            else{System.out.printf("%.2f", (double)-c/b);}
        }else{
            int delta = b*b - 4*a*c;
            if(delta<0){System.out.println("Vo Nghiem");}
            else if( delta ==0){
                System.out.printf("%.2f", (double)-b/2*a);
            }else{
                double x1 = (-b - Math.sqrt(delta))/(2*a);
                double x2 = (-b + Math.sqrt(delta))/(2*a);
                System.out.printf("%.2f %.2f", x1, x2);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(),  c = sc.nextInt();
        equation e = new equation();
        e.findX(a, b, c);

    }
}
