import java.util.Scanner;
public class averagePoints {
    public static void main (String[] args){
        Scanner t = new Scanner(System.in);
        float a = t.nextFloat();
        float b = t.nextFloat();
        float c = t.nextFloat();
        float d = t.nextFloat();
        float average = (a*1 + b*1 + c*2 + d*3)/(1+1+2+3);
        if(average >= 8){System.out.println("Excellent");}
        else if(average >= 6.5){System.out.println("Fair");}
        else if (average >= 5){System.out.println("Average");}
        else{System.out.println("Weak"); }
    }
}
