package String;

public class countUpperCaseString {
    public static void countUpper(String s){
        String[] tem = s.split("\\s+");
        int count = 0;
        for(String x:tem){
            if(x.equals(x.toUpperCase())){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String [] args){
        countUpper("tech DEV");
        countUpper("aa bb CC CC");

    }
}
