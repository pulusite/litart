package tba.keywords;

import org.junit.Test;

/**
 * Created by zhangdong on 2018/5/23.
 */
public class Transfer_Value_Ref {
    public void change(int b) {
        b = 7;
    }

    @Test
    public void testBasic() {
        int a = 9;
        change(a);
        System.out.println(a);
    }
}
