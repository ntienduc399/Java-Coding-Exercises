public class DigitIncreasing {
    public static int isDigitIncreasing(int n){
        for(int i=1; i<=9; i++){//36
            //8,88,888
            int re = 0;
            int sub = 0;
            while (re< n){
                int tem = sub *10 + i;
                if(re + tem ==n){return 1;}else{
                    re += tem;
                }
                sub = tem;
            }

        }
        return 0;
    }
    public static void main(String[] args){
        System.out.println(isDigitIncreasing(984));//1
       System.out.println(isDigitIncreasing(7404));//1
        System.out.println(isDigitIncreasing(7));//1
        System.out.println(isDigitIncreasing(36));//1
        System.out.println(isDigitIncreasing(24));//1
        System.out.println(isDigitIncreasing(22));//0
    }
}
