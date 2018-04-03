package leetcode;

/**
 * Created by zhangdong on 9/26/17.
 */
public class Leet069 {
    public int mySqrt(int x) {
        long r=x;
        while (r*r>x){
            r=(r+x/r)/2;
        }
        return (int) r;
    }

    public static void main(String[] args) {
        Leet069 leet = new Leet069();
        System.out.println(leet.mySqrt(9));
    }
}
