import java.util.Scanner;
public class shortestPath {
    public static int shortest(int d1, int d2, int d3 ){
        //ways that he can go:
        //to store 1 then store 2 and turn home
        int a = d1 + d2 + d3;
        //from home to store 1 then turn home and then from home o store 2 then home
        int b = 2*d1+2*d2;
        //from home to store 1 then to store 2 then store 1 then home
        int c = 2*(d1 + d3);
        //from home to store 2 then to store 1 then store 2 then home
        int d = 2*(d2+d3);
        return Math.max(Math.max(a,b),Math.max(c,d));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d1 =sc.nextInt(), d2 = sc.nextInt(), d3 = sc.nextInt();
        System.out.println(shortest(d1,d2,d3));
    }
}
