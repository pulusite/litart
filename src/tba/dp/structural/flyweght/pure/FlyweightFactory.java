package tba.dp.structural.flyweght.pure;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangdong on 2018/12/3.
 */
public class FlyweightFactory {
    private Map<Character,Flyweight> flyweightMap=new HashMap<>();

    public Flyweight factory(Character state){
        Flyweight flyweight=flyweightMap.get(state);
        if (flyweight==null){
            flyweight=new ConcreteFlyweght(state);
            flyweightMap.put(state,flyweight);
        }
        return flyweight;
    }
}
