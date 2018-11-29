package tba.dp.behavioral.mediator;

/**
 * Created by zhangdong on 2018/11/29.
 */
public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Meditator meditator) {
        super(meditator);
    }

    public void send(String message){
        meditator.send(message,this);
    }

    public void getMessage(String message){
        System.out.println("同事B得到消息："+message);
    }


}
