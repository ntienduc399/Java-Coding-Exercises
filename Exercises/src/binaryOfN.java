import java.util.Scanner;
public class binaryOfN {
    public static int findBinary(int n){
        if(n==0){return 0;}
        return  findBinary(n/2)*10 + n%2 ;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findBinary(n));
    }
}
