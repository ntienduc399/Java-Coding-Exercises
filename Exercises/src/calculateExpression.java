/*
[Kiểu dữ liệu-IF ELSE]. Bài 1. Tính toán giá trị của biểu thức
Problem
Submissions
Discussions
Cho biểu thức A(x) = x^3 + 3x^2 + x + 1 Với giá trị của x được nhập từ bàn phím, tính và in ra giá trị của biểu thức trên
Input Format
Số nguyên x
Constraints
-10^5≤x≤10^5
Output Format
In ra kết quả của biểu thức
Sample Input O
2
Sample Output 0
23

 */
import java.util.Scanner;
public class calculateExpression {
    public static long calculate(int n){
        long a = 1L *n*n*n + 3L*n*n + n + 1; //multiply with 1L,3L to convert from int to long to avoid overflow integer
        return a;
    }
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        int b = t.nextInt();
        System.out.println(calculate(b));
    }
}
