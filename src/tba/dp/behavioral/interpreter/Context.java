package tba.dp.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangdong on 2018/11/27.
 */
public class Context {
    private Map<Variable,Boolean> map=new HashMap<>();

    public void assign(Variable var, boolean value){
        map.put(var,new Boolean(value));
    }

    public boolean lookup(Variable var) {
        Boolean value=map.get(var);
        if (value==null){
            throw new IllegalArgumentException();
        }
        return value.booleanValue();
    }
}
