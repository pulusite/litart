package tba.jihe;

import org.junit.Test;

import java.util.*;

/**
 * Created by dongzhang on 5/16/17.
 */
public class Map_ {

    @Test
    public void test(){
        Map map = new HashMap();
        map.put("1","a");
        map.put("2","b");
        Set keySet=map.keySet();
        //Set<Map.Entry<K,V>> entrySet()
        Set<Map.Entry> entrySet=map.entrySet();


        Iterator it=keySet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        Iterator entryIt=entrySet.iterator();
        while (entryIt.hasNext()){
            System.out.println(entryIt.next());
        }

    }



}
