package tba.dp.creational.prototype.register;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangdong on 2018-12-03.
 */
public class PrototypeManager {
    private static Map<String,Prototype> map=new HashMap<>();

    private PrototypeManager() {
    }

    public synchronized static void setPrototype(String prototypeId,Prototype prototype){
        map.put(prototypeId,prototype);
    }

    public synchronized static void removePrototype(String prototypeId){
        map.remove(prototypeId);
    }

    public synchronized static Prototype getPrototype(String prototypeId) throws Exception{
        Prototype prototype=map.get(prototypeId);
        if (prototype==null){
            throw new Exception("你希望的原型还没有注册或已被销毁");
        }
        return prototype;
    }
}
