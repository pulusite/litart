package tba.mianshi.suanfa;

import org.junit.Test;

/**
 * Created by zhangdong on 6/4/18.
 */
public class Palindrome_ {
    public boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    @Test
    public void test(){
        System.out.println(isPalindrome("abssssddddba"));
    }
}
