package tba.dp.behavioral.observer.pull;

/**
 * Created by zhangdong on 2018/12/3.
 */
public class ConcreteSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    public void change(String newState){
        state=newState;
        System.out.printf("主题状态为："+state);
        this.notifyObservers();
    }
}
