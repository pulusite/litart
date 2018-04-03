package leetcode;

/**
 * Created by zhangdong on 2017/7/14.
 */
public class Leet009 {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        Integer y=x;
        String z=y.toString();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < z.length(); i++) {
            sb.append(z.charAt(z.length()-i-1));
        }
        return z.equals(sb.toString());
    }

    public static void main(String[] args) {
        Leet009 leet = new Leet009();
        System.out.println(leet.isPalindrome(-2147447412));
    }
}
