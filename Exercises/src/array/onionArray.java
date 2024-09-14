package array;

public class onionArray {
    public static int isOnionArray(int [] a){
        if(a.length<2){return 1;}
        for(int i=0; i<a.length/2; i++){
            if(a[i] + a[a.length-1-i] > 10){return 0;}
        }
        return 1;
    }
    public static void main(String[] args){
        System.out.println(isOnionArray(new int[] {1, 2, 19, 4, 5}));//1
        System.out.println(isOnionArray(new int[] {1, 2, 3, 4, 15}));//0
        System.out.println(isOnionArray(new int[] {1, 3, 9, 8}));//0
        System.out.println(isOnionArray(new int[] {2}));//1
        System.out.println(isOnionArray(new int[] {-2, 5, 0, 5, 12}));//1
    }
}
