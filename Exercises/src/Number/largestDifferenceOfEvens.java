package Number;

public class largestDifferenceOfEvens {
    public static int findLargestDifferenceOfEvens(int[] a){
        int minEven = 0;
        int maxEven  = 0;
        int count = 0;
        for(int i=0; i <a.length; i++ ){
            if(a[i]%2==0){
                count++;
                if(count==1){
                    minEven = maxEven = a[i];
                } else{
                    if(maxEven < a[i]){
                        maxEven = a[i];
                    }
                    else if(minEven > a[i]){
                        minEven = a[i];
                    }
                }
            }
        }
        if(count<=1){return -1;}
        return maxEven - minEven;
    }
    public static void main(String[] args){
        System.out.println(findLargestDifferenceOfEvens(new int[] {1, 2, 1, 2, 1, 4, 1, 6, 4}));//4;
        System.out.println(findLargestDifferenceOfEvens(new int[] {1, 3, 5, 9}));//-1;
        System.out.println(findLargestDifferenceOfEvens(new int[] {1, 18, 5, 7, 33}));//-1;
        System.out.println(findLargestDifferenceOfEvens(new int[] {2, 2, 2, 2}));//0;

    }
}
