package String;

public class notContainedAString {
    public static void excludeAString(String s, String e){
        String a= "";
        for(int i= 0; i<s.length();i++){
            if(!e.contains(String.valueOf(s.charAt(i)))){//contains() can not use char type, so use String.valueOf()
                //to convert char to String
                a +=s.charAt(i);
            }
        }
        if(a.length()!=0){
            System.out.println(a);
        }else{
            System.out.println("Empty");
        }
    }
    public static void main(String [] args){
        excludeAString("hSbc7eeh4ti8eSADte0","28tech");//Sb74iSAD0
        excludeAString("28tech28techtech28","28tech");//EMPTY
    }
}
