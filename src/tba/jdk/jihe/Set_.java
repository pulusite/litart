package tba.jdk.jihe;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dongzhang on 5/16/17.
 */
public class Set_ {
    @Test
    public void test(){
        Set hashSet=new HashSet();
        hashSet.add(1);
        hashSet.iterator();
        for(Object o : hashSet){
            System.out.println(o);
        }
        System.out.println();
    }
}
