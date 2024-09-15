package array;

public class systematicallyIncreasing {
    public static int isSystematicallyIncreasing(int[] a){
        if(a.length<2){return 1;}
        else{
            if(a[0]!=1 || a[1]!=1){return 0;}
            if(a.length>3){if(a[3]!=1){return 0;}}//{1, 1, 2, 3} 0 because the sequence {1, 2} is missing
            int pos = 2;
            while(pos <a.length){//{1, 1, 2, 1, 2, 3}
                while(pos <a.length && a[pos]!=1){//pos <a.length this condition comes first to make sure not out of bound
                    if(a[pos] != a[pos-1] +1){return 0;};
                    pos++;
                }
                if(pos<a.length){pos++;}
            }
        }
        return 1;
    }
    public static void main(String[] args){
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 3, 1, 2, 1} ));//0
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 2, 3} ));//0
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 3} ));//0
        System.out.println(isSystematicallyIncreasing(new int[]{1, 1, 3} ));//0
        System.out.println(isSystematicallyIncreasing(new int[]{1, 2, 1, 2, 1, 2} ));//0
        System.out.println(isSystematicallyIncreasing(new int[]{1} ));//1



    }
}
