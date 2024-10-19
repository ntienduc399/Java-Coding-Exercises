package array;

public class computeHMS {
    public static int[] computingHMS(int n){
        int[] result = new int[3];
        int start = 0;
        result[0] = n/3600;
        n =n-result[0]*3600;
        result[1] = n/60;
        n = n - result[1]*60;
        result[2] = n;
        return result;
    }
    public static void main(String[] args){
        int[] b = computingHMS(3735);
        for(int i=0; i<b.length; i++){
            System.out.print(b[i]+" "); //{1, 2, 15}
        }
        System.out.println();
        int[] c = computingHMS(3650);
        for(int i=0; i<b.length; i++){
            System.out.print(c[i]+" "); //{1, 0, 50}
        }
        System.out.println();
    }
}
