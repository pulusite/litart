package tba.dp.iterator;

/**
 * Created by zhangdong on 2018/6/11.
 */
public class Client {
    public static void main(String[] args) {
        Aggregate aggregate=new ConcreteAggregate();
        aggregate.add("小明");
        aggregate.add("小红");
        aggregate.add("小刚");
        Iterator it=aggregate.iterator();
        while (it.hasNext()){
            String str=(String) it.next();
            System.out.println(str);
        }
    }
}
