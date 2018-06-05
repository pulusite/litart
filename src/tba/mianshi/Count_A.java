package tba.mianshi;

import org.junit.Test;

/**
 * Created by zhangdong on 2018/6/5.
 */
public class Count_A {
    @Test
    public void test(){
        String s="AsAffA";
        System.out.println(countA(s));
    }
    public int countA(String s){
        if (s==null || s.length()==0) return 0;
        int count=0;
        if (s.charAt(0)=='A'){
            count++;
        }
        return count+countA(s.substring(1));
    }
    public int countAA(String s){
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if ('A'==s.charAt(i)){
                count++;
            }
        }
        return count;
    }

}
