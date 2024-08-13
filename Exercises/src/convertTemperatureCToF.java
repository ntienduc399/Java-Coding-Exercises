import java.util.Scanner;
public class convertTemperatureCToF {
    public static  void  converted(int n){
        double a = 1d * n*9/5 + 32;
        System.out.printf("%.2f", a);
    }
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        int b = t.nextInt();
        converted(b);
    }
}
