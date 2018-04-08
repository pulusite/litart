package pointacre;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by dongzhang on 11/2/17.
 * Google面试题
 *  给一个化学式，比如H2O(Ca(OH)2)3，一个装元素的字典，统计每个元素个数， 输出一个Map<String, Integer>
 写完问了下时间和空间复杂度，然后闲聊了一会，我用递归做的，感觉略麻烦，小哥说用stack做好一点
 这道题是Codewars上的Molecule to atoms
 */
public class Acre003 {
    public static Map<String,Integer> getAtoms(String s) {
        if (s.isEmpty() || s == null || s.toLowerCase().equals(s)) {
            throw new IllegalArgumentException();
        }
        Map<String, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        Stack<Character> signStack = new Stack<>();
        int count = 0;
        char prev = '?';
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                    count = Integer.valueOf(c - '0');
                while (i > 0 && Character.isDigit(s.charAt(i - 1))) {
                    count = count + Integer.valueOf(s.charAt(i - 1) - '0') * 10;
                    i--;
                }
                if (stack.isEmpty()) {
                    stack.push(count);
                } else {
                    stack.push(count * stack.peek());
                }
            } else if (c == ')' || c == ']' || c == '}') {
                if (c == ')') signStack.push('(');
                if (c == ']') signStack.push('[');
                if (c == '}') signStack.push('{');
            } else if (c == '(' || c == '[' || c == '{') {
                if (signStack.isEmpty() || signStack.pop() != c)
                throw new IllegalArgumentException();
                if (!stack.isEmpty()) stack.pop();
            } else if (Character.isLowerCase(c) || Character.isUpperCase(c)) {
                String atom = Character.isUpperCase(c) ? c + "" : s.substring(i - 1, i + 1);
//                map.put(atom, map.getOrDefault(atom, 0) + ((stack.isEmpty()) ? 1 : stack.peek()));
                if (Character.isDigit(prev)) stack.pop();
                if (Character.isLowerCase(c)) i--;
            }
            prev = c;
        }
        if (!signStack.isEmpty()) throw new IllegalArgumentException();
        return map;
    }

    public static void main(String[] args) {
        System.out.println(getAtoms("Mo(CO)6")); // return Mo:1 C:6 O:6
        System.out.println(getAtoms("Mg(OH)2")); // return ["Mg": 1, "O": 2, "H": 2]. more info on 1point3acres.com
        System.out.println(getAtoms("K4[ON(SO3)2]2")); // return ["K": 4, "O": 14, "N": 2, "S": 4]
        System.out.println(getAtoms("H2O(Ca(OH)2)3")); // return [H:8, O:7, Ca:3]
        System.out.println(getAtoms("C6H12O6")); // C:6 H:12 O:6
        System.out.println(getAtoms("As2{Be4C5[BCo3(CO2)3]2}4Cu5")); // {Cu=5, B=8, As=2, C=44, Be=16, Co=24, O=48}
        System.out.println(getAtoms("Mg(OH")); // throw new IllegalArgumentException()
        System.out.println(getAtoms("MgOH)2")); // throw new IllegalArgumentException()
        System.out.println(getAtoms("Mg(OH]2")); // throw new IllegalArgumentException()
        System.out.println(getAtoms("Au5(C2H5[OH)3Li]3")); // throw new IllegalArgumentException()
        System.out.println(getAtoms("pie")); // throw new IllegalArgumentException()
    }
}
