package Number;

public class primeHappy {
    public static int isPrimeHappy(int n){
            int sum = 0;
            for(int i=2; i<n; i++){
                if(isPrime(i)){
                    sum += i;
                }
            }
            if(sum !=0 && sum % n==0){return 1;}
        return 0;

    }
    public static boolean isPrime(int n){
        if(n<2){return false;}
        for(int i=2; i<= Math.sqrt(n); i++){
            if(n%i==0){return false;}
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isPrimeHappy(25));//1
        System.out.println(isPrimeHappy(5));//1
        System.out.println(isPrimeHappy(32));//1
        System.out.println(isPrimeHappy(8));//0
        System.out.println(isPrimeHappy(2));//0


    }

}
