package leetcode;

/**
 * Created by zhangdong on 9/6/17.
 */
public class Leet012 {
    public String intToRoman(int num) {
        String result = null;
        String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for (int i = 0; num != 0; ++i) {
            while (num > value[i]) {
                num -= value[i];
                result += symbol[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Leet012 leet = new Leet012();
        System.out.println(leet.intToRoman(1));
    }

}
