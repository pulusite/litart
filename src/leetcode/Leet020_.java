package leetcode;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by zhangdong on 7/5/17.
 */
public class Leet020_ {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (map.keySet().contains(curr)) {
                stack.push(curr);
            } else if (map.values().contains(curr)) {
                if (!stack.isEmpty() && map.get(stack.peek()) == curr) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Leet020_ leet = new Leet020_();
        String s="{}[()]";
        System.out.println(leet.isValid(s));
    }

}
