package tba.jihe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangdong on 2018/3/7.
 */
public class ForeachAnalyze {
    public static void main(String[] args) {
        Person p1=new Person(1,"mm");
        Person p2=new Person(2,"gg");
        List<Person> list=new ArrayList<>();
        list.add(p1);
        list.add(p2);
        for (Person p: list) {
            p.setAge(22);
            p.setName("xxx");
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getAge());
            System.out.println(list.get(i).getName());
        }
    }

}
