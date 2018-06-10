package tba.zd;

import org.junit.Test;

/**
 * Created by zhangdong on 6/4/18.
 */
public class _4Thread {
    public static int j=100;

    @Test
    public void test(){
        new Thread(new Runnable(){
            @Override
            public void run() {

            }
        }).start();
    }

}
