package leetcode;

/**
 * Created by zhangdong on 2017/12/28.
 */
public class Leet400 {
    public int findNthDigit(int n) {
        int len = 1;
        long count = 9;
        int start = 1;

        while (n > len * count) {
            n -= len * count;
            len += 1;
            count *= 10;
            start *= 10;
        }

        start += (n - 1) / len;
        String s = Integer.toString(start);
        return Character.getNumericValue(s.charAt((n - 1) % len));
    }

    public static void main(String[] args) {
        Leet400 leet = new Leet400();
        System.out.println(leet.findNthDigit(944));
    }
}
