package array;

public class zeroPlentiful {
    public static int isZeoPlentiful(int [] n){
        int count0 = 0;
        int i = 0;
        while(i<n.length){//{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}//2
            if(n[i]!=0){
                i++;
            }else{
                count0++;
                int times = 0;
                while(i<n.length && n[i]==0){
                    times++;
                    i++;
                }
                if(count0==0 || times <4){return 0;}
            }
        }
        return count0;
    }
    public static void main(String[] args){
        System.out.println(isZeoPlentiful(new int[]{1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12}));//2
        System.out.println(isZeoPlentiful(new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0}));//3
        System.out.println(isZeoPlentiful(new int[]{1, 0, 0, 0, 2, 0, 0, 0, 0}));//0

    }
}
