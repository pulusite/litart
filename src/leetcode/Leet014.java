package leetcode;

/**
 * Created by zhangdong on 7/15/17.
 */
public class Leet014 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0) return "";
        String prefix=strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0){
                prefix=prefix.substring(0,prefix.length()-1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Leet014 leet =  new Leet014();
        String[] strs={"leeds","leets","leetcode","leet"};
        System.out.println(leet.longestCommonPrefix(strs));
    }
}
