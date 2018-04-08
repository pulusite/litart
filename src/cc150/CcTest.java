package cc150;

import java.util.HashMap;

/**
 * Created by zhangdong on 8/20/17.
 */
public class CcTest {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append('c'+2);
        System.out.println(sb);
        HashMap map=new HashMap();
        System.out.println(map.get(1));
        System.out.println(Cc0402.State.Visited);
    }
}
