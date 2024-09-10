package String;

public class formatSubStringInOddOrEvenPosition {
    //in odd position, print itself, in even position, print it after being reversed. String start from 1 not 0;
    public static void printFormattedSub(String s){
        String[] tem = s.split("\\s+");
        for(int i=0; i<tem.length; i++){
            if((i+1)%2==0){
                System.out.print(reversed(tem[i]) +" ");
            } else{
                System.out.print(tem[i] +" ");
            }
        }
    }
    private static String reversed(String b){
        StringBuilder re = new StringBuilder(b);
        return re.reverse().toString();
    }
    public static void main(String[] args){
        printFormattedSub("bWo    ziD cWS DIi    bzA zADzi aIio    ");//bWo Diz cWS iID bzA izDAz aIio
    }
}
