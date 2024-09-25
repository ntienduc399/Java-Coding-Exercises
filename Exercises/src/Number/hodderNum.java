package Number;
/*
A hodder number is one that is prime and is equal to 2j-1 for some j. For example, 31 is a
hodder number because 31 is prime and is equal to 25
-1 (in this case j = 5). The first 4 hodder
numbers are 3, 7, 31, 127
Write a function with signature int isHodder(int n) that returns 1 if n is a hodder number,
otherwise it returns 0.
 */
public class hodderNum {
    public static int isHodder(int n){
        if(isPrime(n)){
            for(int i = 1; i<= Integer.MAX_VALUE;i++){
                int times = 0;
                int result = 1;
                while(times<=i){
                    result *=2;
                    if(result - 1==n){return 1;}
                    else if(result > n){break;}
                }
                if(result > n){break;}
            }
        }
        return 0;
    }
    private static boolean isPrime(int n){
        if(n<2){return false;}
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){return false;}
        }
        return true;
    }
    public static void main(String[] args){
           System.out.println(isHodder(3)) ;//1
        System.out.println(isHodder(7)) ;//1
        System.out.println(isHodder(31)) ;//1
        System.out.println(isHodder(127)) ;//1
        System.out.println(isHodder(120)) ;//0
    }
}
