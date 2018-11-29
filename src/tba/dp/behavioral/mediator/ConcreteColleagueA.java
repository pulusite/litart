package tba.dp.behavioral.mediator;

/**
 * Created by zhangdong on 2018/11/29.
 */
public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Meditator meditator) {
        super(meditator);
    }

    public void send(String message){
        meditator.send(message,this);
    }

    public void getMessage(String message){
        System.out.println("同事A得到消息："+message);
    }
}
