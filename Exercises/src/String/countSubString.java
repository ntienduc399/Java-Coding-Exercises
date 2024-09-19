package String;

public class countSubString {
    public static int countSub(String s){
        StringBuilder t = new StringBuilder(s);
        for(int i=0; i<t.length();i++){
            if(t.charAt(i)==','){
                t.setCharAt(i, ' ');
            }
        }
        String tem = t.toString();
        String [] result = tem.split("\\s+");
        return result.length;
    }
    public static void main(String [] args){
        System.out.println(countSub("ngon ngu lap trinh java, python"));//6
    }
}
