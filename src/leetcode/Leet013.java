package leetcode;

import java.util.HashMap;

/**
 * Created by zhangdong on 2017/7/14.
 */
public class Leet013 {
    public int romanToInt(String s) {
        //I(1)，V(5)，X(10)，L(50)，C(100)，D(500)，M(1000)  range from 1 to 3999
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int value=map.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (map.get(s.charAt(i)) > map.get(s.charAt(i-1))){
                value=value+map.get(s.charAt(i))-2*map.get(s.charAt(i-1));
            }else {
                value=value+map.get(s.charAt(i));
            }
        }
        return value;
    }

    public static void main(String[] args) {

    }
}
