package tba.jdk.jihe;

import java.util.Iterator;
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

//        System.out.println(System.identityHashCode(a));
//        System.out.println(System.identityHashCode(b));
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());

        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("1","1");
//        hm.put("1","1");
//        for (int i = 0; i < 100000000; i++) {
//            hm.put(getRandomString(4),getRandomString(1));
//        }
//        hm.get("2");

        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");

        //第一种：普遍使用，二次取值
        System.out.println("通过Map.keySet遍历key和value：");
        for (String key : map.keySet()) {
            System.out.println("key= "+ key + " and value= " + map.get(key));
        }



        //第二种
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        Iterator<Map.Entry<String,String>> ite=map.entrySet().iterator();
        while (ite.hasNext()){
            Map.Entry<String,String> entry=ite.next();
            System.out.println(entry.getKey()+entry.getValue());
        }

        //第三种：推荐，尤其是容量大时
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //第四种
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for (String v : map.values()) {
            System.out.println("value= " + v);
        }



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
