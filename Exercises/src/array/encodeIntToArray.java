package array;

import java.util.ArrayList;

public class encodeIntToArray {
    public static int[] encodedInt(int n){
        ArrayList<Integer> tem = new ArrayList<>();
        if(n<0){
            tem.add(-1);
            n *= -1;
        }
        while(n!=0){
            int re = n%10;
            if(re==0){tem.add(1);}
            else{
                int numOfZero = 0;
                while(numOfZero<re){
                    tem.add(0);
                    numOfZero++;
                }
                tem.add(1);
            }
            n /= 10;
        }
        int[] result = new int[tem.size()];
        for(int i=0; i<result.length; i++){
            result[i] = tem.get(i);
        }
        return result;
    }
    public static void main(String[] args){
        int[] a = encodedInt(-1);//{-1, 0, 1}
        if(a!=null){
            for(int x: a){System.out.print(x+" ");}
        }
        System.out.println();
        int[] b = encodedInt(100001);//{0, 1, 1, 1, 1, 1, 0, 1}
        if(b!=null){
            for(int x: b){System.out.print(x+" ");}
        }
        System.out.println();

        int[] c = encodedInt(999);//0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1
        if(c!=null){
            for(int x: c){System.out.print(x+" ");}
        }
        System.out.println();
    }
}
