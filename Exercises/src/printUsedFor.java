import java.util.Scanner;

/*
For this task, you need to use both for and while loops in your code.
The first part uses for, and the second part uses while. Given a natural number N
N, your task is to print the following sequences using the specified loops,
each on a new line with numbers separated by spaces:
Print numbers from 1 to N
Print numbers from N
Print even numbers less than or equal to N
Print odd numbers less than or equal to N
Print multiples of 4 less than
Print the first N lowercase letters of the alphabet.
Print the last N lowercase letters of the alphabet in ascending order.
Input Format:
A single line containing a positive integer N
Constraints:
5≤N≤26
 */
public class printUsedFor {
    public static void printed(int n){
        //print from 1 to n;
        for(int i=1; i<=n; i++){
            System.out.print(i+ " ");
        }
        //print from n to 0;
        for(int i=n; i>=0; i--){
            System.out.print(i+ " ");
        }
        //print even num <= n;
        for(int i=0; i<=n; i++){
            if(i%2==0){System.out.println(i+" ");}
        }
        //print odd num <= n;
        for(int i=0; i<=n; i++){
            if(i%2!=0){System.out.println(i+" ");}
        }
        //multiply of 4:
        for(int i=1; i<n; i++){
            if(i%4==0){
                System.out.print(i +" ");
            }
        }
        //Print the first N lowercase letters of the alphabet.
        for(int i=0; i<n; i++){
            System.out.print((char)(i + 97) +" ");
        }
        //Print the last N lowercase letters of the alphabet in ascending order.
        for(int i=122-n +1 ; i<=122; i++){//last letter is 122 in ASCII
            System.out.print((char)i +" ");
        }
        System.out.println();

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printed(n);
    }
}
