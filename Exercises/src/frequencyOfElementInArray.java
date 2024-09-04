import java.util.Scanner;
public class frequencyOfElementInArray {
    public static void findFrequency(int[] a){
        for(int i=0; i<a.length; i++){
            int count = 0;
            boolean seen = false;
            for(int j=0; j< i; j++){
                if(a[i]==a[j]){
                    seen = true;
                    break;
                }
            }
            if(!seen){
                for(int z = i; z<a.length; z++){
                    if(a[i]==a[z]){count++;}
                }
                {System.out.println(a[i] +" " + count);}
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[t];
        for(int i=0; i<a.length;i++){
            a[i]= sc.nextInt();
        }
        findFrequency(a);
    }
}
