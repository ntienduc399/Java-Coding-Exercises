package array;

public class Array235 {
    public static int isArray235(int[] a){
        int div2=0, div3=0, div5 = 0, divNone = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]%2==0){div2++;}
            if(a[i]%3==0){div3++;}
            if(a[i]%5 == 0){div5++;}
            if(a[i]%2 !=0 && (a[i]%3!=0) && (a[i]%5!=0) ){divNone++;}
        }
        if(div2+div3+div5+divNone == a.length){return 1;}
        return 0;
    }
    public static void main(String[] args){
        System.out.println(isArray235(new int[] {2, 3, 5, 7, 11}));//1
        System.out.println(isArray235(new int[] {2, 3, 6, 7, 11}));//0
        System.out.println(isArray235(new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10}));//0
        System.out.println(isArray235(new int[] {7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7}));//1

    }
}
