package array;

public class decodeArray {
    public static int decoded(int[] a){
        int re = 0;
        int len = a.length;
        if(len==1){return 0;}
        int start = 0;
        while(start<len){//{0, 1, 1, 1, 1, 1, 0, 1}
            if(a[0]<0){
                start++;
            }
            int tem = 0;
            int count = 0;
            while(start<len && a[start] == tem){
                count++;
                start++;
            }
            re = re*10 + count;
            start++;
        }
        if(a[0]<0){ re *= -1;}
        return re;
    }
    public static void main(String[] args){
        System.out.println(decoded(new int[] {0, 1, 1, 1, 1, 1, 0, 1}));//100001
        System.out.println(decoded(new int[] {-1, 0, 1}));//-1
        System.out.println(decoded(new int[] {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1} ));//999
    }
}
