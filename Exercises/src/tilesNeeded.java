/*
Discussions
Quảng trường Nhà hát ở thủ đô Berland có hình chữ nhật với kích thước n x m mét. Nhân dịp kỷ niệm thành phố, một quyết định đã được đưa ra để lát Quảng trường bằng những viên bằng đá granit vuông. Mỗi viên đá hình vuông có kích thước a × a. Số lượng viên đá ít nhất cần thiết để lát Quảng trường là bao nhiêu? Nó được phép che phủ bề mặt lớn hơn Quảng trường Nhà hát. Nó không được phép phá vỡ các viên đá. Các cạnh của viên đá phải song song với các cạnh của Quảng trường.
Input Format
3 số nguyên dương n, m, a.
Constraints
1<=n,m,a<=10^9
Output Format
Viết số lượng viên đá cần thiết để lát kín quảng trường.
Sample Input 0
6 6 4
Sample Output
4

 */
public class tilesNeeded {
    public static void main(String[] args){
        int n = 6, m = 6, a= 4;
        int c = (6+4-1)/4; //find length by rounding up number (ceiling).
        int d = (6+4-1)/4; //find width by rounding up number (ceiling).
        System.out.println( c*d);
    }
}
