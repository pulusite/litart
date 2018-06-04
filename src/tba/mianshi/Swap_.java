package tba.mianshi;

import org.junit.Test;

/**
 * Created by zhangdong on 2018/6/4.
 */
public class Swap_ {
    @Test
    public void test1(){
        int x = 10;
        int y = 20;
        int temp = x;
        x = y;
        y = temp;
    }
    @Test
    public void test2(){
        int x = 10;
        int y = 20;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
    }
    @Test
    public void test3(){
        int x = 10;
        int y = 20;
        x = x + y;
        y = x - y;
        x = x - y;
    }
}
