package tba.dp.structural.composite.security;

/**
 * Created by zhangdong on 2018/12/3.
 */
public class Leaf implements Component{
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr+"_"+name);
    }
}
