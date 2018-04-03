package leetcode;

/**
 * Created by zhangdong on 9/24/17.
 */
public class Leet058 {
    public int lengthOfLastWord(String s) {
        int result = 0;
        if (s == null || s.length() == 0 || s.split(" ").length == 0) {
            return result;
        }
        if (!s.contains(" ")) {
            return s.length();
        }
        boolean lastChar = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (' ' == s.charAt(i) && lastChar) {
                break;
            }
            if (' ' != s.charAt(i)) {
                if (!lastChar) {
                    lastChar = true;
                }
                result += 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Leet058 leet = new Leet058();
        String s = "a ";
        System.out.println(leet.lengthOfLastWord(s));
    }
}
