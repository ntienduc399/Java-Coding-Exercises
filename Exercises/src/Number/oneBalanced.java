package Number;
/*
{1, 1, 1, 2, 3, -18, 45, 1} 1 because it begins with three 1s, followed by four non-1s
and ends with one 1 and 3+1 == 4
 */

public class oneBalanced {
    public static int isOneBalanced(int[] a){
        if(a.length==0){return 1;}
        int timesNone1 = 0, count1 = 0, countNone1 = 0;
        int start = 0;
        while(start< a.length){
            if(a[start] != 1){
                timesNone1++;
                while(start<a.length && a[start]!=1 ){//state this condition start<a.length first,
                    // so that will go out of bound
                    countNone1++;
                    start++;
                }

            }else{
                while(start<a.length && a[start]==1 ){
                    count1++;
                    start++;
                }
            }
            if(timesNone1>1){return 0;}
        }
        if(countNone1 != count1){return 0;}
        return 1;
    }
    public static void main(String[] args){
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1}));//1
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1, 0}));//0
        System.out.println(isOneBalanced(new int[]{1, 1, 2, 3, 1, -18, 26, 1}));//0
        System.out.println(isOneBalanced(new int[]{}));//1
        System.out.println(isOneBalanced(new int[]{3, 3, 3, 3, 3, 3}));//0
    }

}
