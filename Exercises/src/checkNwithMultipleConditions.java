import java.util.Scanner;
public class checkNwithMultipleConditions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){ System.out.println("true");} else{System.out.println("false");}
        if(n%3==0 && n%5==0){ System.out.println("true");} else{System.out.println("false");}
        if(n%3==0 && n%7!=0){System.out.println("true");} else{System.out.println("false");}
        if(n%3==0 || n%7==0){ System.out.println("true");} else{System.out.println("false");}
        if(n>30 && n<50){System.out.println("true");} else{System.out.println("false");}
        if(n>30 && (n%2==0||n%3==0||n%5==0)){System.out.println("true");} else{System.out.println("false");}
        if(n>=10 && n<=99 && (n%10==2||n%10==3||n%10==5||n%10==7)){System.out.println("true");} else{System.out.println("false");}
        if(n<=100 && n%23==0){
            System.out.println("true");} else{System.out.println("false");}
        if(n<10 || n>20){ System.out.println("true");} else{System.out.println("false");}
        if((n%10)%3==0){System.out.println("true");} else{System.out.println("false");}
    }

}
