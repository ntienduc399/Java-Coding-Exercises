package String;

public class standardizeBirthDay {
    public static String standardized(String s){
        //18/5/2002
        //1/10/2002
        StringBuilder tem = new StringBuilder(s);
        if(tem.charAt(1)=='/'){
            tem.insert(0,'0');
        }
        if(tem.charAt(4)=='/'){
            tem.insert(3,'0');
        }
        return tem.toString();
    }
    public static void main(String[] args){
        System.out.println(standardized("18/5/2002"));
        System.out.println(standardized("1/10/2002"));
    }
}

