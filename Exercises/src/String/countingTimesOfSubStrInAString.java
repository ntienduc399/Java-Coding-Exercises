package String;

public class countingTimesOfSubStrInAString {
    public static int countingTimes(String s, String b){
        String [] a = s.split("\\s+");
        int count = 0;
        for(int i=0; i< a.length; i++){
            if(a[i].toLowerCase().equals(b.toLowerCase())){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(countingTimes("zzA 28TecH AAAa AAW Dobc czo 28tECH zIo bic ", "28tech"));//2
    }
}
