package String;

public class addCommaToNum {
    public static void addComma(int n){
        char [] re = (n+"").toCharArray();
        StringBuilder tem = new StringBuilder();
        int count = 0;
        int i = re.length-1;
        while(i>=0){
            count++;
            tem.append(re[i]);
            if(count%3==0 && i!=0){
                tem.append(',');
            }
            i--;
        }
        tem.reverse();
        System.out.println(tem.toString());
    }
    public static void main(String[] args){
        addComma(999970094);//999,970,094
        addComma(12345);//12,345
    }
}
