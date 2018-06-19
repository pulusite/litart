package tba.mianshi;

import org.junit.Test;

/**
 * Created by zhangdong on 2018/6/19.
 */
public class CompressString {
    private String compress(String s){
        if (s==null || s.isEmpty()){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        char last = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++)
        {
            if (s.charAt(i) == last)
            {
                count++;
            }
            else
            {
                sb.append(last).append(count);
                last = s.charAt(i);
                count = 1;
            }
        }
        return sb.append(last).append(count).toString();
    }

    @Test
    public void test(){
        String s="s";
        System.out.println(compress(s));
    }
}
