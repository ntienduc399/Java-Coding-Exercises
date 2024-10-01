package Number;

public class triangular {
    public static int isTriangular(int n){

        for(int i = 1; i<n; i++){
            int sum = 0;
            for(int j=1; i<=i; j++){
                sum += j;
                if(sum==n){
                    System.out.println("j = " +j);
                    return 1;}
                if(sum>n){break;}
            }
        }
        return 0;
    }
    public static void main(String[] args){
        System.out.println(isTriangular(3));//1
        System.out.println(isTriangular(6));//1
        System.out.println(isTriangular(10));//1
    }
}
