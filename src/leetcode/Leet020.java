package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by zhangdong on 12/19/17.
 * Valid Parentheses
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class Leet020 {
    public boolean isValid(String s) {
        if (s==null || s.length()<=1) return false;
        Map<Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr=s.charAt(i);
            if (map.keySet().contains(curr)){
                stack.push(curr);
            }else if (map.values().contains(curr) && !stack.isEmpty()){
                stack.peek();
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
