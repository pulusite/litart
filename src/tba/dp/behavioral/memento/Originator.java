package tba.dp.behavioral.memento;

/**
 * Created by zhangdong on 2018/11/29.
 */
public class Originator {
    private String state;

    public Memento createMemento(){
        return new Memento(state);
    }

    public void restoreMemento(Memento memento){
        this.state=memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("当前状态："+this.state);
    }
}
