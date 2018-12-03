package tba.dp.behavioral.observer.push;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangdong on 2018/12/3.
 */
public abstract class Subject {
    private List<Observer> observerList=new ArrayList<>();

    public void attach(Observer observer){
        observerList.add(observer);
        System.out.printf("Attached an observer");
    }

    public void detach(Observer observer){
        observerList.remove(observer);
    }

    public void notifyObservers(String newState){
        for (Observer observer : observerList) {
            observer.update(newState);
        }
    }
}
