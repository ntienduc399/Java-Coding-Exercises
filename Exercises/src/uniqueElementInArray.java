import java.util.Scanner;
public class uniqueElementInArray {
    public static void findUnique(int[] a){
        int count = 0;
        for(int i=0; i<a.length; i++){
            boolean seen = false;
            for(int j=0; j<i; j++){
                if(a[i]==a[j]){
                    seen = true;
                    break;
                }
            }
            if(!seen){
                System.out.print(a[i]+" ");
                count ++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] a = new int[l];
        for(int z=0; z<a.length; z++){
            a[z] = sc.nextInt();
        }
        findUnique(a);
    }
}
