public class isLeapYear {
    public boolean leapYear(int n){
        if(n%400==0){return true;}
        if(n%4==0){
            if(n%100!=0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        isLeapYear t = new isLeapYear();
        System.out.println(t.leapYear(2000));
    }
}
