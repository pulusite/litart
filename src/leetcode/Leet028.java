package leetcode;

/**
 * Created by zhangdong on 2017/7/18.
 */
public class Leet028 {
    public int strStr(String haystack, String needle) {
        if (haystack==null) return -1;
        if (needle==null || needle.isEmpty()) return 0;
        int index = -1;
        for (int i = 0; i <= haystack.length()-needle.length(); i++) {
            if (needle.charAt(0)==haystack.charAt(i)){
                if (needle.equals(haystack.substring(i,i+needle.length()))){
                    return i;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Leet028 leet = new Leet028();
        System.out.println(leet.strStr("aaa","a"));
    }
}
