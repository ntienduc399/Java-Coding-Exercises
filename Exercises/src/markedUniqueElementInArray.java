import java.util.Scanner;

public class markedUniqueElementInArray {
    public static int markUnique(int[] a){
        int[] tem = new int[1000];
        int count=0;
        for(int i=0; i<a.length; i++){
            tem[a[i]] +=1;
        }
        for(int y=0 ; y<tem.length; y++){
            if(tem[y]!=0){count++;}
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[t];
        for(int i=0; i<a.length;i++){
            a[i]= sc.nextInt();
        }
        System.out.println(markUnique(a));
    }
}
