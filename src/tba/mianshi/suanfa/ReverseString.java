package tba.mianshi.suanfa;

import org.junit.Test;

/**
 * Created by zhangdong on 6/4/18.
 */
public class ReverseString {
    public String reverse(String s){
        StringBuilder sb=new StringBuilder();
        for (int i = s.length()-1; i >=0 ; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    @Test
    public void test(){
        System.out.println(reverse("abcdefg"));
    }
}
