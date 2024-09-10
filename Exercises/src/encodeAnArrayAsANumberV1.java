import static java.lang.Math.abs;

public class encodeAnArrayAsANumberV1 {
    public static int encoded(int []n){
        int res = 0;
        for(int i=0; i<n.length-1; i++){
            int tem = abs(n[i]-n[i+1]);
            res = res *10 + tem;
        }
        if(n[0]<0){
            return res*-1;
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(encoded(new int[] {0, -3, 0, -4, 0}));//3344
        System.out.println(encoded(new int[] {-1, 5, 8, 17, 15}));//-6392
        System.out.println(encoded(new int[] {111, 115, 118, 127, 125}));//4392
    }
}
