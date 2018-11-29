package tba.dp.behavioral.memento;

/**
 * Created by zhangdong on 2018/11/29.
 */
public class Caretaker {
    private Memento memento;

    public Memento retrieveMemento(){
        return this.memento;
    }

    public void saveMemento(Memento memento){
        this.memento=memento;
    }
}
