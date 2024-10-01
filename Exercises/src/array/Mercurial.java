package array;

public class Mercurial {
    public static int isMercurial(int[] a){
        if(a.length==0){return 1;}
        int start = 0, count3 = 0;
        while(start <a.length){
            if(a[start]!=1){start++;}
            else if(a[start]==1){
                start++;
                while(start<a.length && a[start]!=1){
                    if(a[start]==3){count3++;}
                    start++;
                    if (start<a.length && a[start]==1 && count3 >= 1){return 0;}
                }
            }

        }
        return 1;
    }
    public static void main(String[] args){
        System.out.println(isMercurial(new int[] {1, 2, 10, 3, 15, 1, 2, 2}));//0
        System.out.println(isMercurial(new int[] {5, 2, 10, 3, 15, 1, 2, 2}));//1
        System.out.println(isMercurial(new int[] {3, 2, 18, 1, 0, 3, -11, 1, 3}));//0
        System.out.println(isMercurial(new int[] {8, 2, 1, 1, 18, 3, 5}));//1
    }
}
