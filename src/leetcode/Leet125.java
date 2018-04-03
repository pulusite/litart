package leetcode;

import java.util.Stack;

/**
 * Created by zhangdong on 2018/1/4.
 *
 * 数字0-9   48-57
 * 字母A-Z   65-90
 * 字母a-z   97-122
 */
public class Leet125 {
    public boolean isPalindrome(String s) {
        char[] chs=s.toCharArray();
        int k=0;
        for (int i = 0; i < chs.length; i++) {
            char c=chs[i];
            if (c<'0' || (c>'9'&&c<'A') || (c>'Z' && c<'a') || c>'z'){
                chs[i]=' ';
            }
        }
        String ss=new String(chs).replaceAll(" ","");
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < ss.length(); i++) {
            stack.push(ss.charAt(i));
        }
        while (!stack.isEmpty()){
            if (!stack.pop().toString().equalsIgnoreCase(Character.toString(ss.charAt(k++)))){
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Leet125 leet=new Leet125();
        String s="A man, a plan, a canal: Panama";
        String s1="race a car";
        System.out.println(leet.isPalindrome(s1));
    }
}
