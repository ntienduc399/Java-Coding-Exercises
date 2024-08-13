/*
Problem
Given two integers a and b, find the following two numbers:
The first number is the largest number ≤ a that is divisible by b.
The second number is the smallest number ≥ a that is divisible by b.
Note: You are not allowed to use loops.
Hint:
The first number: a/b*b
The second number: (a + b -1)/b*b
Alternatively, you can use if-else statements instead of loops.

For the second number, if using if-else, check if a is divisible by b. If it is, the answer is a; otherwise, it is (a / b + 1) * b.

All divisions are integer divisions.

Input Format

A single line containing two integers a and b.
 */

import java.util.Scanner;
public class smallestAndLargest {
    public static int findLargest(int a, int b){
        return  (a/b)*b ; //so nguyen a/b roi nhan lai b se ra so lon nhat nho hon a ma chia het cho b;
    }
    public static int findSmallest(int a, int b){
        if(a%b==0){return a;}
        return  ((a/b)+1)*b ; //so nguyen a/b roi + 1 roi nhan voi b thi se ra so dau tien lon hon a ma chia het cho b
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(findLargest(x, y));
        System.out.println(findSmallest(x, y));

    }
}
