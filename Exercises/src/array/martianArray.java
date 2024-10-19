package array;

public class martianArray {
    public static int isMartian(int[] a){
        int count1 = 0, count2 = 0;
        for(int i=0; i< a.length-1; i++){
            if(a[i]==1){count1++;}
            if(a[i]==2){count2++;}
            if(a[i]==a[i+1]){return 0;}
        }
        if(a[a.length-1]==1){count1++;}
        if(a[a.length-1]==2){count2++;}
        if(count2>=count1){return 0;}
        return 1;
    }
    public static void main(String[] args){
        System.out.println(isMartian(new int[] {1, 3}));//1
        System.out.println(isMartian(new int[] {1, 2, 1, 2, 1, 2, 1, 2, 1}));//1
        System.out.println(isMartian(new int[] {1, 3, 2}));//0
        System.out.println(isMartian(new int[] {1, 3, 2, 2, 1, 5, 1, 5}));//0
        System.out.println(isMartian(new int[] {1, 2, -18, -18, 1, 2}));//0
        System.out.println(isMartian(new int[] {1}));//1
        System.out.println(isMartian(new int[] {2}));//0

    }
}
