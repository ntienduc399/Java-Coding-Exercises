package Number;

public class factorialPrime {
    public static int isFactorialPrime (int n){
        if(n==2){return 1;}
        if(isPrime(n)){
            for(int j = 2; j<n; j++){
                if(isPrime(j) && factorial(j)+1 ==n){return 1;}
                if(isPrime(j) && factorial(j)+1 >n){break;}
            }
        }
        return 0;
    }
    private static boolean isPrime(int a){
        if(a<2){return false;}
        if(a==2){return true;}
        for(int i=2; i<= Math.sqrt(a); i++){
            if(a%i==0){return false;}
        }
        return true;
    }
    public static int factorial(int b){
        if(b<=0){return 1;}
        return b*factorial(b-1);
    }
    public static void main(String[] args){
        System.out.println(isFactorialPrime(3));//1
        System.out.println(isFactorialPrime(2));//1
        System.out.println(isFactorialPrime(7));//1
        System.out.println(isFactorialPrime(8));//0
        System.out.println(isFactorialPrime(11));//0
        System.out.println(isFactorialPrime(721));//0
    }
}
