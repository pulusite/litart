package tba.dp.behavioral.memento;

/**
 * Created by zhangdong on 2018/11/29.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
