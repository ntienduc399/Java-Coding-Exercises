public class cubePowerful {
    public static int isCubePowerful(int n){
        if(n<=0){return 0;}
        int res = 0, original = n;
        while(n !=0){
            int tem = n%10;
            int transfer = 1;
            int times = 0;
            while(times<3){
                transfer *= tem;
                times++;
            }
            n /= 10;
            res += transfer;
        }
        if(res == original){return 1;}
        return 0;
    }
    public static void main(String[] args){
        System.out.println(isCubePowerful(153));//1
        System.out.println(isCubePowerful(370));//1
        System.out.println(isCubePowerful(371));//1
        System.out.println(isCubePowerful(407));//1
        System.out.println(isCubePowerful(87));//0
        System.out.println(isCubePowerful(0));//0


    }
}
