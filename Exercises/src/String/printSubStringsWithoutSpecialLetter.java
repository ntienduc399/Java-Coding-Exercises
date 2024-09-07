package String;

public class printSubStringsWithoutSpecialLetter {
    public static void printAllSubString(String s){
        StringBuilder tem = new StringBuilder(s);
        for(int i=0; i<s.length();i++){
            if(tem.charAt(i)=='.'||tem.charAt(i)=='?'||tem.charAt(i)=='!'||tem.charAt(i)==','){
                tem.setCharAt(i,' ');
            }
        }
        String [] res = tem.toString().split("\\s+");
        for(String x: res){
            System.out.print(x+" ");
        }
    }
    public static void main(String[]args){
        printAllSubString("oSAz ?oiiaz iSaSz SDA ,bbW oWA AIIia .");//oSAz oiiaz iSaSz SDA bbW oWA AIIia
    }
}
