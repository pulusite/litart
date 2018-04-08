package tba.jihe;

import java.util.Map;
import java.util.HashMap;
import java.util.Random;


/**
 * Created by dongzhang on 4/1/17.
 */
public class HashMap_ {
    public static void main(String[] args) {
        String a = new String("hhh");
        String b = new String("hhh");

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("1","1");
        for (int i = 0; i < 100000000; i++) {
            hm.put(getRandomString(4),getRandomString(1));
        }
        hm.get("2");

    }

    public static String getRandomString(int length) { //length表示生成字符串的长度
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }
}
