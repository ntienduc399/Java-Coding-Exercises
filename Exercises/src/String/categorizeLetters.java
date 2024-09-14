package String;

public class categorizeLetters {
    public static void countCategorizedChar(String s){
        int countLetters = 0, countNumbers = 0, countSpecialChar = 0;
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                countNumbers++;
            }else if(Character.isLetter(s.charAt(i))){
                countLetters++;
            }else{countSpecialChar++;}
        }
        System.out.print( countLetters +" " + countNumbers + " " + countSpecialChar);
    }
    public static void main (String[] args){
        countCategorizedChar("abcd123 $%^ a");//5 3 5
    }

}
