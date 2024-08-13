import java.util.Scanner;
public class euclidDistance {
    public void findEuclidDistance(int x1, int y1, int x2, int y2){
        double a = Math.sqrt((1f*x2- 1f*x1) *(1f*x2- 1f*x1) + (1f*y2 - 1f*y1)*(1f*y2 - 1f*y1));
        System.out.printf("%.2f",a);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        euclidDistance t = new euclidDistance();
        t.findEuclidDistance(a, b, c,d);

    }
}
