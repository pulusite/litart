package leetcode;

/**
 * Created by zhangdong on 2018/10/18.
 */
public class E029_Divide_Two_Integers {
    //不对，重新写
    public int divide(int dividend, int divisor) {
        if (divisor==0 || (dividend == Integer.MIN_VALUE && divisor == -1))
            return Integer.MAX_VALUE;
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        long  dvd = Math.abs(dividend);
        long  dvs = Math.abs(divisor);
        int res = 0;
        while (dvd >= dvs) {
            long temp = dvs, multiple = 1;
            while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            dvd -= temp;
            res += multiple;
        }
        return sign == 1 ? res : -res;
    }
}
