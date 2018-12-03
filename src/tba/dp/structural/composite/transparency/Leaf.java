package tba.dp.structural.composite.transparency;

/**
 * Created by zhangdong on 2018/12/3.
 */
public class Leaf extends Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void printStruct(String preStr) {

    }
}
