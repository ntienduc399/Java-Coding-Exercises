package String;

public class separateNumAndLetter {
    public static void separated(String s){
        String num ="";
        String letter ="";
        for(int i=0; i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                num += s.charAt(i);
            } else if (Character.isLetter(s.charAt(i))) {
                letter += s.charAt(i);
            }
        }
        System.out.println(num);
        System.out.println(letter);
    }
    public static void main(String[] args){
        separated("I68c8SASicab6AiI9i");
        //68869
        //IcSASicabAiIi

    }
}
