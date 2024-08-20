public class hexadecimalOfN {
    public static void findHexadecimalOfN(long n){
        if(n==0){return;}
        else{
            findHexadecimalOfN(n/16);
            long r = n%16;
            if(r<=9){System.out.print(r);}
            else{
                System.out.print((char) (r + 55));
            }

        }
    }
    public static void main(String[] args){
        findHexadecimalOfN(995);//3E3
    }
}
