package tba;

import tba.jihe.Person;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by zhangdong on 2017/8/16.
 */
public class TbaTest {
    public void testMap2List(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "AA");
        map.put("2", "BB");
        map.put("3", "CC");
        map.put("4", "DD");

        Collection<String> valueCollection = map.values();
        final int size = valueCollection.size();

        List<String> valueList = new ArrayList<String>(valueCollection);

        String[] valueArray = new String[size];
        map.values().toArray(valueArray);
        for (int i = 0; i < valueArray.length; i++) {
            System.out.println(valueArray[i]);
        }
    }
    public static void main(String[] args) {
        List<Person> list=new ArrayList<>();
        Person p1=new Person(1,"n1");
        Person p2=new Person(2,"n2");
        list.add(p1);
        list.add(p2);
        for (Person p:list) {
            Person person=p;
            person.setAge(99);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }



        System.out.println(new Date());


        String name="张小东";
        System.out.printf(name.replace(""+name.charAt(0),"*"));


        Integer ii=new Integer(0);
        System.out.println(ii.intValue()==0);

        Long i=12349L;
        System.out.println((i+50)/100*100);


        List<String> strs=new ArrayList<>();
        strs.add("12sddfsfsd");
        strs.add("324342sss");
        System.out.println(strs);

        TbaTest tt = new TbaTest();
        tt.testMap2List();
        Long l = new Long(11);
        System.out.println(l.longValue()>10);

    }
}
