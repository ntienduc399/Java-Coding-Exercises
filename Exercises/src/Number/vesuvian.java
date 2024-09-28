package Number;

public class vesuvian {
    public static int isVesuvian(int n){
        int count = 0;
        for(int i = 1; i<= Math.sqrt(n); i++){
            for(int j = i; j<=Math.sqrt(n); j++){//j = i not j = i+1, cause there is case 25 25, need i =5, j=5
                if(i*i + j*j==n){
                    count++;
                }
            }
        }
        if(count==2){
            return 1;
        }

        return 0;
    }
    public static void main(String[] args){
        System.out.println(isVesuvian(50));//1
    }


}
