package tba.dp.behavioral.memento;

/**
 * Created by zhangdong on 2018/11/29.
 */
public class Client {
    public static void main(String[] args) {
        Originator originator=new Originator();
        Caretaker caretaker=new Caretaker();
        originator.setState("ON");
        caretaker.saveMemento(originator.createMemento());
        originator.setState("OFF");
        originator.restoreMemento(caretaker.retrieveMemento());
        System.out.println(originator.getState());
    }
}
