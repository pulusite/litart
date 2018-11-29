package tba.dp.behavioral.iterator;

/**
 * Created by zhangdong on 2018/6/11.
 */
public interface Aggregate {//集合
    void add(Object obj);
    void remove(Object obj);
    Iterator iterator();
}
