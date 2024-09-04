package String;

public class middleElement {
    public static void findMiddle(int n){
        String s = n +"";
        int a = s.length();
        if(a%2==0){
            System.out.println("Not Found");
        } else{
            System.out.println(s.charAt(a/2));
        }
    }
    public static void main(String[] args){
        findMiddle(12345);//3
        findMiddle(1245);//"Not Found"
    }
}
