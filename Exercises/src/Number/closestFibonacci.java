package Number;

import java.util.ArrayList;

public class closestFibonacci {

    public static int findClosestFibo(int n){
        if(n<1){return 0;}
        ArrayList<Integer> tem = ClosestFibonacciList(n);
        for(int i= tem.size()-1; i>=0; i--){
            if(tem.get(i)< n){
                return tem.get(i);
            }
        }
        return 0;
    }
    private static ArrayList<Integer> ClosestFibonacciList(int n){
        ArrayList<Integer> tem = new ArrayList<>();
        tem.add(1);
        tem.add(1);
        for(int i=2; i<n; i++){
            tem.add(tem.get(i-1) + tem.get(i-2));
        }
        return tem;
    }
    public static void main(String[] args){
        System.out.println(findClosestFibo(13));//8
        System.out.println(findClosestFibo(33));//21
    }




}
