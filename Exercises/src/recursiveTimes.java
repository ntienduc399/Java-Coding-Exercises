public class recursiveTimes {
    public static long mod = 1000000000;
    public static int countTimes(long n){
        if(n==1){return 1;}
        long x= mod, y = mod, z = mod;
        if(n%2==0){
            x = 1 + countTimes(n/2);
        }
        else if(n%3==0){
            y = 1 + countTimes(n/3);
        }
        else if (n>1){
            z = 1 + countTimes(n-1);
        }
        return (int)Math.min(z, Math.min(y,z));
    }
}
