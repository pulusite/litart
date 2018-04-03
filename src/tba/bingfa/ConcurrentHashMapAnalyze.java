package tba.bingfa;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by zhangdong on 3/3/18.
 */
public class ConcurrentHashMapAnalyze {
    public static void main(String[] args) {
        ConcurrentHashMap concurrentHashMap=new ConcurrentHashMap();
        concurrentHashMap.put("1","a");
        System.out.println(concurrentHashMap.get("1"));

    }
}
